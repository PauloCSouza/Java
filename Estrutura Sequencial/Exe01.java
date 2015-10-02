
import javax.swing.JOptionPane;
public class Exe01 {    

	public static void main (String args [ ])
	{
		// declaração de variáveis e/ou constantes
		int base, altura, area;
		// mensagem ao usuário e entrada de dados
		base = Integer.parseInt(JOptionPane.showInputDialog("DIGITE VALOR PARA BASE"));
		altura = Integer.parseInt(JOptionPane.showInputDialog("DIGITE VALOR PARA ALTURA"));
	    // processamento de dados
		area = (base * altura);
		// saída de resultados
		JOptionPane.showMessageDialog(null,"A AREA É " + area);
		System.exit(0);
	} // fim do void main
} // fim da classe Somar
    
