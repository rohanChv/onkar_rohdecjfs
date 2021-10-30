package oop;

public class organisation {
	public static void main(String args[]) {
		manager m = new manager(30781,"Mr.ram",78901.5476);
		m.salary_calc(5000);
		labour l=new labour(3109,"mr.lakshman",10000);
		l.salary_calc(300);
	}
}
