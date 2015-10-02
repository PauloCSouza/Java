
import javax.swing.JOptionPane;
public class Troca {    

	public static void main (String args [ ])
	{
		// declaração de variáveis e/ou constantes
		int V1,V2,V3;
		// mensagem ao usuário e entrada de dados
		V1 = Integer.parseInt(JOptionPane.showInputDialog("DIGITE VALOR PARA V1"));
		V2 = Integer.parseInt(JOptionPane.showInputDialog("DIGITE VALOR PARA V2"));
	    // processamento de dados
	    V3 = V1;
	    V1 = V2;
	   	V2 = V3;
		//saída de resultados
		JOptionPane.showMessageDialog(null,"O VALOR DE V1  É " + V1);
       JOptionPane.showMessageDialog(null,"O VALOR DE V2  É " + V2);
		System.exit(0);
	} // fim do void main
} // fim da classe Somar
    
