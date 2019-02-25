package jp.co.cisys.training.playingcard.kobayashi.card;

public class Human {

	//カードを取得する枚数
	final static int Get = 52;

	public static void main(String[] args) {

		//カードクラスのインスタンス生成
		Card card = new Card();

		//作成及びシャッフル
		card.yama();

		//手札作成用の変数
		String[] hand = new String[Get];

		//山札からカードを取得（指定された枚数まで）
		for (int i=Get;i>0;i--) {

			hand[i-1] = card.getYama(i);
			card.removeYama(i);

		}

		int i=0;
		//カードを公開
		for (String c : hand) {

		 i++;
			System.out.println(i+c);

		}

	}

}
