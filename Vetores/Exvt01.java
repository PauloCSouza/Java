
import javax.swing.*;
public class Exvt01 {

	public static void main(String args [ ])
	{
		int Vet[] = new int[4];
		int cta;
		for ( cta = 0 ; cta < 4 ; cta++ )
		{		
			Vet[cta] = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro"));
			if ((Vet[cta] %2)== 0)
				System.out.println ("Vet[" + cta + "] = " +Vet[cta] +" PAR ");
			else
				System.out.println ("Vet[" + cta + "] = " +Vet[cta]+" IMPAR"
				);
		} 
		System.exit(0);
	}
}     
    
