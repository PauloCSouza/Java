import javax.swing.JOptionPane;
public class Multipla {

    public static void main (String arg [ ]) {
      int opc;

    opc = Integer.parseInt(JOptionPane.showInputDialog("1 - Quadrado \n 2 - Ret�ngulo \n 3 - Trap�zio \n 9 - Fim"));
    switch (opc)
         {
            case 1: JOptionPane.showMessageDialog(null,"FIGURA QUADRADO ");
                                                 break;
            case 2: JOptionPane.showMessageDialog(null,"FIGURA RET�NGULO ");
                                                 break;
            case 3: JOptionPane.showMessageDialog(null,"FIGURA TRAP�ZIO ");
                                                  break;
            case 9: JOptionPane.showMessageDialog(null,"FIM DO PROCESSAMENTO ");
                                                  break;
            default: JOptionPane.showMessageDialog(null,"OP��O INV�LIDA");
         }   
     
   }
}

