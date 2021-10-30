package oop;

public class manager extends employee{
	double c;
	public manager(int a, String b, double c) {
		super(a, b, c);
		// TODO Auto-generated constructor stub
		this.c=c;
		
	}
	public void salary_calc(int incent) {
		double sal = c+incent;
		System.out.println("\nSalary for manager is:"+sal);
	}
}