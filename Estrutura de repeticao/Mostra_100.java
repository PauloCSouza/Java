/**
 * Exibir os 100 primeiros numeros
 *
 */

class Mostra_100 {

 public static void main (String args [ ])
	{
		int num = 0; // criar varivel n
		
		while (num < 100) // enquanto (n<100)
		    {
		      if (( num % 2) == 0)
		         {
		          System.out.println ("o numero he "+num);
			     } 
               	
              num = (num +1);
			}
	
	  System.exit(0);
	} // fim do void main
} // fim da classe
