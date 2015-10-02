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

      mes = Integer.parseInt(JOptionPane.showInputDialog("Digite o mês desejado"));
      if (mes == 1 || mes == 2 || mes == 3)
         {
            System.out.println("A estação do ano correspondente ao mês " + mes + " é Verão ");
         }
      else
         {
            if (mes == 4 || mes == 5 || mes == 6)
               {
                  System.out.println ("A estação do ano correspondente ao mês " + mes + " é Outono ");
               }
            else
               {
                  if (mes == 7 || mes == 8 || mes == 9)
                     {
                        System.out.println ("A estação do ano correspondente ao mês " + mes + " é Inverno ");
                     } 
                  else
                     {
                        if (mes == 10 || mes == 11 || mes == 12)
                           {
                              System.out.println ("A estação do ano correspondente ao mês " + mes + " é Primavera ");
                           }
                        else
                           { 
                              System.out.println ("Mês digitado inválido");
                           }
                     }
               }
         }   
      System.exit(0);
   }
}

    
    
