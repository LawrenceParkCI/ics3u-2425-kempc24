package unit2;

/**
 * Description:
 * Date:
 * @author 
 */
public class Randomness {

	/**
	 * This is the entry point to the program
	 * @param args unused
	 */
	public static void main(String[] args) {
		/*
		 * The basic random number generator is the method Math.random(). 
		 * Every time you call this method, you get a new pseudo-random number of type double 
		 * between 0 (inclusive) and 1 (non-inclusive) like 0.7282210632205262 or 0.01602778910465852.
		 */
		
		System.out.println("PART 1");
		double randomNum = Math.random();
		System.out.println(randomNum);
		
		/*
		 * Run the code 10 times and record the number that 
		 * is printed to the console
		 * 
		 * Trial|	randomNum
		 * -----------------------
		 *  1	|
		 *  2	|
		 *  3	|
		 *  4	|
		 *  5	|
		 *  6	|
		 *  7	|
		 *  8	|
		 *  9	|
		 * 10	|
		 */
		
		//Did your number ever go below 0?
		//Did your number ever go above 1?
		
		
		System.out.println("\nPART 2 - RANGES");
		/* RANGES
		 * If you want a number in a different range, you need to multiply.
		 * For example, if you want a number from 0 to 7, you multiply Math.random() by 8 
		 * (because there are 8 digits: 0, 1, 2, 3, 4, 5, 6, and 7) and cast it as an int like this:
		 * x = (int)(Math.random() * 8);
		 * Pay attention to the brackets
		 */
		
		
		randomNum = Math.random();
		System.out.println(randomNum + "\t" + randomNum*8 + "\t" + (int)(randomNum*8));
		
		/*
		 * Try it:
		 * Run the program at least 10 times (to get a good variety) and record the values
		 * 		Math.random()		Math.random()*8		(int)(Math.random()*8)
		 * --------------------------------------------------------------------
		 * Ex.	0.0578246299535925	0.46259703962874	0
		 *  1	
		 *  2	
		 *  3	
		 *  4	
		 *  5	
		 *  6	
		 *  7	
		 *  8	
		 *  9	
		 *  10	
		 */
		
		// What is the smallest number you could get (in the right-hand column)?
		// What is the largest possible number you could get from this formula?

		System.out.println("\nPART 3 - STARTING VALUE");
		/*
		 * Now suppose you need a range of numbers that doesn’t start at 0? 
		 * We need to take the range of numbers that we already have and offset it by adding our starting value.
		 * Here is some code to generate numbers between 6 and 10:
		 * x = (int)(Math.random() * 5 + 6);
		 */
		
		randomNum = Math.random();
		System.out.println(randomNum + "\t" + randomNum*5 + "\t" + (int)(randomNum*5) + "\t" + (int)(randomNum*5+6));
		
		/*
		 * Try it:
		 * Run the program at least 10 times (to get a good variety) and record the values
		 * 
		 * 		Math.random()			Math.random()*5		(int)(Math.random()*5)	(int)(Math.random()*5 + 6)
		 * ----------------------------------------------------------------------------------------------------
		 * Ex.	0.039579187183012565	0.19789593591506283		0						6
		 *  1	
		 *  2	
		 *  3	
		 *  4	
		 *  5	
		 *  6	
		 *  7	
		 *  8	
		 *  9	
		 *  10	
		 */
		
		// Given: x = (int)(Math.random() * a + b)
		// For a given range you need to multiply by one number (a) and add another number (b)
		// What does a represent?
		// What does b represent?
		
		// Write an expression (like above) to simulate rolling a single six-sided die in Java.
		

		// Suppose you wanted to simulate rolling two dice. What would you do?

		

	}

}
