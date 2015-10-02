import javax.swing.JOptionPane;

public class Exerc_g
{
	public static void main (String args[])
	{
		
		int nasc,idade;
		
		nasc = Integer.parseInt(JOptionPane.showInputDialog("DIGITE A DATA DE NASCIMENTO"));
		idade = (2010-nasc);
			
		if (idade >= 21)
		 {
           JOptionPane.showMessageDialog(null,"PODE CASAR ESPONTANEAMENTE");
	     }
	 	else if (idade < 18)
		      {
		       JOptionPane.showMessageDialog(null,"NÃO PODE CASAR");
	          }
	       else
	          {
	           JOptionPane.showMessageDialog(null,"PODE CASAR COM O CONSENTIMENTO DOS PAIS");
	          }
  }
    
}

