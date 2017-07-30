package pond.swan;

import pond.duck.MotherDuck;

public class BadCygnet {
	public void makeNoise(){
		MotherDuck  motherDuck = new MotherDuck();
		motherDuck.quack();
		System.out.println(motherDuck.noise);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BadCygnet bc =  new BadCygnet();

	}

}
