package jp.co.cisys.training.mathematics.irie;

public class Main {

	public static void main(String[] args) {
		int[] numList = {108, 36, 54, 90};
		Gdc gdc = new Gdc(numList);
		System.out.println(gdc.getGcd());
		System.out.println(gdc.getLcm());
	}

}
