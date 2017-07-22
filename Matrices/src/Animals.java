
public class Animals extends LivingCreature {
	private Characterstic c = new Characterstic("has heart");
	private Descriptor d =new Descriptor("Animal not vegetable");
	public Animals() {
		// TODO Auto-generated constructor stub
		System.out.println("Animals()");
	}
	protected void dispose(){
		System.out.println("Animal dispose");
		c.dispose();
		d.dispose();
		super.dispose();
	}

}
