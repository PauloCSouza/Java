import javax.swing.JOptionPane;

public class advinha {
	public static void main(String args[]) {

		//variaveis
		int num, tot;
		String name;
		
		//inicio
		name = JOptionPane.showInputDialog(null, "Qual � seu nome?");
		JOptionPane.showMessageDialog(null, name + ", por favor, pense em um n�mero de 0 � 10.");
		JOptionPane.showMessageDialog(null, name + ", o n�mero que voc� pensou fa�a x2.");
		JOptionPane.showMessageDialog(null, "Podemos continuar? Se sim clique em OK!");
		
		//meio
		num = (int) (Math.random() * 101); 
		JOptionPane.showMessageDialog(null, name + ", soma mais o n�mero: " + num);
		
		//conta
		tot = num / 2;
		
		//final
		JOptionPane.showMessageDialog(null, name + ", pegue o resultado, divada por 2");
		JOptionPane.showMessageDialog(null, "Agora pegue o resultado e fa�a menos o n�mero que voc� pensou...");
		JOptionPane.showMessageDialog(null, "Posso adivinhar o resultado?");
		JOptionPane.showMessageDialog(null, name + ", O resultado final �: " + tot);
		
	}
}
