package LambdaExpressions;

public class EmployeeAllDetails 
{
private int id;
private String name; 
private int salary;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}
public EmployeeAllDetails() {
	super();
	// TODO Auto-generated constructor stub
}
public EmployeeAllDetails(int id, String name, int salary) {
	super();
	this.id = id;
	this.name = name;
	this.salary = salary;
}
@Override
public String toString() {
	return "EmployeeAllDetails [id=" + id + ", name=" + name + ", salary=" + salary + "]";
}


}
