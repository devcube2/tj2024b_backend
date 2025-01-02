package day16.step1;

class A {				// 부모 : object , 자식 : B C , 자손 : D E
	
}

class B extends A {		// 부모 : A		 , 자식 : D
	
}

class C extends A {		// 부모 : A		 , 자식 : E
	
}

class D extends B {		// 부모 : B		 , 자식 : 
	
}

class E extends C {		// 부모 : C		 , 자식 :
	
}


public class Example1 {
	public static void main(String[] args) {
		B b = new B(); // B 클래스의 인스턴스(객체)
		C c = new C(); // C 클래스의 인스턴스(객체)
		D d = new D(); // D 클래스의 인스턴스(객체)
		E e = new E(); // E 클래스의 인스턴스(객체)
		
		// [1] 자동 타입변환 , 묵시적 타입변환
		A a1 = b;	   //
		A a2 = c;	   // 
		A a3 = d;
		A a4 = e;
		
		B b1 = b;
		//B b2 = c; // 형제간의 타입 변환은 불가능하다.
		
		//C c1 = b;
		C c2 = c;
		//C c3 = d;
		C c4 = e;
		
		// [2] 강제 타입변환 , 명시적 타입변환 , 캐스팅
		B b5 = (B)a1;
		E e5 = (E)a4;
		
		//E e6 = (E)a1; // 캐스팅 오류 발생
		//D d6 = (D)a2; // 캐스팅 오류 발생
		
		// [3] 본래의 인스턴스를 확인 방법 , instanceof 키워드
		System.out.println(a1 instanceof A); // a1 변수가 참조하는 인스턴스에 A타입이 존재해? true
		System.out.println(a1 instanceof Object); // a1 변수가 참조하는 인스턴스에 object 타입이 존재해? true
		System.out.println(a1 instanceof C); // a1 변수가 참조하는 인스턴스에 C타입이 존재해? false		
		System.out.println(a4 instanceof B); // a4 변수가 참조하는 인스턴스에 B타입이 존재해? false
	}
}
