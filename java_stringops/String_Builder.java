package string;
import java.lang.*;
public class String_Builder {
	public static void main(String args[]) {
		StringBuilder sb = new StringBuilder("string buffer");
		sb.append(" is a peer class of string");
		System.out.print("\n"+sb);
		sb.append(" that provides much of");
		System.out.print("\n"+sb);
		sb.append(" functionality of strings.");
		System.out.print("\n"+sb);
		
		StringBuffer sb1 = new StringBuffer("It is used to _ specific index position");
		System.out.println("\n"+sb1);
		sb1.replace(14, 15, "insert at");
		System.out.println("\n"+sb1);
		sb1.replace(0, 46,"this method returns the reversed object on which it was called");
		
		System.out.println("\n"+sb1);
		sb1.reverse();
		System.out.println("\nreversed string :"+sb1);
	}
}
