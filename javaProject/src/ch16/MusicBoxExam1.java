package ch16;

public class MusicBoxExam1 {

	public static void main(String[] args) {
		MusicBox box = new MusicBox();
		
		MusicPlayer kim = new MusicPlayer(1, box);
		MusicPlayer lee = new MusicPlayer(2, box);
		MusicPlayer park = new MusicPlayer(3, box);
		
		//스레드 실행
		kim.start();
		lee.start();
		park.start();
	}
}
