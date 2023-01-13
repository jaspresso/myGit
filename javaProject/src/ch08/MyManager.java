package ch08;

//싱글톤 기법
public class MyManager {
	private int score;//100
	
	private MyManager(int score) {//생성자는 기본적으로 public을 써야하는데 대신 private을 써서
		//외부에서 함부로 new를 해서 또다른 객체를 생성해서 메모리를 낭비시키는일을 방지함.
		this.score=score;
	}
	
	private static MyManager mgr;//객체형데이터타입 참조변수
	
	public static MyManager getInstance() {
		if(mgr==null) {//처음 MyManager가 객체화 될때의 경우
			mgr=new MyManager(10);
		}
		return mgr;//한번이상 객체 생성되었다면(즉, 주소값이 있으면)그 값을 리턴
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
}
