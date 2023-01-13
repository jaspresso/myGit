package ch14;

import java.util.ArrayList;
import java.util.List;

public class ListStudent {
	public static void main(String[] args) {
		List<Student> list=new ArrayList<>();
		list.add(new Student("2023001", "김철수", "국사", 1, "박교수"));
		list.add(new Student("2022002", "박찬호", "영문", 2, "최교수"));
		list.add(new Student("2021003", "송명호", "전산", 3, "김교수"));
		System.out.println("학번\t이름\t전공\t학년\t지도교수");
		
		for(int i=0; i<list.size(); i++) {
			Student s = list.get(i);
			System.out.println(s);
			System.out.println(s.getNum()+"\t"+s.getName()+"\t"+s.getMajor()
			+"\t"+s.getYear()+"\t"+s.getProfessor());
		}
		
		//for~each문(향상된 for문)을 쓰면 list.get(i)등의 처리를 안해도 된다.
//		for(Student s : list) {
//			System.out.println(s.getNum()+"\t"+s.getName()+"\t"+s.getMajor()
//			+"\t"+s.getYear()+"\t"+s.getProfessor());
//		}
		
	}

}
