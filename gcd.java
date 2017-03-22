/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static long gcd( long a, long b, long temp)
    {
    //    System.out.println("b:: "+b+"  temp:   "+temp);   
        if( b <= 1 )
           return b;
        else if( ( a %b == 0 ) && (temp %b == 0) )
        {
            System.out.println("result in a funtion: "+b);   
            return b;
        }
        else
        return gcd(b, a%b, temp);
        
    }
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc = new Scanner( System.in );
// If a is always greater than b. i.e. a> b
	    System.out.println("Enter your First Number");
	    long a = sc.nextLong();
	    System.out.println("Enter your second Number");
	    long b = sc.nextLong();
	    long res;
	    
	    if(a > b)
	       res = gcd(a, b, b);
	    else
	       res = gcd(b, a, a);
	    System.out.println("Out of Function: "+res);
		// your code goes here
	}
}
