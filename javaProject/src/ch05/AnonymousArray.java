package ch05;

//무명배열 : 배열의 이름을 지정하지 않고 단순히 초기값만으로 배열 활용
//무명배열은 한번만 데이터사용하고 다시는 참조할 일이 없을 때 사용
public class AnonymousArray {
	public static void main(String[] args) {
		System.out.println("숫자들의 합 : " + sum(new int[] {1,2,3,4}));
	}

	public static int sum(int[] numbers) {
		int total = 0;
		for(int i=0; i<numbers.length; i++) {
			total=total+numbers[i];
		}
		return total;
	}

}
