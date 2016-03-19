package Probleme_1_bis_10;

public class Largest_palindrome_product {

	public static void main(String[] args)
	{
		palindrome();
	}
	
	/**
	 * Gibt das größe Palindrome aus, welches durch ein Produkt von 3-stelligen Zahlen erzeugt wird.
	 */
	public static void palindrome()
	{
		System.out.println("Starte");
//		int count = 0;
		int value;
		String palindrom;
		boolean b_palindrom;
		int biggest = 0;
		for(int i = 999; i > 99; i--)
		{
			for( int j = 999; j > 99; j--)
			{
				b_palindrom = true;
				value = i*j;
//				count+=1;
				palindrom = Integer.toString(value);
				for(int k = 0; k < palindrom.length(); k++ )
				{
					if( palindrom.charAt(k) != palindrom.charAt(palindrom.length()-k-1))
					{
						b_palindrom = false;
						break;
						
					}
					
				}
				if(b_palindrom)
				{
					if( biggest < value )
						biggest = value;
					System.out.println(i +" * " + j + " = " + palindrom);
				}
				
			}
		}
		System.out.println(biggest);
	}
}

