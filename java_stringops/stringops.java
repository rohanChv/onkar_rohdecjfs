package string;
import java.util.*;
public class stringops {
		public static void main(String args[]) {
			String str="Java String pool refers to collection of Strings Which are stored in memory heap";
			System.out.print("the original string is:"+str);
			String str1=str.toUpperCase();
			System.out.println("\nthe uppercase is :"+str1);
			str1=str.toLowerCase();
			System.out.println("\nthe lowercase is :"+str1);
			str1=str.replace("a","$");
			System.out.println("\nreplaced 'a' with '$' :"+str1);
			if(str.contains("collection")) {
				System.out.println("\ncontains the word collection");
			}
			str1="java string pool refers to collection of strings which are stored in memory heap";
			if(str.contentEquals(str1)) {
				System.out.println("\nStrings match");
			}
			else {
				System.out.println("\nNo match");
			}
			if(str.equalsIgnoreCase(str1)) {
				System.out.println("\nStrings match ignore previous message");
			}
			
			char[] str2 = str.toCharArray();
			System.out.print(str2[5]);
		}
}
