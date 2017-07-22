import java.util.*;

public class ListExample {
	public static void main(String[] args) {
		int[] array={6,8,9};
		List<Integer> list = new ArrayList<>();
		System.out.println("list:"+list);
		list.add(array[0]);
		System.out.println("list:"+list);
		list.add(array[2]);
		System.out.println("list:"+list);
		list.set(1, array[1]);
		System.out.println("list:"+list);
		list.remove(0);
		System.out.println("list:"+list);
		
		
	}

}
