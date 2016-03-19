package Probleme_1_bis_10;

public class Largest_prime_factor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long number = 600851475143L;
		largestPrimeFactor(number);
	}
	
	/**
	 * Gibt den größten Primfaktor von der gegeben Zahl aus.
	 * Beispiel: Die Primfaktoren von 13195 sind 5, 7, 13 und 29.
	 * @param number
	 */
	public static void largestPrimeFactor( long number )
	{
		System.out.println("Starte mit : " + number );
		
		long value = number;
		// primzahl
		for( long i = 2L; i < number; i++)
		{
			if( isPrim(i) )
			{
				while( value % i == 0 )
				{
					System.out.println("Value: "+ value + " wird geteilt durch: "+ i );
					value = value / i;
					if(isPrim(value))
					{
						System.out.println(value);
						return;
					}
						
				}
			}
		}
		
	}
	
	public static boolean isPrim(final long value) 
	{
        if (value <= 2) 
        {
            return (value == 2);
        }
        for (long i = 2L; i * i <= value; i++)
        {
            if (value % i == 0) {
                return false;
            }
        }
        return true;
    }

}
