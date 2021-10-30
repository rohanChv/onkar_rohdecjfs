package oop;

public class employee {
	int id,incent,overtime;
	String name;
	double base_salary;
	public employee(int a,String b,double c) {
		this.id=a;
		this.name=b;
		this.base_salary=c;
	}
	public void salary_calc(int incent) {
		this.incent=incent;
		double sal=base_salary+incent;
		System.out.println("the salary is:"+sal);
	}
}




