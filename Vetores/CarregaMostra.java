
import javax.swing.*;
public class CarregaMostra {

	public static void main(String args [ ])
	{
		// declarao de variveis e/ou constantes
	/*	int Vet [ ] = {1,2,3,4,5,6,67}, i;
	
		for ( i = 0 ; i < 7 ; i++ )
		{		
		   System.out.println ("Vet[" + i + "] = " +Vet[i]);
		}
	*/
	int Mat[][] = {{1,2},{3,4}};
	
		for ( int x = 0 ; x < 2 ; x++ )
		    {		
		      for ( int y = 0 ; y < 2 ; y++ )
		          {		
		            System.out.println ("MAT = " +Mat[x][y]);
		          }
	        }
	
	
	
		System.exit(0);
	} // void main
} // classe ColetaMostrar    
    
