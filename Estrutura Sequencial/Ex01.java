/**
 * @(#)Somar.java
 *
 *
 * @author 
 * @version 1.00 2008/2/16
 */

import javax.swing.JOptionPane;
public class Ex01 {    

	public static void main (String args [ ])
	{
		// declarao de variveis e/ou constantes
		int A, B, C;
		String senha;
		senha = JOptionPane.showInputDialog("Digite senha");
		System.out.println ("A senha é : " +senha);
		// mensagem ao usurio e entrada de dados
		A = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor em A"));
		B = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor em B"));
	    // processamento de dados
		C = A + B;
		// sada de resultados
		System.out.println ("A soma dos DOIS valores digitados : " + C);
		System.exit(0);
	} // fim do void main
} // fim da classe Somar
    
