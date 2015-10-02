import javax.swing.JOptionPane;
public class DiasSemana {

    public static void main (String arg [ ]) {
      int opc;

    opc = Integer.parseInt(JOptionPane.showInputDialog("DIGITE DIAS ENTRE 1 A 7"));
    switch (opc)
         {
         	case 1
         	: JOptionPane.showMessageDialog(null,"DOMINGO ");
                                                 break;
            case 2: JOptionPane.showMessageDialog(null,"SEGUNDA-FEIRA ");
                                                 break;
            case 3: JOptionPane.showMessageDialog(null,"TERCA-FEIRA ");
                                                 break;
            case 4: JOptionPane.showMessageDialog(null,"QUARTA-FEIRA ");
                                                  break;
            case 5: JOptionPane.showMessageDialog(null,"QUINTA-FEIRA ");
                                                  break;
          
            case 6: JOptionPane.showMessageDialog(null,"SEXTA-FEIRA ");
                                                  break;
          
            case 7: JOptionPane.showMessageDialog(null,"SABADO ");
                                                  break;
          
            default: JOptionPane.showMessageDialog(null,"OPCAO INVALIDA");
         }   
     
   }
}

