package jp.co.cisys.training.mathematics.irie;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		// 任意の2つの数字をセットする
		int a = 15;
		int b = 12;

		// a <= bにする
		if (a > b) {
			int tmp = a;
			a = b;
			b = tmp;
		}

		Gdc gdc = new Gdc(a, b);

		System.out.println(gdc.getGcd());
		System.out.println(gdc.getLcm());
	}

}
