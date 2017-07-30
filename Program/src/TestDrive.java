
public class TestDrive {
	public static void go(Car c){
		c.velocity+=10;
	}
	public static void main(String[] args) {
		Car  porsche = new Car();
		go(porsche);
		
		Car stolen = porsche;
		go(stolen);
		 
		System.out.println(porsche.velocity);
	}

}
