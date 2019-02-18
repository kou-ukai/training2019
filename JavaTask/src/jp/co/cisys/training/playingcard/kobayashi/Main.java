package jp.co.cisys.training.playingcard.kobayashi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

	final static int card = 13;

	public static void main(String[] args) {

		List<String> math = new ArrayList();

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
		
		//選択カード用　type 種類　math 数
		String[] type=new String[5];
		String[] math=new String[5];
		
		
		//5枚選択ループ
		for(int count=0;count<=5;count++){
			
			Collections.shuffle(type);
			Collections.shuffle(math);

			type[count]=type.get(count);
			math[count]=math.get(count);
			
			
			//被り確認ループ
			do{
				boolean flag=false;
			
			        for(int time=type.length;time>0;time--){	
				
				if(type[time].equals(type[time])&&math[time].equals(math[time]){
					
					 Collections.shuffle(type);
			　　　　　　　　  Collections.shuffle(math);

					type[count]=type.get(count);
		                	math[count]=math.get(count);
			
					
					flag=ture;
					}
				}
			}while(flag==false)	
			
		
		
		}
		//出力
		for(int count=0;count<=5;count++){
			
		System.out.println(type[count]+"の"+math[count]);	
			
		}	
	}

}
