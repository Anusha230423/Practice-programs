import java.util.function.Predicate;

public class Main {
//	public static void addToInt(int x,int addInteger){
//		x=x+addInteger;
//		System.out.println(x);
//	}
//	public static void main(String[] args) {
//		int a=10;
//		int b=15;
//		
//		Main.addToInt(a, b);
//		System.out.println(a);
//	}
//	public static void main(String[] args) { 
//        Shape rectangle = new Rectangle(5);  // A
//        System.out.println(","+rectangle.hasEdges()); // B
//      } 
	public static void main(String[] args) { 
           System.out.println(test((i)->i==2));
         } 
         private static boolean test(Predicate<Integer> p) { 
           return p.test(2); 
         } 

}
