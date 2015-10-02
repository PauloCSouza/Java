  /**
     * Exibir os 100 primeiros numeros
     *
     */

     import javax.swing.*;
     class MostraParesImpares {

     public static void main (String args [ ])
	  {
	     int num=0,par=0,impar=0; 
	
	     while (num < 100) 
	           {
	           	  if ( num % 2 == 0)
	           	      {
	           	      	par++;
	           	      }
	           	  else
	           	      {
	           	      	impar++;
	           	      }    
                  num = (num + 1);
                 
	           }
	           
      System.out.println ("QTDE DE PARES "+par+ "\nQTDE DE IMPARES "+impar); 
	  System.exit(0);
	} 
} 
