import javax.swing.JOptionPane;
public class Procedure01
 {
     static Double SB,SL;
	 public static void main (String args[])
	 {
	    SB = Double.parseDouble(JOptionPane.showInputDialog("Digite o SALARIO BRUTO"));
	    PROC_SALARIO();
	    JOptionPane.showMessageDialog(null, "\n Salario Liquido = " + SL);
	    
	  } //fim da classe main()
	  
	
	// Modulo procedimento Calcula desconto - sem passagem de parametro
	
	  static void PROC_SALARIO(){
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
	  	
	  	SL = (SB - (SB * DESC));
	  	
	     
	  } //fim do modulo 

} //fim da classe 
