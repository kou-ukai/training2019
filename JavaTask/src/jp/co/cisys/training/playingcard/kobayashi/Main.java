package jp.co.cisys.training.playingcard.kobayashi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

	final static int card = 13;

	public static void main(String[] args) {
		
		//トランプ数字用リスト
		List<String> math = new ArrayList();

		//トランプ数字用リスト
		List<String> type = new ArrayList<>(Arrays.asList("ハート", "ダイヤ", "スペード","クラブ"));
		
		//数字の作成
		for (int time = 1; time <= card; time++) {
			
			//トランプの表記条件
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
		String[] typeOut=new String[];
		String[] mathOut=new String[];
		
		
		//5枚選択ループ
		for(int count=0;count<=5;count++){
			
			//中身シャッフル
			Collections.shuffle(type);
			Collections.shuffle(math);

			//出力用変数に格納
			typeOut[count]=type.get(count);
			mathOut[count]=math.get(count);
			
			
			//被り確認ループ
			do{
				boolean flag=false;
			
			        for(int time=typeOut.length;time>0;time--){	
				
				//被りの条件
				if(typeOut[time].equals(typeOut[time])&&mathOut[time].equals(mathOut[time]){
					
					//再度シャッフル
					 Collections.shuffle(type);
			　　　　　　　　  Collections.shuffle(math);

					//再度取得
					typeOut[count]=type.get(count);
		                	mathOut[count]=math.get(count);
			
					flag=ture;
				
					}
				}
			}while(flag==false);	
			
		
		
		}
		//出力
		for(int count=0;count<=5;count++){
			
		System.out.println(typeOut[count]+"の"+mathOut[count]);	
			
		}	
	}

}
