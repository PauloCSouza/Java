
import javax.swing.JOptionPane;
public class PgmFat {
  
  public static void main(String args []){
    int N;
    N = Integer.parseInt(JOptionPane.showInputDialog("DIGITE O VALOR "));
    JOptionPane.showMessageDialog(null,"O FATORIAL   " +FFAT(N));
  }
  
  static int FFAT (int NUM){
    int Fat=1,Cta;
    for (Cta = NUM;Cta>1;Cta--){
         Fat = (Fat * Cta);
        }
        
    return Fat;
  }
}