/**
 * @(#)Ex1061Mostrar.java
 *
 *
 * @author 
 * @version 1.00 2009/4/13
 */

import javax.swing.*;
public class ColetaMostrar {

	public static void main(String args [ ])
	{
		int Vet [ ] , i;
		Vet = new int [5];
		for ( i = 0 ; i < 5 ; i++ )
		{		
			Vet[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro"));
			System.out.println ("Vet[" + i + "] = " +Vet[i]);
		} 
		System.exit(0);
	} 
	
}   
    
