package string;
import java.util.*;
public class hashset {
public static void main(String args[]) {
	HashSet<String>hs = new HashSet<String>();
	while(hs.size()!=10) {
		System.out.println("enter the new element : ");
		Scanner sc = new Scanner(System.in);
		String t1=sc.next();
		if(hs.contains(t1)) {
			
		}
		else
			hs.add(t1);
	}
	System.out.println("hello following are contents of hash:\n"+hs);
}
}
