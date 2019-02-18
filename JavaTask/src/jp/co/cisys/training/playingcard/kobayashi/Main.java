package jp.co.cisys.training.playingcard.kobayashi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

	final static int card = 13;

	public static void main(String[] args) {

		ArrayList<String> math = new ArrayList();

		List<String> type = new ArrayList<>(Arrays.asList("ハート", "ダイヤ", "スペード","クラブ"));

		for (int time = 1; time <= card; time++) {

			if (time == 1) {

				math.add("A");

			} else if (time > 1 && time < 11) {

				math.add(String.valueOf(time));

			} else if (time == 11) {

				math.add("J");

			} else if (time == 12) {

				math.add("Q");

			} else if (time == 13) {

				math.add("K");

			}

		}
		
		

		
		Collections.shuffle(type);
		Collections.shuffle(math);

		System.out.println(type+math);

	}

}
