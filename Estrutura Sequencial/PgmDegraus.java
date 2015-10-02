import javax.swing.JOptionPane;
public class PgmDegraus

  {
	public static void main (String args [])
	
	{
	  int degrau, ndegraus;
	  degrau = Integer.parseInt(JOptionPane.showInputDialog("DIGITE ALTURA DO DEGRAU EM CM" ));
	  ndegraus = (500000/degrau);
	  JOptionPane.showMessageDialog(null,"NUMERO DE DEGRAUS"+ndegraus); 	
		
		
		
	}
}