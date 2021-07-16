import java.util.Scanner;

public class WhileSImpleApp {

	public static void main(String[] args) {
		
		//DATA
		final int PIN_SECRET = 8888;
		final int MAX_ATTEMPTS = 3;
		String userName = "John Doe";
		
		//init Scanner
		Scanner in = new Scanner(System.in);
		
		int attempt = 1;
		
		while (attempt >= 1 && attempt <= 3) {
			
			System.out.println("Enter pin: ");
			
			//Scanner
			int pinInput = in.nextInt();
			
			if( pinInput == PIN_SECRET ) {
				System.out.printf("Welcome, %s\n", userName);
				in.close();
				break;
				
			} else if (attempt != MAX_ATTEMPTS && pinInput != PIN_SECRET){
				
				int tempDisplayAttempts = MAX_ATTEMPTS - attempt;
				attempt++;
				
				if (tempDisplayAttempts == 1) {
					System.out.printf("Wrong pin code!!!\nYou have %d attempt!\nPlease try again\n\n", tempDisplayAttempts);
					
				} else {
					System.out.printf("Wrong pin code!!!\nYou have %d attempts!\nPlease try again\n\n", tempDisplayAttempts);
				}
				
			} else {
				attempt++;
				System.out.println("Wrong pin code!!!\nPlease Contact Support Department!\n\n");
				
			}
		}

	}

}
