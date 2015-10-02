import javax.swing.JOptionPane;
public class ExFunSemParametro
 {
     static Double N1,N2,MD;
	 public static void main (String args[])
	 {
	   
	    N1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o NUMERO 1"));
	    N2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o NUMERO 2"));
	    JOptionPane.showMessageDialog(null, "\n MEDIA = " + FCALCULA_MEDIA());
	    
	  }
	
	// Modulo procedimento  - sem passagem de parametro
	
	  static Double FCALCULA_MEDIA(){
	  	MD = (N1+N2)/2;
	    return MD; 
	  } 
} 
