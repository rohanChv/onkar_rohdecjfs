import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalInterfaces {

	public static void main(String[] args) {
		 
		String[] str = {"Nikhil", "Arjun","Piyush"};
		
		
		Supplier<String> supplier = ()-> Arrays.toString(str) ;
		System.out.println(supplier.get());                           

		Consumer<String[]> consumer = (string) -> System.out.println(Arrays.toString(string));        
		consumer.accept(str);                                                                       
		Predicate<String[]> predicate = (string) -> Arrays.toString(string).contains("Nikhil");     
		System.out.println(predicate.test(str));                                                     
	
		Function<String[], String> function = (string) -> Arrays.toString(string);               
		
	}
	

}