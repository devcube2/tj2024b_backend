package practice;

class Powder {
	public void doPrinting() {
		System.out.println("Powder 재료로 출력합니다.");
	}
	public String toString() {
		return "재료는 Powder 입니다.";
	}
}

class Plastic {
	public void doPrinting() {
		System.out.println("Plastic 재료로 출력합니다.");
	}
	public String toString() {
		return "재료는 Plastic 입니다.";
	}
}

class GenericPrinter<T> {
	private T material;
	
	public void setMaterial(T material) {
		this.material = material;
	}
	
	public T getMaterial() {
		return material;
	}
	
	public String toString() {
		return material.toString();
	}
}

public class Practice {
	public static void main(String[] args) {
		GenericPrinter<Powder> powderPrinter = new GenericPrinter<>();
		
		powderPrinter.setMaterial(new Powder());
		System.out.println(powderPrinter);
	}
}