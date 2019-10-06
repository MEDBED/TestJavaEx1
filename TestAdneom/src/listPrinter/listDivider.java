package listPrinter;

import java.util.Arrays;
import java.util.List;

public class listDivider {
	public static List<Integer> MyList;

	public listDivider() {
		// TODO Auto-generated constructor stub
	}
	// main method
	public static void main(String[] args) {
		// let the party begin -_-
		System.out.println("Hope you like it  (-_-) ");
		// generate MyList
		MyList = createList(); 
		// print list before Operation
        System.out.println("Before operation: "+ MyList); 
        // print list after operation
		callForPartition();
		//use Java 8 Stream API second method
		useJava8StreamApi();
		}
	// list generator method
	public static  List<Integer> createList() {
		// LIST ELEMENT 
		final List<Integer> listOfNumbers = Arrays.asList(1,2,3,4,5);
		return listOfNumbers;	
		
	}
	// Result 
	public static void callForPartition() {
		System.out.println("----- After Operation: ------");
		System.out.println(partition.ofSize(MyList, 2));
		System.out.println(partition.ofSize(MyList, 3));
		System.out.println(partition.ofSize(MyList, 1));
		
	}
	//other ways
	public static void useJava8StreamApi() {
		System.out.println("----- Result with Java 8 Stream API: ------");
		Java8StreamAPI x  = new Java8StreamAPI();
		System.out.println("Hope you like"+ x.goodBy());
	}
	
	
	

}
