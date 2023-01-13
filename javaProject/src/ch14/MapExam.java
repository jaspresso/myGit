package ch14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class MapExam {
	public static void main(String[] args) {
		// List : 순서대로 저장, Map : 순서가 없음
		//Map<Key자료형,value자료형>
		Map<String,String> map=new HashMap<>();
		map.put("한국", "서울"); //맵.put(key,value)
		System.out.println(map.get("한국"));
		map.put("일본", "동경");
		map.put("중국", "북경");
		map.put("미국", "워싱턴");
		map.put("태국", "방콕");
		map.put("영국", "런던");
		System.out.println(map);
		String nation="영국";
		System.out.println(nation+"의 수도는 "+map.get(nation));
		
		Iterator<String> iterator=map.keySet().iterator();
		while (iterator.hasNext()) {//다음 요소가 있으면
			String key=(String)iterator.next();//다음 요소
			System.out.print("key="+key);
			System.out.println(",value="+map.get(key));
		}
		
		//ArrayList로 처리한다면
		List<String> nations=new ArrayList<>();
		nations.add("영국");
		nations.add("한국");
		nations.add("중국");
		nations.add("미국");
		nations.add("일본");
		List<String> city=new ArrayList<>();
		city.add("런던");
		city.add("서울");
		city.add("북경");
		city.add("워싱턴");
		city.add("동경");
		nation="영국";
		for(int i=0; i<nations.size(); i++) {
			if(nations.get(i).equals(nation)) {
				System.out.println(nations.get(i)+"의 수도는 "+city.get(i));
				break;
			}
		}
	}
}
