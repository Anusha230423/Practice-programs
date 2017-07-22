
public class Speak {
//	public static void main(String[] args) {
//		Speak speak = new Tell();
//		Tell tellIt = new Tell();
//		//speak.tellItLikeItIs();
//		//(Truth)speak.tellItLikeItIs();
//		((Truth)speak).tellItLikeItIs();//it will works
//		tellIt.tellItLikeItIs();//it will works
//		//(Truth)tellIt.tellItLikeItIs();
//		((Truth)tellIt).tellItLikeItIs();//it will works
//	}
//	
//	public static void main(String[] args) {
//		int x= 10;
//		System.out.println(x>10?">":x<10?"<":"=");
//	}
	public static void main(String[] args) {
		int[] array={1,2,3,4,5};
		for(int i:array){
			if(i<2){
				continue;
			}
			System.out.print(i);
			if(i==3){
				continue;
			}
		}
		
	}

}
