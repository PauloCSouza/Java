import javax.swing.*;
public class Matriz_Mostrar
 {
   public static void main(String args [ ])
     {
	int M[ ][ ] , x , y ;
	M = new int [4][4];
	
	for ( x = 0 ; x < 3 ; x++ )
	    {
	     for ( y = 0 ; y < 3 ; y++)
		 {
		   M[x][y] = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro"));
		   System.out.println("M[" +x+ "][" +y+ "] = "
                                      +M[x][y]);
		 } 
	    }
       System.exit(0);
    }
}
    
    
