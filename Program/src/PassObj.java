
public class PassObj {
	public static void main(String[] args) {
		Test test = new Test(100,22);
		Test test1 = new Test(102,22);
		Test test2 = new Test(-1,-1);
		System.out.println("test == test1:"+test.equalTo(test1));
		System.out.println("test == test2:"+test.equalTo(test2));
	}

}
