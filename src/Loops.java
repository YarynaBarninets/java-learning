import java.util.Scanner;

public class Loops {
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		// Example of using break statement
		do
		{
			System.out.println("Please enter number : \n");
			int inputNum = Integer.parseInt(in.nextLine());
			
			if(inputNum == -1)
				break;
			
		} while(true);
		
		// Example of using continue statement
		for(int i = 0; i < 100; i++)
		{
			if(i % 2 != 0 )
				continue;
			
			System.out.print(i + "\n");
		}
	}
}
