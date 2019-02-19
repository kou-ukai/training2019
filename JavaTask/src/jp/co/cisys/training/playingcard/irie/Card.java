package jp.co.cisys.training.playingcard.irie;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Card {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String[][] card = { { "スペード", "ハート", "クローバー", "ダイヤ" },
				{ "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13" } };
		List<String[]> list = Arrays.asList(card);
		Collections.shuffle(list);
		for (int i = 0; i < 5; i++) {
			System.out.print(list.get(i));
		}

	}

}


