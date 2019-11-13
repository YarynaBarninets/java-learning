
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
			String[] arr = input.split("");
			
			for(String item: arr)
			{
				reverse = item + reverse;
			}
		}
		
		return reverse;
	}
}
