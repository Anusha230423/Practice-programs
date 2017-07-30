
public class AEExample {
	public static void main(String[] args) {
//		int x=10;
//		int y=2;
//		try{
//			for(int z=2;z>=0;z--){
//				int ans=x/z;
//				System.out.println(ans+"");
//			}
//		}catch(ArithmeticException e){
//			System.out.println("E1");
//		}catch(Exception e){
//			System.out.println("E2");
//		}
		StringBuilder sb = new StringBuilder("Java");
		String s = "Home";
		sb.append(s);
		sb.substring(4);
		int foundAt = sb.indexOf(s);
		System.out.println(foundAt);
	}
}
