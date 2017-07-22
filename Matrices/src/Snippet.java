import java.util.ArrayList;
import java.util.List;

public class Snippet {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(11);
		for(int x:list){
			System.out.println(x+", "+x);
			break;
		}
		
	}

}
