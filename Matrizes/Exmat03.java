import javax.swing.*;
public class Exmat03
 {
   public static void main(String args [ ])
     {
	int M[ ][ ] = new int [3][4];
    int Vendedores[ ] = new int [3];
    int Semanas[ ] = new int [4]; 
	int x,y,z=0,spar=0,qimp=0;
	
	for ( x = 0 ; x < 3 ; x++ )
	    {
	     for ( y = 0 ; y < 4 ; y++)
		 {
		   M[x][y] = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro"));
		   System.out.println("M[" +x+ "][" +y+ "] = "+M[x][y]);
		   Vendedores[x] = (Vendedores[x] + M[x][y]);
		 }
		 
		}
		
		
	for ( y = 0 ; y < 4 ; y++)
		 {
		   Semanas[y] = (M[0][y] + M[1][y] + M[2][y]);
		 }
		 
	
  	for ( y = 0 ; y < 3 ; y++)
		 {
  	       System.out.println("Vendedor [" +y+ "] = "+Vendedores[y]);}
  	       
  	       
  	for ( y = 0 ; y < 4 ; y++)
		 {
  	       System.out.println("Semanas [" +y+ "] = "+Semanas[y]);}
  	       

    			
       System.exit(0);
    }
    
    
    }
