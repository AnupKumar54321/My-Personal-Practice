package clientinterviewpractice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class EmployeeDetails{
	String name;
	int age;
	String city;
	public EmployeeDetails(String name,int age,String city) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.age = age;
		this.city = city;
		
	}
	
	 @Override
	    public String toString() {
	        return "EmployeeDetails{name='" + name + "', age=" + age + ", city='" + city + "'}";
	    }
}
public class Employee {
	public static void main(String[] args) {
		List<Integer> lists = Arrays.asList(1,2,3,4,5);
		List<EmployeeDetails> list = Arrays.asList(new EmployeeDetails("Anup", 12,"Bangalore"),
																			new EmployeeDetails("Arup", 14,"Pune"),
																			new EmployeeDetails("Abhinav", 16,"Bangalore"),
																			new EmployeeDetails("dibya", 12,"Hyd"),
																			new EmployeeDetails("Anukul", 18,"Bangalore"));
		List<EmployeeDetails> details = list.stream()
																		.filter(i->i.name.toLowerCase().startsWith("a") && i.city.equalsIgnoreCase("bAngalore"))
																		.collect(Collectors.toList());
		System.out.println(details);
	}

}
