
public class Frogs extends Amphibian{
	private Characterstic c = new Characterstic("Croaks");
	private Descriptor d = new Descriptor("Eat bugs");
	public Frogs() {
		// TODO Auto-generated constructor stub
		System.out.println("Frogs()");
	}
	protected void dispose(){
		System.out.println("Frog dispose");
		c.dispose();
		d.dispose();
		super.dispose();
	}

}
