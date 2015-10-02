import javax.swing.*;
public class Exe03{

	public static void main(String args [ ])
	{
		int cta,qpos=0,qneg=0,num;
		
		for ( cta = 1 ; cta <= 10 ; cta++ )
		{
			num = Integer.parseInt(JOptionPane.showInputDialog("Digite o número"));
			if (num >= 0 )
			   {
				qpos++;
			   }
			else
			   {
				qneg++;
			   }
		}		   	   
	  System.out.println ("QUANTIDADE DE POSITIVOS : "+ qpos);
      System.out.println ("QUANTIDADE DE NEGATIVOS : "+ qneg);

	System.exit(0);
	} 
}     

