
import javax.swing.*;
public class VetorMes {

	public static void main(String args [ ])
	{
		// declarao de variveis e/ou constantes
		String Vet [ ];
		Vet = new String [12];
		int i,M; 
		// processamento de dados
		for ( i = 0 ; i < 12 ; i++ )
		{		
			// mensagem ao usurio e entrada de dados
			Vet[i] = JOptionPane.showInputDialog("Digite a DESCRI��O do m�s");
			
		} 
		
		M = Integer.parseInt(JOptionPane.showInputDialog("Digite n�mero do m�s"));
		System.out.println (" O m�s �  " +Vet[M-1]);
		System.exit(0);
	} // void main
} // classe ColetaMostrar    
 