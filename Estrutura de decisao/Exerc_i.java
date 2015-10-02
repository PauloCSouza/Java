import javax.swing.JOptionPane;

public class Exerc_i
{
	public static void main (String args[])
	{
		
		int a,b,c;
		
		a = Integer.parseInt(JOptionPane.showInputDialog("DIGITE VALOR A"));
		b = Integer.parseInt(JOptionPane.showInputDialog("DIGITE VALOR B"));
		c = Integer.parseInt(JOptionPane.showInputDialog("DIGITE VALOR C"));
		
		if ((a < b) && (b < c))
		   {
		   	 JOptionPane.showMessageDialog(null,a+" "+b+" "+c);
           }
        else if ((a < c) && (c < b))            
                {
                 JOptionPane.showMessageDialog(null,a+" "+c+" "+b);
                }
              else if ((b < a) && (a < c))            
                      {
                       JOptionPane.showMessageDialog(null,b+" "+a+" "+c);
                      }
                   else if ((c < a) && (a < b))            
                           {
                            JOptionPane.showMessageDialog(null,c+" "+a+" "+b);
                           }
                      else if ((b < c) && (c < a))            
                              {
                                 JOptionPane.showMessageDialog(null,b+" "+c+" "+a);
                              }
                            else
                               {
                                  JOptionPane.showMessageDialog(null,c+" "+b+" "+a);
                              }
                 
         
	 }
    
}

