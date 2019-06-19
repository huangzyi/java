package inputoutput;

public class Employee {
public int No;
public String Name;
public char Sex;
public int Age;
public float Salary;

public Employee(int n , String nm , char s, int a,float sl){
	this.No=n;
	this.Name=nm;
	this.Sex=s;
	this.Age=a;
	this.Salary=sl;
}
public String toString() {
	return No+Name+Sex+Age+ Salary;
}
}
