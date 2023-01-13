package ch18;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class FileWrite {
	public static void main(String[] args) {
		//프로그램 ==> 파일 (출력스트림이 필요)
		OutputStream os=null;
		try {
			os = new FileOutputStream("C:\\test\\aa.txt");
			System.out.println("입력하세요 : ");
			while (true) {
				int ch=System.in.read();//1byte 읽음
				if(ch==13) break;
				os.write(ch);//파일에 1byte 저장
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
