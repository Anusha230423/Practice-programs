
public class Boolean {
	static boolean a ;
	static boolean b ;
	static boolean c ;
	public static void main(String[] args){
		boolean add = (a=true)||(b=true)&&(c=true);
		System.out.println(a+""+","+b+""+","+c+"");
	}

}
