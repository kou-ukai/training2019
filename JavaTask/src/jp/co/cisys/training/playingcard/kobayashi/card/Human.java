package jp.co.cisys.training.playingcard.kobayashi.card;

import java.util.Random;

public class Human {
	
	//カードを取得する枚数
	final static int Get=5;
	
	public static void main(String[]args) {
		
		//カードクラスのインスタンス生成
		Card card=new Card();
		
		//作成及びシャッフル
		card.yama();
		
		//手札作成用の変数
		String[] hand= new String[Get];
		
		//手札取得用ランダム変数用意
		Random rand=new Random(); 
		
		//山札からカードを取得（指定された枚数まで）
		for(int i=0;i<Get;i++) {
			
			
			int randomNumeber= rand.nextInt(card.sizeYama());
			
			hand[i]=card.getYama(randomNumeber);
			
			card.removeYama(randomNumeber);
		}
		
		for(String c:hand) {
			
			System.out.println(c);
			
		}
		
	}

}
