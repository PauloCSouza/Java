
import javax.swing.JOptionPane;
public class AreaRetangulo {    
   public static void main (String args [ ])
	{
	int BASE,ALTURA,AREA;
	BASE = Integer.parseInt(JOptionPane.showInputDialog("DIGITE UM  VALOR DA BASE"));
    ALTURA = Integer.parseInt(JOptionPane.showInputDialog("DIGITE UM  VALOR DA ALTURA"));
	AREA = (BASE * ALTURA);
	JOptionPane.showMessageDialog(null,"A AREA EH "+AREA);
	} 
} 
    
