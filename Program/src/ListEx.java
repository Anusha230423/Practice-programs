import java.util.ArrayList;
import java.util.List;

public class ListEx {
	public static void main(String[] args) {
		List<String>  list = new ArrayList<>();
		list.add("Pen");
		list.add("Pencil");
		list.add("Box");
		for(String i:list){
			if(i.indexOf("P")==0){
				continue;
			}else{
				System.out.println(i+"");
			}
		}
	}

}
