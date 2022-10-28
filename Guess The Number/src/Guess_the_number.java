import java.util.Scanner;
	
	public class Guess_the_number {
		
		
		//making method to guess the number
		public void guessingnumber() {
			
			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);

			//generating random number using math random class
			int n = 1 + (int)(100 * Math.random());

			//x trials provided to the user
			int x = 3;

			int i, guess;

			System.out.println("A number is chosen between 1-100." + "3 trials will be given to you." + "Guess the number:");

			for (i = 0; i < x; i++) {

				System.out.print("Guess the number: ");

				guess = sc.nextInt();

				if (n == guess) {
					System.out.println("Guessed number is correct");
					break;
				}
				else if (n > guess && i != x - 1) {
					System.out.println("The guessed number is greater than " + guess);
				}
				else if (n < guess && i != x - 1) {
					System.out.println("The guessed number is less than " + guess);
				}
			}

			if (i == x) {
				System.out.println("You reached max number of trials");

				System.out.println("The number was " + n);
			}
		}

	

	public static void main(String[] args) {

		Guess_the_number g = new Guess_the_number();
		g.guessingnumber();

	}

}
