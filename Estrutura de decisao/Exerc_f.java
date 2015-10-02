import javax.swing.JOptionPane;

public class Exerc_f
{
	public static void main (String args[])
	{
		
		int A,B;
		
		A = Integer.parseInt(JOptionPane.showInputDialog("DIGITE O VALOR DE A "));
		B = Integer.parseInt(JOptionPane.showInputDialog("DIGITE O VALOR DE B "));
		if (A < B)
		   {
            JOptionPane.showMessageDialog(null,A+" "+B);
	       }
	 	else 
	 	   {
            JOptionPane.showMessageDialog(null,B+" "+A);
	       }
	 	
	}
    
}

