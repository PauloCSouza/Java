import javax.swing.*;
public class ExCarregaNumeros
 {
   public static void main(String args [ ])
     {
	int M[][] = new int [8][8];
	int x,y,z;
	
	for ( z = 0 ; z < 4 ; z++ )
	    {
	       for ( x = z ; x < (8-z) ; x++ )
	           {
	             for ( y = z ; y < (8-z); y++)
		             {
		               M[x][y] = z+1;
		             }
		       }
		 
	    }  
	    
	 for ( x = 0 ; x < 8 ; x++ )
	     {
	      for ( y = 0 ; y < 8; y++)
	           {
	              System.out.print(" "+M[x][y]);
	            }
	        System.out.print("\n");    
	     }
		
	    
       System.exit(0);
    }
}