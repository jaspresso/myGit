package ch18;

import java.io.*;

public class RandomFile2 {
    public static void main(String[] args) {
        OutputStream os;
        BufferedReader br;

        String file1 = "C:\\test\\rand2.txt";
        String str = null;

        try {
            os = new FileOutputStream(new File(file1));
            System.out.println("글을 입력하세요 : ");
            while (true){
                int ch = System.in.read();
                if (ch == 10 ) break;
                os.write(ch);
            }os.close();
            read(null,file1);
            System.out.println("파일이 생성되었습니다.");
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                RandomAccessFile file = new RandomAccessFile(file1,"rw");
                file.seek(9);
                file.write("park".getBytes());
                while (file.getFilePointer() < file.length()){
                    str = file.readLine();
                    str = new String(str.getBytes("iso-8859-1"),"utf-8");
                }file.close();
                read(null,file1);
                System.out.println("파일이 변경되었습니다.");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    public static void read(BufferedReader br,String file1) throws IOException {
        br = new BufferedReader(new FileReader(file1));
        while (true){
            String line = br.readLine();
            if (line == null) break;
            System.out.println(line);
        }br.close();
    }
}
