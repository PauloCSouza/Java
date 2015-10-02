
import javax.swing.JOptionPane;
public class Exf02 {
  
  public static void main(String args []){
    int Num,R;
    Num = Integer.parseInt(JOptionPane.showInputDialog("DIGITE O VALOR "));
    R = FFAT(Num);
    JOptionPane.showMessageDialog(null,"O FATORIAL   " +R );
  }
  static int FFAT (int N){
    int Fat,Cta;
    Fat = 1;
    for (Cta = N;Cta>1;Cta--){
         Fat = (Fat * Cta);
        }
        
    return Fat;
  }
}