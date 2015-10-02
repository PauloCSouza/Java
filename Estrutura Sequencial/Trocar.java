import javax.swing.JOptionPane;
public class Trocar {    
	public static void main (String args [ ])
	{
		int X,Y,Z;
		X = Integer.parseInt(JOptionPane.showInputDialog("DIGITE VALOR DE X"));
		Y = Integer.parseInt(JOptionPane.showInputDialog("DIGITE VALOR DE Y"));
		Z=X;
		X=Y;
		Y=Z;
		JOptionPane.showMessageDialog(null,"OS VALOR DE X "+X+" VALOR Y "+Y);
	} 
} 
    
