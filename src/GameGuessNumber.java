import java.util.Random;
import java.util.Scanner;

public class GameGuessNumber {
	public static final int m_numberGeneratorUpperRange = 10;
	
	public static void main(String [] args)
	{
		// read input number
		Scanner in = new Scanner(System.in);
		System.out.println("Please, enter number:\n");
		int inputNumber = Integer.parseInt(in.nextLine()); // blocking code because wait for an action from another entity
		System.out.print("Converted value: " + inputNumber + "\n") ;
		
		// generate random number
		Random r = new Random();
		int numberToGuess = r.nextInt(m_numberGeneratorUpperRange);
		System.out.print("Random generated number: " + numberToGuess);
		
		// check that numbers matches
		do
		{
			System.out.println("\nWrong number, try again: \n");
			inputNumber = Integer.parseInt(in.nextLine());
		}
		while (inputNumber != numberToGuess);
		
		System.out.print("Congrats, you guessed a number!");
		in.close();
	}
}
