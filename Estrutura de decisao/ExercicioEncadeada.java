/**
 * @(#)ExercicioC.java
 *
 *
 * @author 
 * @version 1.00 2008/2/29
 */

import javax.swing.JOptionPane;
public class ExercicioEncadeada {

    public static void main (String arg [ ]) {
      int mes;

      mes = Integer.parseInt(JOptionPane.showInputDialog("Digite o m�s desejado"));
      if (mes == 1 || mes == 2 || mes == 3)
         {
            System.out.println("A esta��o do ano correspondente ao m�s " + mes + " � Ver�o ");
         }
      else
         {
            if (mes == 4 || mes == 5 || mes == 6)
               {
                  System.out.println ("A esta��o do ano correspondente ao m�s " + mes + " � Outono ");
               }
            else
               {
                  if (mes == 7 || mes == 8 || mes == 9)
                     {
                        System.out.println ("A esta��o do ano correspondente ao m�s " + mes + " � Inverno ");
                     } 
                  else
                     {
                        if (mes == 10 || mes == 11 || mes == 12)
                           {
                              System.out.println ("A esta��o do ano correspondente ao m�s " + mes + " � Primavera ");
                           }
                        else
                           { 
                              System.out.println ("M�s digitado inv�lido");
                           }
                     }
               }
         }   
      System.exit(0);
   }
}

    
    
