import javax.swing.JOptionPane;

public class CalculaSalario
{
	public static void main (String args[])
	{
		
		double sb,sl,desc;
		
		sb = Double.parseDouble(JOptionPane.showInputDialog("Digite o Salario Bruto"));
		if ((sb >= 300) && (sb<800))
		   {
		  	desc = 0;
		   }
	 	else if ((sb >= 800) && (sb<1200))
		        {
		  	      desc = (sb * 0.05);
		         
                }
                
              else if ((sb >= 1200) && (sb<1800))
		              {
		  	           desc = (sb * 0.10);
		              
                      }
                    else if ((sb >= 1800) && (sb<2500))
		                    {
		  	                  desc = (sb * 0.15);
		                     
                             }
                         else 
                             {
		  	                   desc = (sb * 0.20);
		  	                   
                             }
        sl = (sb - desc);                     
        JOptionPane.showMessageDialog(null,"DESCONTO "+desc+"\n SALARIO LIQUIDO "+sl);
	          
  }
    
}

