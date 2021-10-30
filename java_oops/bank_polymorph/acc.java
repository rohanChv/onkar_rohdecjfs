package bank_oop2;

public class acc {
	int id;
	double curr=0.00;
	String name;
	double sal;
		public acc(int id,String name) {
			this.id=id;
			this.name=name;
		}
		public void tot(int sav) {
			sal= curr+sav;
			System.out.println("calculated using base class :"+sal);
		}
}
