import javax.swing.JOptionPane;

public class Subtrai
{
	public static void main (String args[])
	{
		
		int n1,n2,r;
		
		n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite N1"));
		n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite N2"));
		
		if (n1 > n2)
		 {
		   r = (n1 - n2);
           JOptionPane.showMessageDialog(null,"O resultado de N1 - N2 "+r);
	     }
	 	else if (n2 > n1)
		      {
		      	r = (n2 - n1);
                JOptionPane.showMessageDialog(null,"O resultado de N2 - N1 "+r);
		      }
	       else
	          {
	           JOptionPane.showMessageDialog(null,"O resultado ZERO");
	          }
    }
    
}

