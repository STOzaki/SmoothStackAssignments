package day2;
public class MultipleAddition {

	public MultipleAddition() {
		
	}
	
	
	public static void main(String[] args) {
		int sum = 0;
		try {
			
			// try to parse the arguments numbers
			for(String arg : args) {
				sum += Integer.parseInt(arg);
			}

			System.out.println("This is your sum: " + sum);

		} catch(NumberFormatException nfe) {
			// one of the arguments were incorrect
			System.out.println("ERROR: one or more of your arguments are not a number.");
			System.exit(1);
		}
	}
}
