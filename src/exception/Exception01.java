package exception;

public class Exception01 {
	public static void main(String[] args) {
		System.out.println("100÷0は?");
		//0で割り算するので、例外処理
		int result = 100 / 0;
		//例外が発生した以降の処理は実行されない
		System.out.println("計算結果" + result);
		System.out.println("プログラム終了");
	}

}
