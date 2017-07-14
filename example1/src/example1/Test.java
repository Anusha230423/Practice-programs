package example1;

public class Test {
	public static void main(String[] args){
		Integer x = new Integer(256);
		System.out.println(x.byteValue());
		
		Test t= new Test();
		t.sampleMethod();
	}
	 void sampleMethod(){
			float f = (2/5)*1;
			int a = Math.round(f);
			System.out.println(a);
		}
}
