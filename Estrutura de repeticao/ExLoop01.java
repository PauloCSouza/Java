/**
 * Soma os 100 primeiros numeros positivos
 *
 */

class ExLoop01 {

 public static void main (String args [ ])
	{
		int n=0,s=0; 
		
		for (n = 1; n <= 100; n++)
		    {
		       s = (s + n);	
               	     
			}
		 System.out.println ("A SOMA "+s);	 
    }
} 
