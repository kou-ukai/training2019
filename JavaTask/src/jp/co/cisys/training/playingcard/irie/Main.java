package jp.co.cisys.training.playingcard.irie;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		List<Card> cardList = new ArrayList<Card>(); //山札作成

		int total = 0; //手札のダイヤの数字の合計
		//cardListの中にそれぞれのマークの1～13のカードを格納する
		for (int i = 1; i <= 13; i++) {
			Card card = new Club(i);
			cardList.add(card);
		}
		for (int i = 1; i <= 13; i++) {
			Card card = new Dia(i);
			cardList.add(card);
		}
		for (int i = 1; i <= 13; i++) {
			Card card = new Heart(i);
			cardList.add(card);
		}
		for (int i = 1; i <= 13; i++) {
			Card card = new Spade(i);
			cardList.add(card);
		}
		//cardListをシャッフルする
		Collections.shuffle(cardList);
		//山札の上から5枚を引き、それを表示する
		for (int i = 0; i < 5; i++) {

			//引いたカードのダイヤの数字を足す
			if (cardList.get(i) instanceof Dia) {
				total += cardList.get(i).getNumber();
			}

			cardList.get(i).printCard();

		}
		System.out.println("手札のダイヤの数字の合計:" + total);

	}

}
