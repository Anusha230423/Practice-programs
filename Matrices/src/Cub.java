
public class Cub {
	private String name;
	private double weight;
	public Cub(double weight){
		
		this.weight = weight;
		this("",weight);
		
	}
	public Cub(String name, double weight){
		weight = weight;
		this.name = name;
		
	}
	public static void main(String[] args) {
		Cub cub = new Cub(44);
		System.out.println(cub.weight+""+cub.name);
	}
	
}
