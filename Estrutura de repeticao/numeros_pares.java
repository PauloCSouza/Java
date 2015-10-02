/**
 * Exibir os numeros
 *
 */

import javax.swing.*;
class numeros_pares {

// na estrutura de repetição while

	public static void main (String args [ ])
	{
		int n,r; // criar variável n
		int cta;
		cta = 0;
		n = 0; // instanciar a variável n com zero
		r =0;
		while (cta < 10) // enquanto (n<10)
		{
			n = Integer.parseInt(JOptionPane.showInputDialog("Digite o número"));
			r = ( n % 2);
			if (r == 0 )
			   {
			   	System.out.println ("o numero he par "+n); // exibir valor n
			   }
			cta = (cta + 1); // acrescentando 1 ao valor de n
		} // fim do while
		
		System.exit(0);
	} // fim do void main
} // fim da classe
