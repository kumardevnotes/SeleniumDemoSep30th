
public class ArraysDemo {

	public static void main(String[] args) {

		int empId = 1122;

		empId = 3344;
		// System.out.println(empId);

		// Arrays in Java -- Using arrays We can store multiple values into a single
		// array variable

		int[] empIds = { 1122, 2233, 3344, 4433, 1234 };

//		System.out.println(empIds[0]); // 0
//		System.out.println(empIds[1]);
//		System.out.println(empIds[2]);
//		System.out.println(empIds[3]);
//		System.out.println(empIds[empIds.length - 1]); // last element
//		System.out.println(empIds.length);

		for (int i = 0; i < empIds.length; i++) {
			if(empIds[i] == 3344) {
				System.out.println("empId found!");
				break;
			}
			else {
				System.out.println("empId not found!");
			}
		}
	}

}
