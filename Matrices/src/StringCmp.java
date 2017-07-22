
public class StringCmp {
	public static void main(String[] args) {
		StringBuilder stringBuilder = new StringBuilder("Java");
		String str = "Home";
		stringBuilder.append(str);
		 String foundAt=stringBuilder.substring(4);
		//int foundAt = stringBuilder.indexOf(str);
		System.out.println(foundAt);
		System.out.println(stringBuilder);
	}

}
