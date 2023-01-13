package ch10;

class Triangle extends Figure {
	@Override
	void draw() {
		System.out.println("삼각형 그리기...");
	}
}

class Rectangle extends Figure {
	@Override
	void draw() {
		System.out.println("사각형 그리기...");
	}
}

class Circle extends Figure {
	@Override
	void draw() {
		System.out.println("원 그리기...");
	}
}

public class Figure {
	void draw() {
		System.out.println("도형을 그립니다.");
	}
	
	public static void main(String[] args) {
		Triangle t=new Triangle();
		t.draw();
		Rectangle r=new Rectangle();
		r.draw();
		Circle c=new Circle();
		c.draw();
		
		Figure f=new Triangle();//좌:부, 우:자 => 다형성기법
		f.draw();
		f=new Rectangle();
		f.draw();
		f=new Circle();
		f.draw();
	}

}
