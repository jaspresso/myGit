package ch14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListProdEx {
	public static void main(String[] args) {
		Map<String, Object> map=new HashMap<>();//해쉬맵 객체 생성
		List<ProdEx> list=new ArrayList<>();//리스트 객체 생성
		
		list.add(new ProdEx("TV", "oled123", "LG", 300, 10));//메모리 100
		list.add(new ProdEx("냉장고", "sm02re", "삼성", 200, 5));//200
		list.add(new ProdEx("에어컨", "win03", "위니아", 100, 8));
		list.add(new ProdEx("컴퓨터", "asus01", "아수스", 200, 6));
		
		map.put("list", list);//맵에 리스트 추가 put("key", value)
		print(map);
	}
	
	static void print(Map<String, Object> map) {
		@SuppressWarnings("unchecked")
		ArrayList<ProdEx> list2=(ArrayList<ProdEx>)map.get("list");//좌:ArrayList, 우:Object
		System.out.println("-----------------------------------(단위:만원)---");
		System.out.println("제품명\t제품번호\t제조사\t단가\t수량\t판매금액");
		System.out.println("-----------------------------------------------");
		for(ProdEx s : list2) {
			System.out.println(s.getName()+"\t"+s.getNum()+"\t"+s.getCompany()
			+"\t"+s.getPrice()+"\t"+s.getAmount()+"\t"+s.getMoney());
		}
		System.out.println("-----------------------------------------------");
		
	}
	

}
