package jp.co.cisys.training.playingcard.kobayashi.card;

/**
 * @author cis
 *
 */
public class Card {

	private int num;//数字
	private String types;//種類

	/**
	 * コンストラクタ
	 */
	public Card(int num, String types) {

		this.num = num;
		this.types = types;

	}

	/**
	 * カードを出力
	 */
	public void printCard() {

		switch (num) {

		case 1:
			System.out.println(types + "A");
			break;

		case 11:
			System.out.println(types + "J");
			break;

		case 12:
			System.out.println(types + "Q");
			break;

		case 13:
			System.out.println(types + "K");
			break;

		default:

			System.out.println(types + num);

		}

	}

}
