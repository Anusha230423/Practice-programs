
public class LivingCreature {
	private Characterstic c = new Characterstic("is alive");
	private Descriptor d = new Descriptor("Basic living creature");
	public LivingCreature() {
		// TODO Auto-generated constructor stub
		System.out.println("LivingCreature(");
	}
	protected void dispose(){
		System.out.println("LivingCreature dispose.");
		c.dispose();
		d.dispose();
	}

}
