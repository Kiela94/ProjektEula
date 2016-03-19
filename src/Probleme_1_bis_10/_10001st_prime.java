package Probleme_1_bis_10;

public class _10001st_prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Prüfen welche Primzahl an 10.001er Stelle steht.
		 */
		long currentNo = 0L;
		long pos = 0L;
		long primNo = 0L;
		
		do{
			
			if(isPrim(currentNo)){
				primNo = currentNo;
				pos++;
			}
			currentNo++;
		}while( pos != 10001); //<----
		
		System.out.println(primNo);

	}
	
	/**
	 * Prüft ob die gegebene Zahl prim ist.
	 * @param value
	 * @return
	 */
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
