
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShapeFactory house = new MyShapeFactory(); 
	          Shape chicken = house.getShapes().get(0); 
	          for(int i=0; i<house.getShapes().size();
	            chicken = house.getShapes().get(i++)) { 
	            System.out.println("Shape"); 
	         } 

	}

}
