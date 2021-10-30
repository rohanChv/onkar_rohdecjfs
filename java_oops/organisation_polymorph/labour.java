package oop;
public class labour extends employee {
	double c;
	public labour(int a, String b, double c) {
		super(a, b, c);
		// TODO Auto-generated constructor stub
		this.c=c;
	}
	public void salary_calc(int overtime) {
		double sal = c+overtime;
		System.out.println("\nLabour  salary is : "+sal);
	}

}
