package java_abstract;

import java.util.Scanner;

public abstract class des_shop {
	int candy=0,cookie=0,ice_cream=0,i,i1,i2;
	int num;
	public void addItem(int num) {
		
		switch(num){
		case 1 :System.out.println("enter the number of candies:");
		Scanner sc= new Scanner(System.in);
		i=sc.nextInt();
		candy+=i;
			break;
		case 2:System.out.println("enter the number of cookies:");
		Scanner sc1= new Scanner(System.in);
		i1=sc1.nextInt();
		cookie+=i1;
			break;
		case 3:System.out.println("enter the number of icecream:");
			Scanner sc2= new Scanner(System.in);
			i2=sc2.nextInt();
			candy+=i2;
			break;
		case 4:System.out.println("current stock is candy:"+i+" cookies :"+i2+"icecream :"+i2);
		break;
		default:System.out.println("enter valid choice.......");
		}
	}
	abstract void getcost(int num1);
}
class custom extends des_shop{

	@Override
	void getcost(int num1) {
		switch(num1) {
		case 1:double candy=1.2*70+(1.2*70*0.28);
		System.out.println("\ncost of candy is : "+candy);
		break;
		case 2:double cookie=1.8*60+(1.8*70*0.28);
		System.out.println("\ncost of cookie is : "+cookie);
		break;
		case 3:double ice=70+(70*0.28);
		System.out.println("\ncost of icecream is : "+ice);
		break;
		default:System.out.println("enter valid choice.......");
		}
		
	}

	
}

