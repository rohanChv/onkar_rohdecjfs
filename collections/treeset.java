package string;
import java.util.*;
class emp implements Comparable<emp>{
	int id;
	String name,dep;
	double sal;
	public emp(int id,String name,String dep,double sal) {
		this.id=id;
		this.sal=sal;
		this.dep=dep;
		this.name=name;
	}

	@Override
	public int compareTo(emp o) {
		if(sal>o.sal) {
			return 1;
		}
		if(sal<o.sal) {
			return -1;
		}
		else
		return 0;
	}

}
public class treeset{
	public static void main(String args[]) {
	TreeSet<emp>ts=new TreeSet<emp>();
	emp e1=new emp(123,"ram","it",23456.098);
	emp e2=new emp(1233,"ramesh","it1",13456.098);
	emp e3=new emp(1235,"raman","it2",23459.098);
	emp e4=new emp(1236,"rajat","it3",23956.098);
	emp e5=new emp(1230,"tim","it4",33456.098);
	emp e6=new emp(1253,"ali","it5",63456.098);
	emp e7=new emp(12311,"rohan","it8",93456.098);
	emp e8=new emp(1101,"cook","it9",443456.098);
	emp e9=new emp(1293,"manoj","it10",234596.098);
	emp e01=new emp(1283,"ok","it11",238456.098);
	ts.add(e1);
	ts.add(e2);
	ts.add(e3);
	ts.add(e4);
	ts.add(e5);
	ts.add(e6);
	ts.add(e7);
	ts.add(e8);
	ts.add(e9);
	ts.add(e01);
	System.out.println("\nenter choice :\n1.view salaries\n2.view names\n3.view department\n4.view id");
	Scanner sc1 =new Scanner(System.in);
	int ch=sc1.nextInt();
	
	switch(ch) {
	
	case 1:
		for(emp e23:ts) {
		System.out.println(e23.sal);
		}
		break;
			case 2:
				for(emp e23:ts) {
					System.out.println(e23.name);
					}
				break;
			case 3:
				for(emp e23:ts) {
				System.out.println(e23.dep);
				break;
				}
				case 4:
					for(emp e23:ts) {
						System.out.println(e23.id);
						break;
				}
			case 5:System.exit(1);
	}
	}
}