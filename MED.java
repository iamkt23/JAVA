import java.util.*;
class Media
{
	String title;
	String publication;
	Media() {}
	Media( String t, String p)
	{
		title = t;
		publication = p;
	} 
}

class Books extends Media
{
	int num;
	Books(String t,String p)
	{
		super(t,p);
	}
	void read()
	{
		int n;
		Scanner c = new Scanner(System.in);
		n = c.nextInt();
		num = n;
	}
	void show()
	{
		System.out.println("The title of the book is: "+title);
		System.out.println("The publication of the book is: "+publication);
		System.out.println("The number of pages in the book is: "+num);
	}
}

class Tapes extends Media
{
	double time;
	Tapes(String t,String p)
	{
		super(t,p);
	}
	void read()
	{
		double n;
		Scanner c = new Scanner(System.in);
		n = c.nextDouble();
		time = n;
	}
	void show()
	{
		System.out.println("The title of the book is: "+title);
		System.out.println("The publication of the book is: "+publication);
		System.out.println("The playing time in minutes of the tape is: "+time);
	}
}

public class MED
{
	public static void main(String args[])
	{
		String a,b;
		int q;
		Scanner c = new Scanner(System.in);
		System.out.println("******************WELCOME to MEDIA SHOP******************** ");
		System.out.println("Press 1 for Books ");
		System.out.println("Press 2 for Tapes ");
		q=c.nextInt();
		if(q==1)
		{
			System.out.println("Enter the title: ");
			a=c.next();
			System.out.println("Enter the publication: ");
			b=c.next();
			Books L = new Books(a,b);
			System.out.println("Enter the number of pages in the book: ");
			L.read();
			L.show();
		}
		else
		{
			System.out.println("Enter the title: ");
			a=c.next();
			System.out.println("Enter the publication: ");
			b=c.next();
			Tapes X = new Tapes(a,b);
			System.out.println("Enter the playing time of the tape: ");
			X.read();
			X.show();
		}
	}
}
			
	