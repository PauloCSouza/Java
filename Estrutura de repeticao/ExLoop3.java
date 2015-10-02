/**
 * Mostra Fatorial de um valor coletado *
 */

import javax.swing.JOptionPane;
class ExLoop03 {

 public static void main (String args [ ])
	{
		int n=0,cta=0,fat=1; 
		
		n = Integer.parseInt(JOptionPane.showInputDialog("DIGITE O VALOR"));
		for (cta = n; cta > 1; cta--)
		    {
		       fat = (fat * cta);	
		       	     
			}
		 System.out.println (" O FATORIAL "+fat);
               
    }
} 
