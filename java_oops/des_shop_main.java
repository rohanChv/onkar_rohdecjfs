package java_abstract;

import java.util.Scanner;
import java.io.*;
public class shop_main {
public static void main(String args[]) {
	int num;
	des_shop d1 = new custom();
	System.out.println("enter your role \n1.owner\n2.customer");
	Scanner sc = new Scanner(System.in);
	num=sc.nextInt();
	switch(num) {
	case 1:
	System.out.println("enter your choice to update Stock \n1.candy\n2.cookie\n3.icecream\n4.view Stock");
	Scanner sc1= new Scanner(System.in);
	num=sc1.nextInt();
		d1.addItem(num);
	break;
	case 2:System.out.println("enter your choice to puchase: \n1.candy\n2.cookie\n3.icecream\n");
	Scanner sc2= new Scanner(System.in);
	num=sc2.nextInt();
	d1.getcost(num);
	}
	
}
}
