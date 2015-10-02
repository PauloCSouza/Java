import javax.swing.JOptionPane;
public class CalcSalario
 {
     static Double SB,SL=0.0,DESC=0.0;
	 public static void main (String args[])
	 {
	   
	    SB = Double.parseDouble(JOptionPane.showInputDialog("Digite o SALARIO BRUTO"));
	    CALCULA_SAL();
	    JOptionPane.showMessageDialog(null, "\n Salario Liquido = " + SL +"\n Desconto = " + DESC);
	    
	  }
	
	// Modulo procedimento Calcula desconto - sem passagem de parametro
	
	  static void CALCULA_SAL(){
	    if (SB >= 300 && SB < 800)
	  	        {
	  		      DESC = 0.0;
	  	        }
	  	else if (SB >= 800 && SB < 1500)
	  	        {
	  		       DESC = 0.05;
	  	        }
	  	  	 else if (SB >= 1500 && SB < 2500)
	  	  	         {
	  		           DESC = 0.10;
	  	             }
	  	          else
	  	              {
	  	              	 DESC = 0.15;
	  	              } 
	  	        
	  	DESC = SB * DESC;
	  	SL   = (SB - DESC);
	  	
	     
	  } 
} //fim da classe 
