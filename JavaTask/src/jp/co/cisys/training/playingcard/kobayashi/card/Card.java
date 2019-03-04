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
			System.out.println(types + "のA");
			break;

		case 11:
			System.out.println(types + "のJ");
			break;

		case 12:
			System.out.println(types + "のQ");
			break;

		case 13:
			System.out.println(types + "のK");
			break;

		default:

			System.out.println(types + "の" + num);

		}

	}

	/**ダイヤの合計　算出用メソッド
	 * @return　ダイヤの合計
	 */
	public int numDiamond() {

		if (types.equals("ダイヤ")) {

			return num;

		}

		return 0;

	}

}
