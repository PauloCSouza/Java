
import javax.swing.*;
public class ExvtMedia {

	public static void main(String args [ ])
	{
		double VtM[] = new double[5];
		double mdg=0; 
		int cta,ctbaixo=0;
		
		for ( cta = 0 ; cta < 5 ; cta++ )
		{		
			VtM[cta] = Double.parseDouble(JOptionPane.showInputDialog("Digite Media  do aluno"));
			mdg = (mdg + VtM[cta]);
			if (VtM[cta] >= 6)
				System.out.println ("Media = "+VtM[cta] +" Numero do aluno "+(cta+1));
			else
			    ctbaixo++;
				
		}
		 
		System.out.println ("Quantidade aluno abaixo 6 = " +ctbaixo);
		System.out.println ("Media do grupo " +mdg/5);

		System.exit(0);
	}
}     
    
