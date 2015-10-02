import javax.swing.JOptionPane;

public class advinha {
	public static void main(String args[]) {

		//variaveis
		int num, tot;
		String name;
		
		//inicio
		name = JOptionPane.showInputDialog(null, "Qual é seu nome?");
		JOptionPane.showMessageDialog(null, name + ", por favor, pense em um número de 0 à 10.");
		JOptionPane.showMessageDialog(null, name + ", o número que você pensou faça x2.");
		JOptionPane.showMessageDialog(null, "Podemos continuar? Se sim clique em OK!");
		
		//meio
		num = (int) (Math.random() * 101); 
		JOptionPane.showMessageDialog(null, name + ", soma mais o número: " + num);
		
		//conta
		tot = num / 2;
		
		//final
		JOptionPane.showMessageDialog(null, name + ", pegue o resultado, divada por 2");
		JOptionPane.showMessageDialog(null, "Agora pegue o resultado e faça menos o número que você pensou...");
		JOptionPane.showMessageDialog(null, "Posso adivinhar o resultado?");
		JOptionPane.showMessageDialog(null, name + ", O resultado final é: " + tot);
		
	}
}
