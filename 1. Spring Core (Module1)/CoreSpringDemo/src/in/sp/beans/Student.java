//1
package in.sp.beans;

public class Student 
{
	private String name;
	private int rollno;
	
	public String getName() { /*global variable er value get korar jonno. return type String dibar karon name return korte hobe tobei print korte pabo*/
		return name;
	}

	public void setName(String name) {   /* 1.global and local variable same hole global  variable er samne "this." dite hoy.
	                                        2.Perametarer nam and xml file a proparty nam same dite hobe, and --xml file theke value first asbe perametare --tarpor jabe local variable a --local theke sei value gobal variable a store hobe*/
		this.name = name;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	
	public void display()
	{
		System.out.println("Name : "+name);
		System.out.println("Rollno : "+rollno);
	}
}