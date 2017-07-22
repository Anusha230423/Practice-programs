
public class Animal {
	public Animal(String aType){
		type=aType;
	}

	@Override
	public String toString() {
		return "This is a "+type;
	}
	private String type;

}

