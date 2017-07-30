
public class ChangeTest {
	private int myValue=0;
	public void showOne(int myValue){
		myValue=myValue;
	}
	public void showTwo(int myValue){
		this.myValue=myValue;
	}
	public static void main(String[] args) {
		ChangeTest changeTest = new ChangeTest();
		changeTest.showOne(100);
		System.out.println(changeTest.myValue);
		changeTest.showTwo(200);
		System.out.println(changeTest.myValue);
	}

}
