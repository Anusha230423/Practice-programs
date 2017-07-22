
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class TestJava {
	public static void checkList(List<Person> list, Predicate<Person> predicate){
		for(Person p:list){
			if(predicate.test(p)){
				System.out.println(p.name+" ");
			}
		}
	}
	public static void main(String[] args) {
		List<Person> ilist = Arrays.asList(new Person("Mark",40),new Person("Harry",40),new Person("Smith",35));
		checkList(ilist,p->p.getAge()>40);
	}
	
	

}
