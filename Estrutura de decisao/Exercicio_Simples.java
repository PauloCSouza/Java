import javax.swing.JOptionPane;

public class Exercicio_Simples
{
	public static void main (String args[])
	{
		int idade;
		idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a Idade"));
		if (idade >= 18)
		 {
           JOptionPane.showMessageDialog(null,"MAIOR DE IDADE, PODE VOTAR E DIRIGIR ");
	     }
	 	
	}
}
