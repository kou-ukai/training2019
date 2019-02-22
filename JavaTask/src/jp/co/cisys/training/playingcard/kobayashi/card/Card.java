package jp.co.cisys.training.playingcard.kobayashi.card;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;

public class Card {

	
	
	//カードの種類名作成
	final ArrayList<String> Type=new ArrayList<>(Arrays.asList("クローバー","ダイヤ","スペード","ハート"));
		
	//カードの数字の種類
	final ArrayList<String> Numbers = new ArrayList<>(	Arrays.asList("A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"));
    
	/**
	 * コンストラクタ
	 */
	public Card() {

	}
	
	/**
	 * 山を作成
	 */
	public void yama() {
		
		//山札用の変数用意
		ArrayList<Integer> yama=new ArrayList<> (Numbers.size()*Type.size());
		
		for(int count=0;count<yama.size();count++) {
			
			yama.add(count+1);
			
		}

		Collections.shuffle(yama);
		
		

	}

	public 
	
	
	
	
	
	
	
	
	
	
}
