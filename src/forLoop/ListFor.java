package forLoop;

import java.util.ArrayList;

public class ListFor {
	public static void main(String[] args) {
		//ArrayList<String> list = new ArrayList<String>();
		ArrayList<String> list = new ArrayList<String>();
		int cnt = 0;
		
		list.add("10");
		list.add("20");
		list.add("30");
		list.add("40");
		list.add("50");
		
		for(String str : list){
			System.out.println("list의"+" "+ (cnt++)+ "번째 값 : " + str);
		}
	}
}
