import javax.swing.*;
public class Exmat01
 {
   public static void main(String args [ ])
     {
	int M[][] = new int [3][2];
	int x,y;
	for ( x = 0 ; x < 3 ; x++ )
	    {
	     for ( y = 0 ; y < 2 ; y++)
		 {
		   M[x][y] = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro"));
		   System.out.println("M[" +x+ "][" +y+ "] = "+M[x][y]);
		 } 
	    }
       System.exit(0);
    }
}