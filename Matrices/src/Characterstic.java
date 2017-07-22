
public class Characterstic {
	private String s;
	public Characterstic(String s) {
		// TODO Auto-generated constructor stub
		this.s = s;
		System.out.println("Creating Characterstic "+s);
	}
	protected void dispose(){
		System.out.println("Finalizing Characterstic "+s);
	}

}
