// DiceTest.java
//

public class DiceTest
{
	public static void main( String[] args )
	{
        //d( faces ) text 10x
		for ( int i = 0; i < 10; i++ )	//loop 10x
			System.out.print( Dice.d(6) );	//roll a 6 sided die and print results
		System.out.println("end");	//next line
		//d( faces, times ) test 10x
		int[] dice;	//create array to hold die rolls
		for ( int j = 0; j < 10; j++ ){	//loop 10x
  		    dice = Dice.d(6,4);	//roll 4 6 sided die
	  	    for ( int i = 0; i < 4; i++ )	//loop through 4 die rolled
		  	    System.out.print( dice[ i ] );	//print results of die rolls
		    System.out.print("-");
		}
		System.out.println("end");
        //d( faces, times, keep ) test 10x
        int[] dice2;
		for ( int j = 0; j < 10; j++ ){
			dice2 = Dice.d(6,6,4);	//roll 6 4 sided die and keep highest 4
			for ( int i = 0; i < 4; i++ )
				System.out.print( dice2[ i ] );
			System.out.print("-");
		}
		System.out.println("end");
		//d( faces, times, keep, sets ) text 10x
		int[][] set;
		for ( int k = 0; k < 10; k++ ){
			set = Dice.d(6, 6, 4, 5);
			for ( int j = 0; j < 5; j++){ //j sets
				System.out.printf("%s - %d = ","set",j);
				for ( int i = 0; i < 4; i++ )
					System.out.print(set[j][i]);
				System.out.println("");
			}
			System.out.println("\n");
		}
	}
}
