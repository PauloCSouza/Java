import javax.swing.*;
public class ExvtMostra01 {

   public static void main(String args [ ])
     {
          double VTMD[ ] = new double[6];
          int i,ac=0,ab=0;
          
          for ( i = 0 ; i < 6 ; i++ )
	{		
                      VTMD[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite Media  do aluno"));
                      if (VTMD[i] >= 6)
                        {
                           ac++;
                        }
                      else
                             {
                               ab++;
                             }
	}

     System.out.println ("Media Acima = "+ac);
    System.out.println ("Media Abaixo = "+ab);
     System.exit(0);
   }
}     
   
