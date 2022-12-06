package Inner6;

class Outer {
	int value = 10;

	class Inner {
		int value = 20;

		void method1() {
			int value = 30; // 지역변수 
			System.out.println("		value :" + value);  // 지역변수 
			System.out.println("	this.value :" + this.value);  //  인스턴스 변수 
			System.out.println("Outer.this.value :" + Outer.this.value);  // Outer class 변수 
		}
	}
}

public class InnerEx5 {
	public static void main(String[] args) {
		Outer outer = new Outer(); 
		Outer.Inner inner = outer.new Inner();
		inner.method1();

	}

}
