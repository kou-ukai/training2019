package jp.co.cisys.training.mathematics.irie;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		// 任意の数の数字をセットする
		int[] numbers = { 15, 12, 70, 156 };
		int max = numbers[0]; //最大公約数
		int min = numbers[0]; //最小公倍数

		for (int i = 0; i < numbers.length; i++) {
			// max <= numbers[i]にする
			if (max > numbers[i]) {
				int tmp = numbers[i];
				numbers[i] = max;
				max = tmp;
			}
			Gdc gdc1 = new Gdc(max, numbers[i]);
			max = gdc1.getGcd(); //最大公約数を求めてmaxに代入

			// min <= numbers[i]にする
			if (min > numbers[i]) {
				int tmp = numbers[i];
				numbers[i] = min;
				min = tmp;
			}
			Gdc gdc2 = new Gdc(min, numbers[i]);
			min = gdc2.getLcm(); //最小公倍数を求めてminに代入
		}

		System.out.println(max);
		System.out.println(min);
	}

}
