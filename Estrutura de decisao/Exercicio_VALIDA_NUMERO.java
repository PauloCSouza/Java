import javax.swing.JOptionPane;

public class Exercicio_Simples
{
	public static void main (String args[])
	{
		// declara��o de vari�veis e/ou constantes
		int idade;
		// mensagem ao usu�rio e entrada de dados
		idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a Idade"));
		if (idade >= 18)
		 {
           JOptionPane.showMessageDialog(null,"PODE DIRIGIR");
	     }
	 	
	}
}
