import javax.swing.*;
public class ClassificaVetor {
	static int Vt [] = new int[5];
	static int x;
   public static void main(String args [ ])
	{
		Carrega_Vt();
		Classifica();
		Mostra_Vt();
	}
	
	static void Carrega_Vt()
	   {
	     for ( x = 0 ; x < 5 ; x++ )
             {		
		       Vt[x] = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro"));
	 	
	         }
	   }      	

	static void Mostra_Vt()
	   {
	     for ( x = 0 ; x < 5 ; x++ )
             {		
		        System.out.println ("\n " +Vt[x]);
	 	
	         }
	   }      	


	static void Classifica()
	   {
	   	 int aux,y;
	     for ( x = 0 ; x < 4 ; x++ )
             {		
             for ( y = x+1 ; y < 5 ; y++ )
                 {	
                   if (Vt[x] > Vt[y])
                      {
                      	aux = Vt[y];
                        Vt[y] = Vt[x];
                        Vt[x] = aux;
                       } 
                 }
             
             
             }
	    }
	  
}      	
