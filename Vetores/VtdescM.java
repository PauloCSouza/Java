
import javax.swing.*;
public class VtdescM {

	public static void main(String args [ ])
	{
		String Vet [] = new String [12];
		int M; 
		Vet[0] = "Janeiro";
		Vet[1] = "Fevereiro";
		Vet[2] = "Marco";
		Vet[3] = "Abril";
		Vet[4] = "Maio";
		Vet[5] = "Junho";
		Vet[6] = "Julho";
		Vet[7] = "Agosto";
		Vet[8] = "Setembro";
		Vet[9] = "Outubro";
		Vet[10] = "Novembro";
		Vet[11] = "Dezembro";
		
		M = Integer.parseInt(JOptionPane.showInputDialog("Digite numero do mes"));
		JOptionPane.showMessageDialog(null," O mes e  " +Vet[M-1]);
		System.exit(0);
	} 
} 
 