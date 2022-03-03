import java.util.*;

//Faviola Bautista 
//This program takes in words and outputs them as telephone numbers.
public class PhoneConverter 
{
	
	//depending on what the character is, it is changing it into a number
	public static char letterToDigit (char string)
	{
		if(string == 'a' || string == 'b' || string == 'c'
				|| string == 'A' || string == 'B' || string == 'C')
			return '2';
		
		else if(string == 'd' || string == 'e' || string == 'f'
				|| string == 'D' || string == 'E' || string == 'F')
			return '3';
		
		else if(string == 'g' || string == 'h' || string == 'i'
				|| string == 'G' || string == 'H' || string == 'I')
			return '4';
		
		else if(string == 'j' || string == 'k' || string == 'l'
				|| string == 'J' || string == 'K' || string == 'L')
			return '5';
		
		else if(string == 'm' || string == 'n' || string == 'o'
				|| string == 'M' || string == 'N' || string == 'O')
			return '6';
		
		else if(string == 'p' || string == 'q' || string == 'r' || string == 's'
				|| string == 'P' || string == 'Q' || string == 'R' || string == 'S')
			return '7';
		
		else if(string == 't' || string == 'u' || string == 'v'
				|| string == 'T' || string == 'U' || string == 'V')
			return '8';
		
		else if(string == 'w' || string == 'x' || string == 'y'	|| string == 'z'
				|| string == 'W' || string == 'X' || string == 'Y' || string == 'Z')
			return '9';
		
		
		return string;
	}
	
	//Changing original phrase to real phone number phrase using the letter to digit method.
	public static String wordsToPhoneNum(String phrase)
	{
		int [] array = new int [phrase.length()];
		String newNum = "";
		
		for (int i = 0; i < array.length; i++)
		{
			char addVar = phrase.charAt(i);
			Character.toString(addVar);
			newNum += letterToDigit(addVar);
		}
		

		//depending on length of phone number, adding hyphens where appropriate 
		if((newNum.length() >= 2 && newNum.length() < 5) )
			newNum = newNum.substring(0, 1) + "-" + newNum.substring(1, newNum.length());
		
		else if(newNum.length() > 4 && newNum.length() < 8)
			newNum =  newNum.substring(0, 1) + "-" + newNum.substring(1, 4) + "-" + newNum.substring(4, newNum.length());
		
		else if(newNum.length() > 7)
			newNum = newNum.substring(0, 1) + "-" + newNum.substring(1, 4) + "-" + newNum.substring(4, 7) + "-" + newNum.substring(7);
			
		return newNum;
	}
	
	public static void main (String [] args)
	{
		Scanner reader = new Scanner(System.in);
		String originalSlog = " ", newSlogan = "";
		boolean keepPlaying = true;
		
		while (keepPlaying)
		{
			//taking in phrase from the user
			System.out.print("Enter a statement you would like to convert to a phone number\n" +
					 "EX: 1-800-GET-CASH: ");
			originalSlog = reader.nextLine();
			
			System.out.println();
			
			//getting rid of special characters and if phrase is too long, cut it down to 11 characters.
			newSlogan = originalSlog.replaceAll("[^a-zA-Z0-9]", "");
			
			if(newSlogan.length() > 11)
			{
				newSlogan = newSlogan.substring(0, 11);
			}
			
			//printing out the phone number with words and showing how it would be as a real phone number
			System.out.println(originalSlog + " as a phone number would be " + wordsToPhoneNum(newSlogan));
			
			
			//asking if user wants to add another phrase, if "no" or invalid input, kick out of program
			System.out.print("Do you want to translate another phrase?(yes or no): ");
			String answer = reader.nextLine();
			System.out.println();
			
			
			if(answer.equalsIgnoreCase("no"))
			{
				keepPlaying = false;
				System.out.println("Thanks for playing!");
			}
				

			else if(!answer.equalsIgnoreCase("yes"))
			{
				System.out.println("Invalid input");
				keepPlaying = false;
			}
				
		}
		
		
		
	}
}
