package Probleme_1_bis_10;

public class Multiples_of_3_and_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(SumOfmultiplesOfThreeAndFive(1000));

	}
	
	/**
	 * Diese Methode gibt die Summe aller Multiplen von 3 und 5 zurück bis zur gegeben Zahl max.
	 * @param max
	 * @return
	 */
	public static int SumOfmultiplesOfThreeAndFive( int max )
	{
		int sum = 0;
		
		for( int i = 0; i < max; i++ )
		{
			if( i % 3 == 0 || i % 5 == 0 )
				sum+=i;
		}
		
		return sum;
	}
	

}
