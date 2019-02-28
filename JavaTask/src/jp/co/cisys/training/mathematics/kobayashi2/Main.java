package jp.co.cisys.training.mathematics.kobayashi2;

import jp.co.cisys.training.mathematics.kobayashi.Gdc;

public class Main {

	public static void main(String[] args) {

		int[] num = { 12, 3, 9,48 };

		int maxGdc = 0;

		int minGdc=0;

		for (int i = 0; i < num.length - 1; i++) {

			//if-elseを無くす形で作り直す
			if (maxGdc == 0) {

				if (num[i] > num[i + 1]) {

					int tmp = num[i];

					num[i] = num[i + 1];

					num[i + 1] = tmp;
				}

				Gdc gdc = new Gdc(num[i], num[i + 1]);

				maxGdc = gdc.getGcd();
				minGdc=gdc.getLcm();

			} else {
				if (maxGdc > num[i + 1]) {

					int tmp = maxGdc;

					maxGdc = num[i + 1];

					num[i + 1] = tmp;

				}
				Gdc gdc = new Gdc(maxGdc, num[i + 1]);
                Gdc lcm = new Gdc(minGdc,num[i+1]);
				maxGdc = gdc.getGcd();
				minGdc=lcm.getLcm();

			}

		}

		System.out.println("最大公約数" + maxGdc);
		System.out.println("最小公倍数" + minGdc);


	}

}
