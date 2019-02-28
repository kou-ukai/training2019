package jp.co.cisys.training.mathematics.kobayashi2;

import jp.co.cisys.training.mathematics.kobayashi.Gdc;

public class Main {

	public static void main(String[] args) {

		int[] nums = { 9, 12, 48, 3};
		
		int maxGdc=0;// 最大公約数
		int minGdc=0;//最少公倍数
		
		for (int i = 1; i < nums.length; i++) {

			switch(i) {
				case 1:
					int maxNum=Math.max(nums[0],nums[i]);
					int minNum=Math.min(nums[0],nums[i]);

					Gdc gdc = new Gdc(maxNum, minNum);	

					maxGdc = gdc.getGcd();
					minGdc=gdc.getLcm();
					break;

		        //2回目以降１回目の数値を元に計算を行う為
                default:
                	
                	maxNum=Math.max(maxGdc, nums[i]);
    				minNum=Math.min(maxGdc,nums[i]);

                	Gdc max = new Gdc(maxNum, minNum);
					Gdc min = new Gdc(minGdc,nums[i]);
					
					maxGdc=max.getGcd();
					minGdc=min.getLcm();
					break;

			}

		}

		System.out.println("最大公約数" + maxGdc);
		System.out.println("最小公倍数" + minGdc);

	}

}
