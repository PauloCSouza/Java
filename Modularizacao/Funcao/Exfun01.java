import javax.swing.JOptionPane;
public class Exfun01 {
  
  public static void main(String args [])
   {
   
    int N1,N2;
    N1 = Integer.parseInt(JOptionPane.showInputDialog("DIGITE O VALOR 1 "));
    N2 = Integer.parseInt(JOptionPane.showInputDialog("DIGITE O VALOR 2 "));
    JOptionPane.showMessageDialog(null," A SOMA EH " +Fsoma(N1,N2));
  }
  
  static int Fsoma (int Num1,int Num2){
    int S=0,Cta;
    if (Num1 < Num2)
       {
       	 for (Cta = Num1;Cta<=Num2;Cta++)
       	     {
              S = S + Cta;
             }
        }     
     else 
        {
       	 for (Cta = Num2;Cta<=Num1;Cta++)
       	     {
              S = S + Cta;
             }
         
         }    
         
    return S;
  }
}