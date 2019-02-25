package jp.co.cisys.training.playingcard.kobayashi.card;

import java.util.ArrayList;
import java.util.Collections;

public class Card {

	//山用のリスト作成
	private ArrayList<String> yama = new ArrayList<>();
	
	//カードの種類名作成
	final  String[] Type= {"クローバー","ダイヤ","スペード","ハート"};
		
	//カードの数字の種類
	final String[] Numbers = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
    
	/**
	 * コンストラクタ
	 */
	public Card() {

	}
	
	/**
	 * 山を作成+シャッフル
	 */
	public void yama() {
		
		for(String a:Type) {
			
			for(String b:Numbers) {
				
			yama.add(a+b);
			
			}
			
		}

		Collections.shuffle(yama);
		
	}
	
	public int sizeYama() {
		
		int size=0;
		
		size=yama.size();
		
		return size;
	}
	
	
	

	public String getYama(int hand) {
		
		String hands;
		
		hands=yama.get(hand);
		
		return hands;
	}
	
	public void removeYama(int hand) {
		
		yama.remove(hand);
		
	}
	
}
