package java_abstract;

public class ces {
double amt,balance=50000.00;
	public void withdraw(double amt) throws IllegalTran,Nobal {
		this.amt=amt;
			if(amt<=0.00) {
				throw new IllegalTran(amt);
			}
			else 
				if(this.balance<amt) {
					throw new Nobal(amt);
				}
			double c= balance-amt;
			System.out.println("withdrawal sucessful...balance is :"+c);
	}
	public static void main(String args[]) {
		ces cs= new ces();
		try {
			cs.withdraw(400000.00);
			System.out.println("thankyou...");
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}
