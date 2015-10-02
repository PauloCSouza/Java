import javax.swing.*;
public class ExmatModulo
 {
 	static int M[ ][ ] = new int [3][3];
	static int x,y,soma=0;
   public static void main(String args [ ])
     {
     	CarregaMat();
        MostraMat();	
        System.exit(0);
     }
     
   
     
    static void CarregaMat()
    {
    
	  for ( x = 0 ; x < 3 ; x++ )
	      {
	        for ( y = 0 ; y < 3 ; y++)
		       {
		         M[x][y] = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro"));
	           } 
	       }
	}

    
    static void MostraMat(){	
    	for ( x = 0 ; x < 3 ; x++ )
	        {
	         for ( y = 0 ; y < 3 ; y++)
		        {
		           if  (M[x][y] % 2 == 0)
		               {
		           	      soma = (soma + M[x][y]);
		               }
	        	   System.out.println("M[" +x+ "][" +y+ "] = "+M[x][y]);
                 }
             } 
        System.out.println("A SOMA DOS PARES EH =  "+soma);     
       }
       
       
    }
