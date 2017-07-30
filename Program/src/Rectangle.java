
public class Rectangle  extends Shape{
//	 public Rectangle(int age) { 
//         System.out.print("Rectangle"); 
//       } 
//       public boolean hasEdges() { // C
//         return true; 
//       }
	 private String color; 
       public Rectangle() { 
          this("white"); 
        } 
        public Rectangle(String color) { 
          color = color; 
        } 
        public static void main(String[] args) { 
         Rectangle e = new Rectangle(); 
         System.out.println("Color:" + e.color); 
        } 

}
