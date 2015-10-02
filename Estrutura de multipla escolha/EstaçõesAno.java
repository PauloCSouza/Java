import javax.swing.JOptionPane;
public class EstaçõesAno {

    public static void main (String arg [ ]) {
      int mes;

    mes = Integer.parseInt(JOptionPane.showInputDialog("DIGITE MES ENTRE 1 A 12"));
    switch (mes)
         {
         	case 1: case 2: case 3:
         	 JOptionPane.showMessageDialog(null,"VERAO ");
             break;
 
            case 4: case 5: case 6:
         	 JOptionPane.showMessageDialog(null,"OUTONO");
             break;
            
            case 7: case 8: case 9:
         	 JOptionPane.showMessageDialog(null,"INVERNO ");
             break;
            
            case 10: case 11: case 12:
         	 JOptionPane.showMessageDialog(null,"PRIMAVERA ");
             break;
              
            default: JOptionPane.showMessageDialog(null,"MES INVALIDO");
         }   
     
   }
}

