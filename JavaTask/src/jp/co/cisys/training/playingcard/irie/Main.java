package jp.co.cisys.training.playingcard.irie;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		List<Card> cardList = new ArrayList<Card>(); //山札作成
		
		//cardListの中にそれぞれのマークの1～13のカードを格納する
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
		//cardListをシャッフルする
		Collections.shuffle(cardList);
		//山札の上から5枚を引き、それを表示する
		for (int i = 0; i < 5; i++) {
			cardList.get(i).printCard();

		}

	}

}
