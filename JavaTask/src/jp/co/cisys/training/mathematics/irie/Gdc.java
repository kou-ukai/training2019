package jp.co.cisys.training.mathematics.irie;

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
		int max = numList[0];  //最大公約数
		for (int i = 0; i < numList.length; i++) {
			max=getGcd(numList[i],max);

		}

		return max;

	}
	public int getGcd(int num1,int num2) {

			while (num2% num1 > 0) {
				int gdc = num2% num1;
				num2 = num1;
				num1 = gdc;

			}

		return num1;
	}

	/**
	 * <pre>最小公倍数を求める</pre>
	 */
	public int getLcm() {
		// ここを記述する。
		int min = numList[0];  //最小公倍数
		for (int i = 0; i < numList.length; i++) {
			min=min*numList[i]/getGcd(min,numList[i]);
		}

		return min;

	}
}
