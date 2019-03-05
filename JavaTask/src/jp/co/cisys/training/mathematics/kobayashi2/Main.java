package jp.co.cisys.training.mathematics.kobayashi2;

import jp.co.cisys.training.mathematics.kobayashi.Gdc;

public class Main {

	public static void main(String[] args) {

		int[] nums = { 9, 12, 3, 48 };

		int gcd = nums[0];// 最大公約数
		int lcm = nums[0];//最少公倍数

		//配列の要素分ループ
		for (int i = 1; i < nums.length; i++) {

			//数値の入れ替え
			int maxNum = Math.max(gcd, nums[i]);
			int minNum = Math.min(gcd, nums[i]);

			//max最大公約数　min最小公倍数
			Gdc max = new Gdc(maxNum, minNum);
			Gdc min = new Gdc(lcm, nums[i]);

			//最大公約数と最小公倍数の取得
			gcd = max.getGcd();
			lcm = min.getLcm();

		}

		//結果の出力
		System.out.println("最大公約数" + gcd);
		System.out.println("最小公倍数" + lcm);

	}

}
