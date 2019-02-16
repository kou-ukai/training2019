package jp.co.cisys.training.playingcard.ukai;

/**
 * トランプのカードを表す抽象クラスです。
 */
public abstract class Card {

	/**
	 * 値
	 */
	private int value;

	/**
	 * 値の呼び方（A, 2, ..., 10, J, Q, K）
	 */
	private String name;

	/**
	 * 絵柄（クラブ、ダイヤ、ハート、スペード）
	 */
	private String suit;


	public Card(int value, String suit) {
		this.value = value;
		this.suit = suit;

		switch(value) {
		case 1:
			name = "A";
			break;
		case 11:
			name = "J";
			break;
		case 12:
			name = "Q";
			break;
		case 13:
			name = "K";
			break;
		default:
			name = String.valueOf(value);
		}
	}

	/**
	 * 表示内容を取得します。
	 * @return
	 */
	public String getDisplay() {
		return suit + "の" + name;
	}

	/**
	 * 値を取得します。
	 * @return
	 */
	public int getValue() {
		return this.value;
	}

	/**
	 * 絵柄を取得します。
	 * @return
	 */
	public String getSuit() {
		return this.suit;
	}
}
