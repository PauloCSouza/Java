import javax.swing.JOptionPane;
public class ExProcSemParametro
 {
     static Double N1,N2,MD;
	 public static void main (String args[])
	 {
	   
	    N1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o NUMERO 1"));
	    N2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o NUMERO 2"));
	    CALCULA_MEDIA();
	    JOptionPane.showMessageDialog(null, "\n MEDIA = " + MD);
	    
	  }
	
	// Modulo procedimento  - sem passagem de parametro
	
	  static void CALCULA_MEDIA(){
	  	MD = (N1+N2)/2;
	     
	  } 
} 
