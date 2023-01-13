package ch05;

public class Args {
	public static void main(String[] args) {
		for(int i=0; i<args.length; i++) {
			System.out.println(i+"번째 매개변수 : " + args[i]);
		}
	}
}
