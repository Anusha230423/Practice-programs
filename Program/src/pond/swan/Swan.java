package pond.swan;

import pond.shore.Bird;

public class Swan extends Bird {
	public void swim(){
		floatInWater();
		System.out.println(text);
		
	}
	public void helpOtherSwanSwim(){
		Swan swan = new Swan();
		swan.floatInWater();
		System.out.println(swan.text);
	}

}
