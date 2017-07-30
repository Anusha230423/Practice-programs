package pond.duck;

public class GoodDuckling {
	public void makeNoise(){
		MotherDuck motherDuck= new MotherDuck();
		motherDuck.quack();
		System.out.println(motherDuck.noise);
	}
	public static void main(String[] args) {
		GoodDuckling gd = new GoodDuckling();
		gd.makeNoise();
	}

}
