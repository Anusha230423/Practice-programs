public class Example{
	 String fly(String a){
		return "1";
	}
	public static void main(String[] args) {
//		String s1="1";
//		String s2=s1.concat("2");
//		s2.concat("3");
//		System.out.println(s2);
		Example example = new Example();
		example.fly("a");
		System.out.println(example.fly("a"));
	}
	
}