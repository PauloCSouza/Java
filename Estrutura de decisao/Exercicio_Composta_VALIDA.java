import javax.swing.JOptionPane;

public class Exercicio_Composta_VALIDA
{
	public static void main (String args[])
	{
		// declaração de variáveis e/ou constantes
		int NUM,R;
		// mensagem ao usuário e entrada de dados
		NUM = Integer.parseInt(JOptionPane.showInputDialog("Digite a Idade"));
		R = (NUM%2);
		
		if (R == 0)
		 {
           JOptionPane.showMessageDialog(null,"PAR");
	     }
	 	else
		  {
		    JOptionPane.showMessageDialog(null,"IMPAR");
		  }
	}
}
