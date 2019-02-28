package jp.co.cisys.training.mathematics.irie;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		// 任意の2つの数字をセットする
		int[] a = { 15, 12, 70, 156 };
		int gdc5 = a[0];
		int lcm = a[0];
		for (int i = 0; i < a.length ; i++) {
			// a <= bにする
			if (gdc5 > a[i]) {
				int tmp = a[i];
				a[i] =gdc5;
				gdc5 = tmp;
			}
			Gdc gdc1 = new Gdc(gdc5, a[i]);
			gdc5= gdc1.getGcd();
			if (lcm > a[i]) {
				int tmp = a[i];
				a[i] =lcm;
				lcm = tmp;
			}
			Gdc gdc2 = new Gdc(lcm, a[i]);
			lcm = gdc2.getLcm();
		}

		System.out.println(gdc5);
		System.out.println(lcm);
	}

}
