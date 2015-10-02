/**
 * Mostra tabuada de um valor coletado *
 */

import javax.swing.JOptionPane;
class ExLoop02 {

 public static void main (String args [ ])
	{
		int n=0,cta=0; 
		
		n = Integer.parseInt(JOptionPane.showInputDialog("DIGITE O VALOR"));
		for (cta = 1; cta <= 10; cta++)
		    {
		       System.out.println (n+" * "+cta+" = "+ cta*n);
               	     
			}
		 
    }
} 
