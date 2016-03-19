package Probleme_1_bis_10;

public class Smallest_multiple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		smallestMultiple();
	}

	/**
	 * Gibt die kleinste Zahl aus, die von allen Zahlen von 1-20 geteilt werden kann.
	 */
	public static void smallestMultiple()
	{
		int number = 20;
		boolean teilbar; 
		
		do
		{
			teilbar = true;
			for(int i = 1; i <=20; i++)
			{
				if( number % i != 0 )
				{
					teilbar = false;
				}
			}
			if( teilbar )
				System.out.print(number);
			
			number +=1;
			
		}while(teilbar == false);
		
	}
	
}
