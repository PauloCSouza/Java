import javax.swing.JOptionPane;
public class Procedure02 {
    public static void main (String args[])
       {
	 	 int Lado;
	     Lado = Integer.parseInt(JOptionPane.showInputDialog("Digite o Lado"));
	     Calc_Quadrado(Lado);
	     System.exit(0);
	    
	   } 
	  
	// Modulo procedimento Calcula �rea
	
	static void Calc_Quadrado(int L){
	    
	    int A; 
	    A = (L * L);
	    JOptionPane.showMessageDialog(null, "\n Area do quadrado �  " +A);
	  		     
	  }  

} 
