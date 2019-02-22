package jp.co.cisys.training.mathematics.ikeda;

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
		/**
		 *  最大公約数の求め方
		 *  1.数値xを数値yで割った余りを求める。
		 *  2.数値yを1.で求めた余りで割る。
		 *  3.1.で求めた余りを2.で求めた余りで割る・・・というのを余りが0になるまで繰り返す。
		 *  4.余りが0になった時点の「割る数」が最大公約数。
		 */
		int x = b;
		int y = a;
		while (x % y != 0) {	// x / yの余りが0になるまで繰り返す。
			int tmp = x;			// 変数tmpにxを退避
			x = y;					// xにyを退避
			y = tmp % x;			// yにtmp(中身はx) / x(中身はy)の余りをセット
		}

		return y;	// x / yの余りが0になった時のyが最大公約数。
	}

	/**
	 * <pre>最小公倍数を求める</pre>
	 */
	public int getLcm() {
		// 2つの数値の積(a * b)を最大公約数(getGcd())で割った結果が最小公倍数。
		return a * b / getGcd();
	}
}
