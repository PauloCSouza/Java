
import javax.swing.JOptionPane;
public class ExercicioD {

    public static void main (String arg [ ]) {
      int mes;

      mes = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor \n 1,2, 12 VERAO \n 3, 4 , 5 OUTONO...."));
      switch (mes)
         {
            case 1: case 2: case 3: JOptionPane.showMessageDialog(null, "  Verão ");
                                                  break;
            case 4: case 5: case 6: JOptionPane.showMessageDialog(null,  "  Outono ");
                                                 break;
            case 7: case 8: case 9: JOptionPane.showMessageDialog(null,  " Inverno ");
                                                 break;
            case 10: case 11: case 12: JOptionPane.showMessageDialog(null, "  Primavera ");
                                                 break;
            default: JOptionPane.showMessageDialog(null,"Mes digitado invalido");
         }   
     
   }
}

    
