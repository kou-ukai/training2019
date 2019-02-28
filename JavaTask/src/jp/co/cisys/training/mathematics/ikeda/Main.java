package jp.co.cisys.training.mathematics.ikeda;

public class Main {

	public static void main(String[] args) {

		int[] numList = {912, 12, 44, 122};
		int gdc = numList[0];
		int lcm = numList[0];
		for (int i = 1; i < numList.length; i++) {
			// 最大公約数
			int[] ret = moreBThenA(gdc, numList[i]);
			gdc = new Gdc(ret[0], ret[1]).getGcd();

			// 最小公倍数
			ret = moreBThenA(lcm, numList[i]);
			lcm = new Gdc(ret[0], ret[1]).getLcm();
		}

		System.out.println(gdc);
		System.out.println(lcm);
	}

	public static int[] moreBThenA(int a, int b) {
		int[] ret = new int[2];
		ret[0] = Math.max(a, b);
		ret[1] = Math.min(a, b);
		return ret;
	}

}
