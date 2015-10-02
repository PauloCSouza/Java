import javax.swing.JOptionPane;

public class Exercicio_Encadeada
{
	public static void main (String args[])
	{
		
		int idade;
		
		idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a Idade"));
		if (idade >= 18)
		 {
           JOptionPane.showMessageDialog(null,"PODE VOTAR E DIRIGIR");
	     }
	 	else if (idade >= 16)
		      {
		       JOptionPane.showMessageDialog(null,"PODE VOTAR,\n POREM NAO DIRIGIR");
	          }
	       else
	          {
	           JOptionPane.showMessageDialog(null,"NAO PODE VOTAR E DIRIGIR");
	          }
    }
    
}
