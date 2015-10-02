import javax.swing.JOptionPane;
public class Temperatura
  {
	public static void main (String args [])
	
	{
	  double F,C;
	  F = Double.parseDouble(JOptionPane.showInputDialog("DIGITE VALOR F" ));
	  
	  C = (5*(F-32)/9);
      JOptionPane.showMessageDialog(null,"CELSIUS "+C); 	
		
		
		
	}
}