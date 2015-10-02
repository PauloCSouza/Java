import javax.swing.JOptionPane;

public class Calcula
{
	public static void main (String args[])
	{
		
		int A,B,C;
		
		A = Integer.parseInt(JOptionPane.showInputDialog("Digite A "));
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

