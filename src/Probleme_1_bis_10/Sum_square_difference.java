package Probleme_1_bis_10;

public class Sum_square_difference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println( squareOfSum(1, 100) - sumOfSquares(1,100) );
	}

	/**
	 * Gibt das Quadrat der Summe der gegeben Zahlen zurück.
	 * Beispiel: (1 + 2 + ... + 10)^2 = 552 = 3025
	 * @param smallest
	 * @param biggest
	 * @return
	 */
	public static int squareOfSum(int smallest, int biggest ){
		int result = 0;
		
		for( int i = smallest; i <= biggest; i++ ){
			result = result +i;
		}
		result = result*result;
		return result;
	}
	
	/**
	 * Gibt die Summer aller quadrierten Zahlen zurück.
	 * 1^2 + 2^2 + ... + 10^2 = 385
	 * @param smallest
	 * @param biggest
	 * @return
	 */
	public static int sumOfSquares(int smallest, int biggest ){
		int result = 0;
		
		for( int i = smallest; i <= biggest; i++ ){
			result = result + i*i;
		}
		
		return result;
	}
}
