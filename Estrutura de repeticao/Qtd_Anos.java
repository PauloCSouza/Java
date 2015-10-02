
import javax.swing.*;
class Qtd_Anos {

 public static void main (String args [ ])
	{
		double flo,cla;
		int anos=0; 
		flo=1.10;
		cla=1.50;		
		while (flo <= cla) 
		    {
		    	flo = flo+0.05;
		    	cla = cla+0.02;
		  	  	anos++;
			}

	    System.out.println ("A quantidade sera de : "+anos);		
	
		
	System.exit(0);
	} // fim do void main
} // fim da classe
