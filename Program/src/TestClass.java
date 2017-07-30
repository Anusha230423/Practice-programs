
public class TestClass {
//   static TestClass ref;
//   String[] arguments;
//   public static void main(String args[]){
//	   ref = new TestClass();
//	   ref.func(args);
//	   }
//   public void func(String[] args){
//	   ref.arguments = args;    } 
//	static int someInt = 10;
//	  public static void changeIt(int a){
//	    a = 20;
//	  }
//	  public static void main(String[] args){
//	    changeIt(someInt);
//	    System.out.println(someInt);
//	  }
//	public int methodX( byte by){
//	    double d = 10.0;
//	    return (long) by/d*3;
//	}
	public void printSum(Integer a){
		System.out.println(a);
	}
	public static void main(String[] args) {
		TestClass name = new TestClass();
		name.printSum(10);
	}


}
