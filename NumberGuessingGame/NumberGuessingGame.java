import java.util.Scanner;

public class NumberGuessingGame
	{
		static Scanner userIntInput = new Scanner(System.in);
		static Scanner userStringInput = new Scanner(System.in);
		static boolean stillGuessing = true;
		static boolean wantsToPlay= false; 
		static int secretNumber;
		public static void main(String[] args)
					{
				greetPlayer();
				generateRandomNumber(); 
					while (stillGuessing)
						{
						askForUserGuess();
						evaluateGuess();
						}
				
					}
		
private static void evaluateGuess()
			{
				// TODO Auto-generated method stub
				int guess = userIntInput.nextInt();
				if (guess > secretNumber)
					{
					System.out.println("Too high");
					}
				else if (guess < secretNumber)
					{
					System.out.println("Too low");
					}
				else
					{
					System.out.println("You did it!");
					stillGuessing= false;
					}
				
			}

private static void greetPlayer()
			{
				// TODO Auto-generated method stub
				
				System.out.println("What is your name?");
				String name= userStringInput.nextLine ();
				System.out.println("Hi, " + name + ", I hope you enjoy the game!");
			}

private static void askForUserGuess()
			{
				// TODO Auto-generated method stub
				System.out.println("Guess a number from one to five.");

				

				
			}

private static void generateRandomNumber()
			{
				// TODO Auto-generated method stub
				 secretNumber = (int) (Math.random() * 5) + 1;
				
			}

//				boolean wantsToPlay = true;
//				while (wantsToPlay)
	{	
		System.out.println("Do you still want to play? Type yes or no.");
		String playAgainAnswer = userStringInput.nextLine();
			
			if (playAgainAnswer.equals("no"))
				
	
		System.out.println("Bye!");
		stillGuessing = false;
	}								
							

					
	}
	