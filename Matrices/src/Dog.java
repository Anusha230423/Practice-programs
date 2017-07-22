

public class Dog extends Animal{
	public Dog(String aName){
		super("Dog");
		name = aName;
		breed="Unknown";
	}
	public Dog(String aName,String aBreed){
		super("Dog");
		name=aName;
		breed=aBreed;
	}
	private String name;
	private String breed;

}
