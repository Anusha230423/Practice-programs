
public class SubClass extends SuperClass {
	SubClass(){
		super(10);
		System.out.println("Sub");
	}
	public static void main(String[] args) {
		SubClass sb = new SubClass();
	}
	
}
