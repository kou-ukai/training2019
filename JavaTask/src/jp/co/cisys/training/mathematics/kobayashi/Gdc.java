package jp.co.cisys.training.mathematics.kobayashi;

public class Gdc {

	private int[] numList;

	/**
	 * <pre>コンストラクタ</pre>
	 */
	public Gdc(int[] numList) {
		this.numList = numList;
	}

	/**
	 * <pre>最大公約数を求める</pre>
	 */
	public int getGcd() {

		int max = numList[0];

		for (int i = 1; i < numList.length; i++) {

			max = getGcd(max, numList[i]);

		}

		return max;
	}

	/**
	 * <pre>最小公倍数を求める</pre>
	 */
	public int getLcm() {

		int ansLcm = numList[0];

		for (int i = 1; i < numList.length; i++) {

			ansLcm = (ansLcm * numList[i]) / getGcd(ansLcm, numList[i]);

		}

		return ansLcm;

	}

	public int getGcd(int num1, int num2) {

		while (num1 % num2 != 0) {

			int tmp = num2;

			num2 = num1;

			num1 = tmp % num2;

		}

		return num2;
	}

}
