
public class Conversion {
public static void main(String[] args) {
	Conversion c = new Conversion();
	c.finalize();
	System.gc();
}
public void finalize(){
	Conversion c= null;
	System.out.println("garbage collection invoked");
}
}
