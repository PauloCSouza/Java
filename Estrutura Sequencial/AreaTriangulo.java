import javax.swing.JOptionPane;
public class AreaTriangulo {    

	public static void main (String args [ ])
	{
	
		int  base,altura,area;
	
		base = Integer.parseInt(JOptionPane.showInputDialog("Digite a BASE"));
		altura = Integer.parseInt(JOptionPane.showInputDialog("Digite a ALTURA"));
	
		area = (base * altura)/2;
	
		System.out.println ("A AREA DO TRIANGULO: " + area);
		
	} 
}
 