
public class FirstDemo {

	// Declaring a string variable empName
	static String empName = "Tom Cruise";

	// Declaring and assigning a value to int variable empID
	static int empID = 1122;

	static int a = 100, b = 200;

	public static void main(String[] args) {
		System.out.println("employee Name: " + empName); //String + String -> String
		System.out.println("employee ID: " + empID);  // String + int --> String
		System.out.println(a+b); //int + int --> int
		System.out.println("Sum: " + a + b); //String + int + int ---> String
		System.out.println( a + b + "Sum: "); // 300Sum: 
		int c = a + b; // c == 300
		System.out.println("Sum: " + c); //Sum: 300
	}

	// Declaring user defined or custom method
	public static void displayEmpName() {
		System.out.println("John Legend");
	}
}
