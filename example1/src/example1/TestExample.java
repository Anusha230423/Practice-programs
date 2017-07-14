package example1;

public class TestExample {
	public static void main(String[] args){
		int[] a={1};
		TestExample t = new TestExample();
		t.increment(a);
		System.out.println(a[a.length-1]);
	}
	void increment(int[] j){
		j[j.length-1]++;
	}
}
