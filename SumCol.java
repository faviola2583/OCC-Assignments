//Faviola Bautista
//This program takes in an array and a certain column number and adds the sum of that column number
public class SumCol 
{

	//method for finding the sum of the row 
	public static double sumColumn(double [][] grid, int columnIndex)
	{ 
		double sum = 0; 
		 for (int row = 0; row <  grid.length; row++) 
		 {
		        
		        for (int col = 0; col < grid[row].length; col++) 
		        {
		        		if(col == columnIndex)
		        		{
		        			 sum += grid[row][col];
		        		}
		           
		       
		        }
		 }
		
		return sum;
	}
	
	//test class using example for finding the column sum
	public static void main(String[] args) 
	{
		double [][]theArray = {{1, 2, 3, 4},
							{5,6,7,8},
							{9,10,11,12}};
		
		
		System.out.print(sumColumn(theArray, 2));

	}

}
