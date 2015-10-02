import javax.swing.*;
public class Matriz_Qtde_par_impar
 {
	public static void main(String args [ ])
	{
		int Mat [ ][ ] , x , y, impar , par ;
		impar = 0;
		par = 0;
		Mat = new int [3][3];
	
		for ( x = 0 ; x < 3 ; x++ )
		{
			for ( y = 0 ; y < 3 ; y++)
			{
				Mat[x][y] = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro"));

			    if ((Mat[x][y]%2) == 0)
			        {
			        	par++;
			        }
			    else
			        {
			        	impar++; 
			        }
			 }           
		} 
		System.out.println("Quantidade de pares = " +par);
		System.out.println("Quantidade de impares = " +impar);
		System.exit(0);
	}

   } 
    
