import javax.swing.JOptionPane;
public class CalculaIngresso {

    public static void main (String arg [ ]) {
      int semana,idade;
      double ingresso;
    
      semana = Integer.parseInt(JOptionPane.showInputDialog("DIGITE DIAS ENTRE 1 A 7"));
      idade = Integer.parseInt(JOptionPane.showInputDialog("DIGITE A IDADE"));
      ingresso = Double.parseDouble(JOptionPane.showInputDialog("DIGITE O VALOR DO INGRESSO"));
      
      
      switch (semana)
         {
         	case 2: case 3:
         	      ingresso = ingresso * 0.50;
         	      if (idade <= 12)
         	         {
         	         	ingresso = (ingresso * 0.90);
         	         }
         	
         	      break;
         	case 4: case 5:
         	      ingresso = ingresso * 0.70;
         	      if (idade <= 12)
         	         {
         	         	ingresso = (ingresso * 0.90);
         	         }
         	
         	      break;
         	case 6: case 7: case 1:
         	      if (idade <= 12)
         	         {
         	         	ingresso = (ingresso * 0.90);
         	         }
         	
         	      break;

            default: JOptionPane.showMessageDialog(null,"SEMANA INVALIDA");
            
         }  
         JOptionPane.showMessageDialog(null,"O VALOR DO INGRESSO É "+ingresso); 
         
