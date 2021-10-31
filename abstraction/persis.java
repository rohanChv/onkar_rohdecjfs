package java_abstract;

public class persis {
	
}
abstract class per{
	abstract void per1();
}
class file_per extends per{

	@Override
	void per1() {
		System.out.println("\nyou don't know whats going on backend...........");
		
	}
	
}
class db_per extends per{
	void per1() {
		System.out.println("\nyou don't know whats going on backend...........or wait....do you?");
	}
}
