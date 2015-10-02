import javax.swing.JOptionPane;
public class Multipla {

    public static void main (String arg [ ]) {
      int opc;

    opc = Integer.parseInt(JOptionPane.showInputDialog("1 - Quadrado \n 2 - Retângulo \n 3 - Trapézio \n 9 - Fim"));
    switch (opc)
         {
            case 1: JOptionPane.showMessageDialog(null,"FIGURA QUADRADO ");
                                                 break;
            case 2: JOptionPane.showMessageDialog(null,"FIGURA RETÂNGULO ");
                                                 break;
            case 3: JOptionPane.showMessageDialog(null,"FIGURA TRAPÉZIO ");
                                                  break;
            case 9: JOptionPane.showMessageDialog(null,"FIM DO PROCESSAMENTO ");
                                                  break;
            default: JOptionPane.showMessageDialog(null,"OPÇÃO INVÁLIDA");
         }   
     
   }
}

