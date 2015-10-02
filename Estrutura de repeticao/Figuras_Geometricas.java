
import javax.swing.JOptionPane;
public class Figuras_Geometricas {

    public static void main (String arg [ ]) {
      double l,b,h,a,bma,bme;
      double r = 0.0;
      int opc=0;
    
    while (opc != 9){
      opc= Integer.parseInt(JOptionPane.showInputDialog(" 1 - QUADRADO \n 2 - TRIANGULO \n 3 - RETANGULO \n 4 - TRAPEZIO \n 9 - FINALIZA "));
      switch (opc)
         {
            case 1: 
            	l = Integer.parseInt(JOptionPane.showInputDialog(" LADO DO QUADRADO"));
            	r = (l*l);
            	JOptionPane.showMessageDialog(null,"AREA DO QUADRADO  "+r);
                break;
            case 2:
            	b = Integer.parseInt(JOptionPane.showInputDialog(" BASE"));
                h = Integer.parseInt(JOptionPane.showInputDialog(" ALTURA "));
            	r = ((b*h))/2;
               	JOptionPane.showMessageDialog(null,"AREA DO TRIANGULO  "+r);
                break;
            case 3: 
            	b = Integer.parseInt(JOptionPane.showInputDialog(" BASE"));
                h = Integer.parseInt(JOptionPane.showInputDialog(" ALTURA "));
            	r = (b*h);
               	JOptionPane.showMessageDialog(null,"AREA DO RETANGULO  "+r);
                break;
            	
            case 4: 
            	bma = Integer.parseInt(JOptionPane.showInputDialog(" BASE MAIOR "));
                bme = Integer.parseInt(JOptionPane.showInputDialog(" BASE MENOR "));
                h = Integer.parseInt(JOptionPane.showInputDialog(" ALTURA "));
            	r = ((bma * bme)*h)/2;
               	JOptionPane.showMessageDialog(null,"AREA DO TRAPEZIO  "+r);
                break;
           case 9:
                JOptionPane.showMessageDialog(null,"FINALIZA PROCESSAMENTO");
	            break;
	        default: JOptionPane.showMessageDialog(null,"OPCAO INVALIDA");
         }   
     }
   }
}

    
