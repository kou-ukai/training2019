package jp.co.cisys.training.playingcard.irie;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		List<Card> cardList = new ArrayList<Card>();
		for (int i = 1; i <= 13; i++) {
			cardList.add(new Card(i, "スペード"));
		}
		for (int i = 1; i <= 13; i++) {
			cardList.add(new Card(i, "ハート"));
		}
		for (int i = 1; i <= 13; i++) {
			cardList.add(new Card(i, "クローバー"));
		}
		for (int i = 1; i <= 13; i++) {
			cardList.add(new Card(i, "ダイヤ"));
		}

		Collections.shuffle(cardList);

		for (int i = 0; i < 5; i++) {
			cardList.get(i).printCard();

		}

	}

}
