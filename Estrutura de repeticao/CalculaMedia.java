import javax.swing.*;
public class CalculaMedia{

	public static void main(String args [ ])
	{
		double mda=0,mdg=0;
		int cta=0,qabaixo=0,qacima=0;
		
		while ( cta < 10)
		      {
		       	
		       	mda = Double.parseDouble(JOptionPane.showInputDialog("Digite o media"));
			    if (mda >= 5 )
			       {
				     qacima++;
			       }
		       	else
			       {
			     	qabaixo++;
			       }
			        
			    mdg = (mdg + mda);
			    cta++;   
			       
		     }	
		     	   	   
	  System.out.println ("Media do grupo : "+ mdg/10);
      System.out.println ("Quantidade alunos acima de 5 : "+ qacima);
      System.out.println ("Quantidade alunos abaixo de 5 : "+ qabaixo);
      System.exit(0);
	} 
}     

