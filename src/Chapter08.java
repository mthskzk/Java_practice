
public class Chapter08 {
	public static void main(String[] args) {
		int whi=1;
		while(whi<5) {
			System.out.println(whi*whi);
			whi++;
		}
		int array[] = {1,2,3,4};
		for (int i=0; i<array.length; i++) {
			System.out.println(array[i]);
		}
		
		for(int i:array) {
			if(i%2 == 0) {
				continue;
			}
			System.out.println(i);
		}
	}

}
