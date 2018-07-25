import java.util.*;
class human
{
	String name;
	int age;
	double salary;
	public human(String n,int a,double s)
	{
		name = n;
		age = a;
		salary = s;
	}
	void DISPLAY()
	{
	System.out.println("The name of the person is: "+name);
	System.out.println("The age of the person is: "+age);
	System.out.println("The salary of the person is: "+salary);
	}
}

class PERSON
{
	public static void main(String args[])
	{
		String n;
		int a;
		double s;
		Scanner c = new Scanner(System.in);
		System.out.println("Enter the name: ");
		n = c.next();
		System.out.println("Enter the age: ");
		a = c.nextInt();
		System.out.println("Enter the salary: ");
		s = c.nextDouble();
		human p1 = new human(n,a,s);
		p1.DISPLAY();
	}
}
