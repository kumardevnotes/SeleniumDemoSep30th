
public class JavaStringMethodsDemo {

	public static void main(String[] args) {

		String city = "NewYork";
		//city[0] = N
		//city[1] = e
		//city[2] = w
		//city[3] = Y
		//city[4] = o
		//city[5] = r
		//city[length-1] == city[6] = k
		//length() --> 7
		System.out.println(city);
		
		System.out.println(city.toUpperCase()); //NEWYORK
		System.out.println(city.toLowerCase()); //newyork
		System.out.println(city.charAt(5)); //r
		System.out.println(city.length()); //7
		System.out.println(city.replace('Y', 'X')); // NewXork
		System.out.println(city.concat(" NewJersy")); //NewYork NewJersy
		System.out.println(city.equals("newyork")); //false
		System.out.println(city.equalsIgnoreCase("newyork")); //true
		System.out.println(city.indexOf('Y')); //3
		
		System.out.println(city.contains("New"));
		System.out.println(city.contains("YorkNew"));
		
		city = "";
		System.out.println(city.isEmpty()); //
		
		
		city = "    NewYork   ";
		System.out.println(city);
		System.out.println(city.trim());
	}

}
