
import javax.swing.JOptionPane;
public class CalcTrianguloRetangulo {    
	public static void main (String args [ ])
	{
		int LADO,AREA;
		
		
		LADO = Integer.parseInt(JOptionPane.showInputDialog("DIGITE UM  VALOR DO LADO"));
		AREA = (LADO * LADO);
		System.out.println("A AREA DO QUADRADO 	EH "+AREA);
	} 
} 
    
