
import java.util.*;

public class ArrayType {
	public static void main(String[] args) {
//		String[] bugs = {"cricket","beetle","ladybug"};
//		String[] alias = bugs;
//		System.out.println(bugs.equals(alias));
//		System.out.println(Arrays.toString(bugs));
//		System.out.println(bugs.toString());
		
		
	
//	    ArrayList list = new ArrayList();
//	    list.add("hawk");
//	    list.add(Boolean.TRUE);
//	    System.out.println(list);
		
		
//		ArrayList<String> list = new ArrayList<>();
//		list.add("Hawk");
//		//list.add(Boolean.TRUE);
//		System.out.println(list.size());
//		System.out.println(list.set(0,"blue ray"));
//		System.out.println(list);
//		System.out.println(list.remove("cardinal"));
//		System.out.println(list.contains("blue ray"));
//		//System.out.println(list.remove(0));
//		list.clear();
//		System.out.println(list.isEmpty());
//		System.out.println(list.remove(2));
		
//		List<String> list1 = new ArrayList<>();
//		List<String> list2 = new ArrayList<>();
//		System.out.println(list1.equals(list2));
//		list1.add("a");
//		System.out.println(list1.equals(list2));
//		list2.add("a");
//		System.out.println(list1.equals(list2));
//		list1.add("b");
//		list2.add(0, "b");
//		System.out.println(list1.equals(list2));
		
		
//		int primitive =  Integer.parseInt("123");
//		Integer wrapper = Integer.valueOf("123");
//		System.out.println(primitive);
//		System.out.println(wrapper);
		
		
//		int primi =  Integer.parseInt("a");
//		Integer wrapp = Integer.valueOf("123.45");
//		System.out.println(primi);
//		System.out.println(wrapp);
//		
//		List<Double> weights = new ArrayList<>();
//		weights.add(50.0);
//		weights.add(new Double(10));
//		weights.remove(50.0);
//		double value = weights.get(0);
//		System.out.println(value);
//		System.out.println(weights);
////		L
//		List<Integer> heights = new ArrayList<>();
//		heights.add(null);
//		int h = heights.remove(0);
//		System.out.println(h);
		
		
//		List<String> list = new ArrayList<>();
//		list.add("hawk");
//		list.add("robin");
//		Object[] objectArray = list.toArray();
//		System.out.println(objectArray.length);
//		String[] array = list.toArray(new String[0]);
//		System.out.println(array.length);
		
		
		String[] string= {"Hawk", "Robin"};
		List<String> list = Arrays.asList(string);
		System.out.println(list.size());
		list.add(1, "test");
		string[0] = "new";
		for(String b:string){
			System.out.println(b+" ");
		}
		list.remove(1);
		
		
		
		
		
		
	}

}
