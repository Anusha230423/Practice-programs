
public class Rectangle {
	public Rectangle(String n){
		name = n;
	}
	public static void main(String[] args) {
		Rectangle rectangle1 = new Rectangle("xxx");
		Rectangle rectangle2= new Rectangle("yyy");
		rectangle1 = rectangle2;
		rectangle1 = null;
		rectangle2 = null;
		
	}
	private String name;

}
