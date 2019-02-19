package jp.co.cisys.training.playingcard.irie;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Card {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String[] mark = { "スペード", "ハート", "クローバー", "ダイヤ" };
		String[] number = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };
		List<String> list = Arrays.asList(mark);
		List<String> numlist = Arrays.asList(number);
		Collections.shuffle(numlist);
		for (int i = 0; i < 5; i++) {
			Collections.shuffle(list);
			System.out.println(list.get(0) + "の" + numlist.get(i));

		}


	}

}
