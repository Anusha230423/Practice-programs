
public class Descriptor {
	private String s;
	public Descriptor(String s) {
		// TODO Auto-generated constructor stub
		this.s = s;
		System.out.println("Creating descriptor "+s);
	}
	protected void  dispose(){
		System.out.println("Finalizing descriptor "+s);
	}

}
