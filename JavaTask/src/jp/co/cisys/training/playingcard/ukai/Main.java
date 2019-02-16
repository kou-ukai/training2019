package jp.co.cisys.training.playingcard.ukai;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * メインルーチンクラスです。
 *
 */
public class Main {

	private static final int SIZE = 13;

	/**
	 * 山札
	 */
	private List<Card> yamaCards;

	/**
	 * 手札
	 */
	private List<Card> teCards;

	public static void main(String[] args) {

		Main main = new Main();
		main.start();
	}

	public Main() {
		yamaCards = new ArrayList<>();
		teCards = new ArrayList<>();
		init();
	}

	/**
	 * 初期処理です。
	 */
	private void init() {

		// クラブのカードを生成
		for(int i = 0; i < SIZE; i++) {
			yamaCards.add(new Club(i + 1));
		}
		// ダイヤのカードを生成
		for(int i = 0; i < SIZE; i++) {
			yamaCards.add(new Diamond(i + 1));
		}
		// ハートのカードを生成
		for(int i = 0; i < SIZE; i++) {
			yamaCards.add(new Heart(i + 1));
		}
		// スペードのカードを生成
		for(int i = 0; i < SIZE; i++) {
			yamaCards.add(new Spade(i + 1));
		}

		// 山札をシャッフル
		Collections.shuffle(yamaCards);
	}

	/**
	 * 開始処理です。
	 */
	public void start() {

		// カードを5枚引く
		for(int i = 0; i < 5; i++) {
			// カードを引く
			Card card = yamaCards.remove(i);

			// 手札に加える
			teCards.add(card);
		}

		// 引いたカードの表示
		for(Card card : teCards) {
			System.out.println(card.getDisplay());
		}

	}

}
