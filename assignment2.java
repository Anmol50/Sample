import java.util.*;
class Employee
{
	String fname, lname;
	long salary;
	Employee()
	{
		fname = null;
		lname = null;
		salary = 0;
	}
	Employee(String fnm, String lnm, long rp)
	{
		this.fname = fnm;
		this.lname = lnm;
		this.salary = rp;
	}
	public void setDetails()
	{
		Scanner input = new Scanner(System.in);
		System.out.printf("\nEnter first name: ");
		fname = input.next();
		System.out.printf("\nEter last name: ");
		lname = input.next();
		System.out.printf("\nEnter Salary: ");
		salary = input.nextLong();
	}
	public void setFirstname(String nm)
	{
		this.fname = nm;
	}
	public void setLastname(String nm)
	{
		this.lname = nm;
	}
	public void setSalary(long sl)
	{
		this.salary = sl;
	}
	public String getFirstName()
	{
		return fname;
	}
	public String getLastName()
	{
		return lname;
	}
	public long getSalary()
	{
		return salary;
	}	
	public void display()
	{
		System.out.println("\nName: "+fname + " " + lname);
	System.out.println("Salary: "+ salary);
	}
	public void incr15per()
	{
	long l = this.salary;
	double s = (double)l*0.15;
	this.salary = l+ (long)s;
	}
}
	class EmployeeTest
	{
	public static void main(String a[])
	{
	System.out.println("\nUsing parameterized Constructor");
	Employee e1 = new Employee("Aman","Gupta",40000);
	e1.display();
	System.out.println("\nUsing default constructor and
	taking inputs");
	Employee e2 = new Employee();
	e2.setDetails();
	e2.display();
	System.out.println("\nIncreasing "+e2.getFirstName()+"'s salary by 15% ");
	e2.incr15per();
	e2.display();
	}
}
