package jp.co.cisys.training.mathematics.irie;

public class Gdc {

	private int a;
	private int b;

	/**
	 * <pre>コンストラクタ</pre>
	 */
	public Gdc(int a, int b) {
		this.a = a;
		this.b = b;
	}

	/**
	 * <pre>最大公約数を求める</pre>
	 */
	public int getGcd() {
		// ここを記述する。;
		int number1 = b;
		int number2 = a;
		for(;number1%number2>0;) {
			int gdc = number1 % number2;
		    number1 = number2;
			number2 = gdc;

		}
		return number2;

	}

	/**
	 * <pre>最小公倍数を求める</pre>
	 */
	public int getLcm() {
		// ここを記述する。
		int lcm = a * b / getGcd();
		return lcm;

	}
}
