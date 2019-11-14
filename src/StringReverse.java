
public class StringReverse {
	
	public static void main(String[] args) {
		
		String input = "It is a test string";
		String output = reverse(input);
		System.out.println(output);
	}
	
	public static String reverse(String input)
	{
		String reverse = "";
		
		if (input.isEmpty() ||input == null)
		{
			System.out.println("Empty and null strings are not allowed");
		}
		
		if(input.length()<1)
		{
			reverse = input;
		}
		else
		{
			for(int i= input.length()-1; i>=0; i--)
			{
				reverse = reverse + input.charAt(i);
			}
			
		}
		
		return reverse;
	}
}

