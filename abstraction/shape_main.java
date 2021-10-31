package java_abstract;

public class draw {
	public static void main(String args[]) {
		shape s = new line();
		s.draw();
		shape s1= new rectangle();
		s1.draw();
		shape s2=new circle();
		s2.draw();
	}
}
