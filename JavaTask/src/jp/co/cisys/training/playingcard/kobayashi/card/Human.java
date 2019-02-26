package jp.co.cisys.training.playingcard.kobayashi.card;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Human {

	//カードの種類名作成
	final static String[] Type = { "クローバー", "ダイヤ", "スペード", "ハート" };

	public static void main(String[] args) {

		//オブジェクト型のリストを作成
		List<Card> card = new ArrayList<>();

		//リストにCardクラスのインスタンスを格納
		for (String str : Type) {

			for (int i = 1; i <= 13; i++) {

				//数字種類とカード種類
				card.add(new Card(i, str));

			}

		}

		//中身をシャッフル
		Collections.shuffle(card);

		for (int i = 0; i < 5; i++) {

			card.get(i).printCard();

		}

	}

}
