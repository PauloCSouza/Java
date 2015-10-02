
import javax.swing.*;
public class Exvt_Md01 {

    static double VMD[] = new double[5];
    static double MDG=0.0; 
	static int MA6,ME6,I=0;
	 
	public static void main(String args [ ])
	{
		Carrega_Md();
		Exibir_Md();
	}	
	
	static void Carrega_Md()
	  {
		for ( I = 0 ; I < 5 ; I++ )
		{		
			VMD[I] = Double.parseDouble(JOptionPane.showInputDialog("Digite Media  do aluno"));
			MDG = (MDG + VMD[I]);
		}
		MDG = (MDG/5);
	  }
	  
	
	static void Exibir_Md()
	  {
	    for ( I = 0 ; I < 5 ; I++ )
		    {		
	        	if (VMD[I] >= 6)
		            MA6++;
	            else
		            ME6++;
			    
		        if (VMD[I] > MDG)
		           {
	                 System.out.println (" Numero do aluno "+(I+1)+"\n Media = "+VMD[I]);
	   	           }     
				
		    }
		System.out.println ("Quantidade aluno igual e acima de 6 = " +MA6);
		System.out.println ("Quantidade aluno abaixo 6           = " +ME6);
		System.out.println ("Media do grupo                      = " +MDG);
		
		System.exit(0);
	}
}     
    
