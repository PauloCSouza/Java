import javax.swing.JOptionPane;
public class ProcedureComParametro
 {
     static Double SB;
	 public static void main (String args[])
	 {
	 	Double SL=0.0;
	    SB = Double.parseDouble(JOptionPane.showInputDialog("Digite o SALARIO BRUTO"));
	    PROC_SALARIO(SB);
	    
	    
	  } //fim da classe main()
	  
	
	// Modulo procedimento Calcula desconto - sem passagem de parametro
	
	  static void PROC_SALARIO(Double Liq){
	    Double DESC; 
	  	if (SB <= 500)
	  	   {
	  		 DESC = 0.0;
	  	   }
	  	else if (SB > 500 && SB <= 1200)
	  	        {
	  		      DESC = 0.05;
	  	        }
	  	else if (SB > 1200 && SB < 1800)
	  	        {
	  		       DESC = 0.10;
	  	        }
	  	  	else 
	  	  	    {
	  		     DESC = 0.15;
	  	        }
	  	
	  	Liq = (SB - (SB * DESC));
	  	JOptionPane.showMessageDialog(null, "\n Salario Liquido = " + 	Liq);
	     
	  } //fim do modulo 

} //fim da classe 
