
import javax.swing.JOptionPane;
public class SalarioReceber {

    public static void main (String arg [ ]) {
      int cargo;
      double SalarioBruto;
      cargo = Integer.parseInt(JOptionPane.showInputDialog("Digite o cargo \n 1 - PRESIDENTE \n 2 - DIRETOR \n 3 - GERENTE \n 4 - LIDER  "));
  
      SalarioBruto = Double.parseDouble(JOptionPane.showInputDialog("Digite  Salario Bruto"));
      switch (cargo)
         {
            case 1: 
                  SalarioBruto = ((SalarioBruto * 0.75) * 1.10);
                  JOptionPane.showMessageDialog(null, "PRESIDENTE \n SALARIO A RECEBER "+SalarioBruto);
                  break;
            case 2:
                  SalarioBruto = ((SalarioBruto * 0.80) * 1.07);
                  JOptionPane.showMessageDialog(null, "DIRETOR \n SALARIO A RECEBER "+SalarioBruto);
                  break;
            case 3:
                  SalarioBruto = ((SalarioBruto * 0.85) * 1.05);
                  JOptionPane.showMessageDialog(null, "GERENTE \n SALARIO A RECEBER "+SalarioBruto);
                  break;
            
            case 4:
                  SalarioBruto = ((SalarioBruto * 0.90) * 1.03);
                  JOptionPane.showMessageDialog(null, "LIDER \n SALARIO A RECEBER "+SalarioBruto);
                  break;
            default:
                  JOptionPane.showMessageDialog(null,"CARGO INVALIDO");
         }   
     
   }
}

    
