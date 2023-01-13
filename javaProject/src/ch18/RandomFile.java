package ch18;

import java.io.RandomAccessFile;

public class RandomFile {
	public static void main(String[] args) {
		String str=null;
		try {//r:읽기전용, w:쓰기전용, rw:읽기,쓰기
			RandomAccessFile file = new RandomAccessFile("c:\\test\\rand.txt", "rw");
			System.out.println(file.getFilePointer());//0
			//getFilePointer() : 파일포인터(파일을 어디까지 읽었는지 가리킴)
			file.seek(8);//8번째 인덱스 부터 
			System.out.println(file.getFilePointer());//8
			file.write("자바".getBytes());//HTML로 기존내용을 덮어씀
			System.out.println(file.length());//문자길이(한글은 3바이트의 길이값을 가짐)
			System.out.println(file.getFilePointer());
			while (file.getFilePointer() < file.length()) {
				//파일의 내용보다 파일포인터의 위치값이 적으면 반복
				str=file.readLine();
				//한글처리
				//String(문자열, 캐릭터셋) 인코딩방식 변환
				//iso-8859-1, 8859_1 : 서유럽언어 인코딩 방식
				//ms949(eucKr) : 2바이트(완성형)
				//utf-8 : 3바이트 , 초성(1byte), 중성(1byte), 종성(1byte) - 조합형
				str = new String(str.getBytes("8859_1"), "utf-8");
			}
			System.out.println(file.length());
			System.out.println(file.getFilePointer());
			file.close();//파일 저장시점
			System.out.println("파일이 저장되었습니다.");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
