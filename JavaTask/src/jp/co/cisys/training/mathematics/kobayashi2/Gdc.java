package jp.co.cisys.training.mathematics.kobayashi2;

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

		int max = 0;

		for (;;) {

			max = b % a;

			if (max != 0) {

				b = a;
				a = max;

			} else {

				max = a;

				break;
			}

		}

		return max;
	}

	/**
	 * <pre>最小公倍数を求める</pre>
	 */
	public int getLcm() {

		int min = (a * b) / getGcd();

		return min;

	}
}
