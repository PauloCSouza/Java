

import javax.swing.JOptionPane;
public class Triangulo {    

	public static void main (String args [ ])
	{
	
		int  A,B, C;
	
		A = Integer.parseInt(JOptionPane.showInputDialog("Digite a BASE"));
		B = Integer.parseInt(JOptionPane.showInputDialog("Digite a ALTURA"));
	
		C = (A * B)/2;
	
		System.out.println ("A AREA DO TRIANGULO: " + C);
		System.exit(0);
	} 
}
    
