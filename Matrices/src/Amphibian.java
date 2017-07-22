
public class Amphibian extends Animals {
	private Characterstic c =  new Characterstic("can live in water");
	private Descriptor d = new Descriptor("both land and water");
	public Amphibian() {
		// TODO Auto-generated constructor stub
		System.out.println("Amphibian");
	}
	protected void dispose(){
		System.out.println("Amphibian dispose");
		c.dispose();
		d.dispose();
		super.dispose();
	}

}
