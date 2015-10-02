import javax.swing.JOptionPane;
public class CalcSalario_Parametro
 {
     //static Double SB,SL=0.0,DESC=0.0;
	 public static void main (String args[])
	 {
	 	Double SB;
	    
	    SB = Double.parseDouble(JOptionPane.showInputDialog("Digite o SALARIO BRUTO"));
	    CALCULA_SAL(SB);
	  }
	
	// Modulo procedimento Calcula desconto - com passagem de parametro
	
	  static void CALCULA_SAL(Double Bruto){
	  	Double SL=0.0,DESC=0.0;
	    if (Bruto >= 300 && Bruto < 800)
	  	        {
	  		      DESC = 0.0;
	  	        }
	  	else if (Bruto >= 800 && Bruto < 1500)
	  	        {
	  		       DESC = 0.05;
	  	        }
	  	  	 else if (Bruto>= 1500 && Bruto < 2500)
	  	  	         {
	  		           DESC = 0.10;
	  	             }
	  	          else
	  	              {
	  	              	 DESC = 0.15;
	  	              } 
	  	        
	  	DESC = Bruto * DESC;
	  	SL   = (Bruto - DESC);
	   	JOptionPane.showMessageDialog(null, "\n Salario Liquido = " + SL +"\n Desconto = " + DESC+"\n Bruto = " + Bruto);
	 
	     
	  } 
} //fim da classe 
