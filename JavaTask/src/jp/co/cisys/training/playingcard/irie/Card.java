package jp.co.cisys.training.playingcard.irie;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Card {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String[] marks = { "スペード", "ハート", "クローバー", "ダイヤ" };
		String[] numbers = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };
		List<String> markList = Arrays.asList(marks);
		List<String> numList = Arrays.asList(numbers);
		Collections.shuffle(numList);
		for (int i = 0; i < 5; i++) {
			Collections.shuffle(markList);
			System.out.println(markList.get(0) + "の" + numList.get(i));

		}


	}

}
