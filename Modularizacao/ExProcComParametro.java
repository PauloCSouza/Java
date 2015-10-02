import javax.swing.JOptionPane;
public class ExProcComParametro
 {
  
	 public static void main (String args[])
	 {
        Double N1,N2;	   
	    N1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o NUMERO 1"));
	    N2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o NUMERO 2"));
	    CALCULA_MEDIA(N1,N2);
	    
	  }
	
	// Modulo procedimento  - sem passagem de parametro
	
	  static void CALCULA_MEDIA(Double N1,Double N2)
                         {
                            Double MD;	  
	         MD = (N1+N2)/2;
                            JOptionPane.showMessageDialog(null, "\n MEDIA = " + MD);
	  } 
} 
