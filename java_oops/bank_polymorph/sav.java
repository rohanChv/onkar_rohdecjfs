package bank_oop2;

import java.util.Scanner;

public class sav extends acc {
	double cu1;
	public sav(int id, String name) {
		super(id, name);
	}
	public void sv() {
		System.out.println("enter the amount in savings :");
		Scanner sc= new Scanner(System.in);
		cu1=sc.nextDouble();
		sc.close();
	}
	public void disp() {
		System.out.println("the credentials are : "+id+"\n"+name);
	}
	public void tot(int cu) {
		double tot1=cu1+cu;
		System.out.println("total assets worth : "+tot1);
	}
}
