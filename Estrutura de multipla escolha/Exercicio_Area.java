/**
 * @(#)Exercicio_Area
 *
 *
 * RICARDO SATOSHI
 * @version 1.00 2009/09/01
 */

import javax.swing.JOptionPane;
public class Exercicio_Area {

    public static void main (String arg [ ]) {
      int mes;

      mes = Integer.parseInt(JOptionPane.showInputDialog("Digite o mes da estacao"));
      switch (mes)
         {
            case 12: case 1: case 2: JOptionPane.showMessageDialog(null,"VERAO");
                                                  break;
            case 3: case 4: case 5: JOptionPane.showMessageDialog(null,"OUTONO");
                                                  break;
            case 6: case 7: case 8: JOptionPane.showMessageDialog(null,"INVERNO");
                                                  break;
            case 9: case 10: case 11: JOptionPane.showMessageDialog(null,"PRIMAVERA");
                                                  break;
            default: JOptionPane.showMessageDialog(null,"invalido");
         }   
     
   }
}

    
