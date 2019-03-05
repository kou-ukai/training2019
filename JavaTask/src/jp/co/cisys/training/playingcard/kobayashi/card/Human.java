package jp.co.cisys.training.playingcard.kobayashi.card;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Human {

	public static void main(String[] args) {

		//Card型のリストを作成
		List<Card> cards = new ArrayList<>();
		//手札作成
		List<Card> hands=new ArrayList<>();

		//各リスト作成
		for (int i = 1; i < 13; i++) {
			cards.add(new Heart(i));
		}
		for (int i = 1; i < 13; i++) {
			cards.add(new Club(i));
		}
		for (int i = 1; i < 13; i++) {
			cards.add(new Diamond(i));
		}
		for (int i = 1; i < 13; i++) {
			cards.add(new Spade(i));
		}
		
		//中身をシャッフル
		Collections.shuffle(cards);

		//手札の取得+開示
		for (int i = 0; i < 5; i++) {

			cards.get(i).printCard();
			hands.add(cards.get(i));

		}
		
		//ダイヤ合計格納用　変数
		int sumDiamond=0;
		
		//合計算出用　ループ
		for(Card o:hands) {
			
			if( o instanceof Diamond ) {
				sumDiamond+=o.getNum();
			}
			
		}
		
		//ダイヤ合計出力
		System.out.println("ダイヤの合計数値は："+sumDiamond);
		
		

	}

}
