import java.util.Scanner;

public class SwitchStatement {
	public static void main(String [] args)
	{
		Scanner a = new Scanner(System.in);
		System.out.println("Please, enter number a:\n");
		float inputA = Float.parseFloat(a.nextLine()); 
		
		System.out.println("Please, enter number b:\n");
		float inputB = Float.parseFloat(a.nextLine()); 
		
		System.out.println("Avavilable operations:\n 1: Addition\n 2: Substraction\n 3: Multiplication\n 4: Division\n " );
		System.out.println("Please, enter operation:\n");
		int inputC = Integer.parseInt(a.nextLine()); 
		
		float result = 0.0f;
		switch(inputC) {
			case 1:
				result = inputA + inputB;
			break;
			
			case 2: 
				result = inputA - inputB;
			break;
			
			case 3: 
				result = inputA * inputB;
			break;
			
			case 4: 
				result = inputA / inputB;
			break;
			
			default: 
				System.out.println(" No such operation available ");
		
		}
		
		System.out.println("Result = " + result);
		
	}
	

}
