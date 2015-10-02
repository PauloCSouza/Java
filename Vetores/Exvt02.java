import javax.swing.*;
public class Exvt02 {
   public static void main(String args [ ])
	{
	  int Vet [] = new int[5];
          int soma = 0,i;
	  for ( i = 0 ; i <= 4 ; i++ )
              {		
		Vet[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro"));
		if ((Vet[i] % 2)== 0)
		    soma = soma + Vet[i];
		else
	            System.out.println ("\nNumero do indice = " +i);
	      } 
          System.out.println ("\n Soma dos pares = " +soma);
          System.exit(0);
	}
}     
    
