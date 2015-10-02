import javax.swing.*;
public class SomaIntervalo{

	public static void main(String args [ ])
	{
		int cta,s=0;
		
		for ( cta = 100 ; cta<=106 ; cta++ )
		    {		
		      if ((cta%2)==0)
		         {
		          s = (s+cta);  	
		         } 
		    }
		    
	    System.out.println ("A soma he "+s);
	       	
	
	} 
}     
    
