package Probleme_1_bis_10;

public class Even_Fibbonacci_numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sumOfFibonacciTerms(4000000));

	}

	/**
	 * Diese Methode gibt alle die SUmme aller geraden Fibonacci-Zahlen zurück.
	 * @param max
	 * @return
	 */
	public static int sumOfFibonacciTerms( int max )
	{
		int sum = 2;
		int first = 1;
		int second = 2;
		int third = 0;
		
		do
		{
			third = 0;	
			third = first + second;
			// calculate sum of even numbers
			if( third %2 == 0)
				sum += third;
			first = second;
			second = third;
			System.out.println(third);
		}
		while( first + second < max );
		return sum;
	}
}
