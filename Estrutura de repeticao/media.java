/**
 * Media de Valores
 *
 */

import javax.swing.*;
class media {

// na estrutura de repetição while

	public static void main (String args [ ])
	{
		double n,md; // criar variável n
		int cta;
		cta = 0;
		n = 0; // instanciar a variável n com zero
		md =0;
		while (cta < 10) // enquanto (n<10)
		{
			n = Double.parseDouble(JOptionPane.showInputDialog("Digite o número"));
			cta = (cta + 1); // acrescentando 1 ao valor de n
			md = (md + n);
		} // fim do while
		md = (md/10);
		System.out.println ("a media he " +md); // exibir valor n
		System.exit(0);
	} // fim do void main
} // fim da classe
