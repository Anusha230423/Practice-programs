package example;

public class Otter {
	public static void play(Toy toy){
		toy.removeIce();
	}
	public static void main(String[] args){
		Toy toy = new Toy();
		Otter.play(toy);
		System.out.println(toy.containsIce());
	}
}
