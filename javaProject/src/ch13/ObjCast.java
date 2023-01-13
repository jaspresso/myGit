package ch13;

public class ObjCast {
	public static void main(String[] args) {
		int a=10;
		Object obj=20;//좌:부, 우:자
		a = (Integer)obj;//정상적인 형변환, a=(int)obj 가능
		System.out.println(a);
		
		Object[] obj2= {100,100.5,true,"hello",'A'};
		//사실은 각 데이터가 Object객체(Integer,Double,Boolean등...)가 되어버린다.(오토박싱).
		//그래서 메모리 낭비가 심하다. 이렇게 쓰는일은 없다. 대신 컬렉션처리(ArrayList등)를 하면 단점을
		//보완할 수 있다.
		for(Object o : obj2) {
			System.out.println(o);//(오토언박싱)
		}
	}

}
