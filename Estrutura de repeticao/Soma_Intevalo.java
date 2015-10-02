import javax.swing.*;
public class Soma_Intervalo{

	public static void main(String args [ ])
	{
		int cta,s=0;
		
		for ( cta = 100 ; cta<=500 ; cta++ )
		    {		
		      if ((cta%2)==0)
		         {
		          s = (s+cta);  	
		         } 
		    }
		    
	    System.out.println ("A soma he "+s);
	       	
	
	} 
}     
    
