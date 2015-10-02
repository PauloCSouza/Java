import javax.swing.JOptionPane;
public class Temperatura02
  {
	public static void main (String args [])
	
	{
	  double F,C;
	  C = Double.parseDouble(JOptionPane.showInputDialog("DIGITE VALOR CELSIUS" ));
	  F = (C * 9 + 160) / 5;
	  JOptionPane.showMessageDialog(null,"Fahrenheit "+F); 	
		
		
		
	}
}