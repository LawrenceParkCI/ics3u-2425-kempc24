package unit2;

public class Review {

	public static void main(String[] args) {
		
		
		boolean flag = false;
		
		if(flag = true) {
			System.out.println("There is an error!");
		}
		else {
			System.out.println("We're good!");
		}
		
		

		int number = 0;
		
		if(number >= 0) {
			System.out.println("Positive");
			System.out.println("Thank you!");
		}
		else
			System.out.println("Negative");
		
		System.out.println("You're welcome");
		
		
		String name1 = "josh";
		String name2 = "Josh";
		
		if(name1.compareToIgnoreCase(name2) == 0) {
			System.out.println("Same name");
		}
		else {
			System.out.println("Different");
		}
		
	}

}
