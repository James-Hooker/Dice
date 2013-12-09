//Dice.java
//

import java.util.Random;

public class Dice {

    private static final Random randomNumbers = new Random( 89123 );

    public static int d( int faces ){
        return ( 1 + randomNumbers.nextInt(faces) );	//return a roll of a (faces) sided die
    }

    public static int[] d( int faces, int times ){
        int[] rolls = new int[ times ];	//initialize an array of (rolls) that is (times) big

	      for ( int i = 0; i < times; i++ )	//loop (times) x
	          rolls[ i ] =  d( faces );	//store rolls inside (rolls) array

        return rolls;
    }

    public static int[] d( int faces, int times, int keep ){
        int[] rolls = d( faces, times);

		int[] kept = new int[ keep ];

		int i = 0;
		int j = 0;
		int high = faces;
        int roll;

        do
        {
        	do
			{
        		roll = rolls[ i ];
        		if ( roll == high ){
        			kept[ j ] = roll;
        			j++;
        		}
        		i++;
			} while ( i < times && j < keep );
        	high--;
			i=0;
		} while ( j < keep && high > 0 );

		return kept;
    }

    public static int[][] d( int faces, int rolls, int keep, int sets ){
        int[][] set = new int[sets][keep];

        for ( int i = 0; i < sets; i++ )
        	set[i] = d( faces, rolls, keep );

        return set;
		}

}
