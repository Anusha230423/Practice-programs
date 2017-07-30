import java.io.IOException;
import java.util.*;

public class Super {
//	public static void eat() throws IOException{
//		try{
//			System.out.println("1");
//			throw new IOException();
//		}catch(IOException e){
//			System.out.println("2");
//			throw e;
//		}finally{
//			System.out.println("3");
//		}
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		eat();
//		System.out.println("4");
		List<String> fishes = new ArrayList<>();
		fishes.add("goldfish");
		fishes.add("minnow");
		fishes.remove("goldfish");
		fishes.remove("shark");
		System.out.println(fishes.size());
	}

}
