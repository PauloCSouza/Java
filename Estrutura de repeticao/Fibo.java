
import javax.swing.*;
class Fibo {

 public static void main (String args [ ])
	{
		int anterior=0,atual=0,proximo=0,nvezes=0,cta=1;
		anterior = 1;
		atual = 0;
        nvezes = Integer.parseInt(JOptionPane.showInputDialog("Digite Numero de Vezes"));		
		while (cta <= nvezes) 
		    {
		    	proximo = atual+anterior;
		    	System.out.print (" "+proximo);
		        anterior = atual;
		        atual = proximo; 		
    	  	  	
		        cta++;
			}
    System.out.println (" ");
	} 
}	
