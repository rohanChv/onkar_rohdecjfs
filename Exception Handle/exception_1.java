package java_abstract;
import java.util.*;
public class exception_1 {
public static void main(String args[]) {
	System.out.println("enter number 1:");
	Scanner sc = new Scanner(System.in);
	int a=sc.nextInt();
	System.out.println("enter number 2:");
	Scanner sc1 = new Scanner(System.in);
	int b=sc1.nextInt();
	try {
		int c= a/b;
		System.out.println("answer :"+c);
	}catch(UnsupportedOperationException e) {//Replace UnSupportedException with ArithmeticException
		System.out.println("Exception handling.number cannot be divided by 0");
	}
	finally {
		System.out.println("in final block");
	}
	
}
}
