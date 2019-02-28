package jp.co.cisys.training.playingcard.irie;

public class Card {
	private int number; //カードの数字
	private String mark; //カードのマーク

	public Card(int number, String mark) {
		this.number = number;
		this.mark = mark;
	}

	public void printCard() {
		String name;
		//数字の呼び方を変え、マークと数字を表示
		if (number == 1) {
			name = "A";
			System.out.println(mark + "の" + name);
		} else if (number == 11) {
			name = "J";
			System.out.println(mark + "の" + name);
		} else if (number == 12) {
			name = "Q";
			System.out.println(mark + "の" + name);
		} else if (number == 13) {
			name = "K";
			System.out.println(mark + "の" + name);
		} else {
			System.out.println(mark + "の" + number);
		}

	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getMark() {
		return mark;
	}

	public void setMark(String mark) {
		this.mark = mark;
	}

}
