
public class Student {
	public String name = "";
	public int id = 0;
	public String major ="Undeclared";
	public boolean fulltime = true;
	public void display(){
		System.out.println("Name: "+name+"Major"+major);
	}
	public boolean isFullTime(){
		return fulltime;
	}
}
