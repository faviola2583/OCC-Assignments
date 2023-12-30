//Faviola Bautista
import java.util.*;
public class Restaurant
{
	public static void main(String[] args) 
    { 
		Scanner reader = new Scanner(System.in);
		Random rand = new Random();
		
		//taking in user name and creating customer id 
		System.out.println("Welcome to Bubbakoos!");
		System.out.print("Please enter your first name: ");
		String name = reader.nextLine();
		String custid = name + rand.nextInt(1001);
		reader.nextLine();
		
		
		System.out.println("Your customer id is: " + custid);
		
		System.out.print("Are you a student? (y/n): ");
		String student = reader.nextLine();
		
		int tacos = 0, burritos = 0, enchi = 0;
		
		//present menu while user wants to keep ordering
		while(true)
		{
			System.out.println("\nBubbakoos menu: "
					+ "\n1. Taco is $4.99 each"
					+ "\n2. Burrito is $8.99 each"
					+ "\n3. Enchiladas are $9.99 each"
					+ "\ns for a summary of your order"
					+ "\nc to complete order"
					+ "\nq to quit");
			System.out.print("Please enter # (1-3, s, c, or q): ");
			System.out.println("\n\n");
			String prompt = reader.nextLine();
	
			//if q then break
			if(prompt.equals("q"))
			{
				System.out.println("You chose to quit, thank you for coming!");
				break;
			}
			
			//adding how many tacos/burritos/enchiladas the customer wants
			//and add it to the total
			if(prompt.equals("1"))
			{
				System.out.print("Enter quantity: ");
				tacos += reader.nextInt();
				System.out.println("You ordered " + tacos + " tacos");
			}
			
			if(prompt.equals("2"))
			{
				System.out.print("Enter quantity: ");
				burritos += reader.nextInt();
				System.out.println("You ordered " + burritos + " burritos");
			}
			
			if(prompt.equals("3"))
			{
				System.out.print("Enter quantity: ");
				enchi += reader.nextInt();
				System.out.println("You ordered " + enchi + " enchiladas");
			}
			
			//printing out summary / receipt
			if(prompt.equals("s") || prompt.equals("c"))
			{
				
					System.out.println("Your order is: ");
					
					if(tacos > 0)
						System.out.println(tacos + " Tacos = $" + (tacos*4.99));
					if(burritos > 0)
						System.out.println(burritos + " Burritos = $" + (burritos*8.99));
					if(enchi > 0)
						System.out.println(enchi + " Enchiladas = $" + (enchi*9.99));
					
					
					
					double total = (tacos * 4.99) + (burritos*8.99) + (enchi*9.99);
					int hero = (int) total / 30;
					int rewards = (int) total / 10;
					System.out.println("Amount: " + total);
					
					
					//applying any discounts that are applicable
					if(hero > 0)
					{
						System.out.println("Hero discount: $" + (hero*5));
						total = total - (hero*5);
					}
					
					if(student.equals("y"))
					{
						System.out.println("Student discount: $" + (total*.05));
						total = total - (total *.05);
					}
					
					
					
					System.out.println("Subtotal: $" + total);
					System.out.println("Tax: $" + (total*0.0625));
					total = total + (total*0.0625);
					
					System.out.println("Total with tax: $" + total);
					
					//adding points if applicable and exit
					System.out.print("\n\n");
					if(prompt.equals("c"))
					{
						if(rewards > 0)
						{
							System.out.println("Points earned: " + rewards);
							System.out.print("Thank you");
						}
						break;
						
					}
			
				
			}
			
			
		}
    }
}
