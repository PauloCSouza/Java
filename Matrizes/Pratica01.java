// NOTA 5.0
import javax.swing.*;
public class Pratica01{
	
	public static void main( String args[]){
		
		int x, y, calc;
		calc=1;
		
		x=Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da base"));
		y=Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da pot�ncia"));
		
		if (y==0){
	            JOptionPane.showMessageDialog(null,"O resultado �: " + calc); 	
		         }else{
		               while(y>0){
			                      calc=(calc * x);
	                              y--;   
	                           }
	                    JOptionPane.showMessageDialog(null,"O resultado �: "+calc);               
		               }
       System.exit(0);		               
	}
}