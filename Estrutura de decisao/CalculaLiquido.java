import javax.swing.JOptionPane;

public class Calcula
{
	public static void main (String args[])
	{
		
		double SB,SL,DESC;
		
		SB = Double.parseDouble(JOptionPane.showInputDialog("Digite A "));
		B = Integer.parseInt(JOptionPane.showInputDialog("Digite B "));
		if (A > B)
		   {
		  	C = (A - B);
		   }
	 	else
	 	   {
	 	   	
	 	   	C = (B - A);
	 	   }
	 	
	 	JOptionPane.showMessageDialog(null,"RESULTADO "+C);
              
  }
    
}


