import javax.swing.JOptionPane;

public class Carro {

	// Declaração de Atributos

	public String marca;
	public int ano;
	private int marcha = 0;
	public int velocidade;
	public boolean ligado;
	public boolean freio = true;

	// Métodos

	public void ligar() {
		if (this.ligado == false) {
			this.ligado = true;
			JOptionPane.showMessageDialog(null, "Carro Ligado");
		} else {
			JOptionPane.showMessageDialog(null, "O carro já está ligado");
		}
	}

	public void desligar() {
		if (this.ligado == true) {
			this.ligado = false;
			JOptionPane.showMessageDialog(null, "Carro Desligado");
		} else {
			JOptionPane.showMessageDialog(null, "O Carro já está desligado");
		}
	}

	public void acelerar(int velocidade) {
		if (this.ligado == true) {
			if (this.freio == false) {
				if (this.marcha == 0) {
					JOptionPane.showMessageDialog(null, "Está em ponto morto");
				} else if (this.marcha == 1) {
					if (velocidade < 30) {
						this.velocidade = velocidade;
						JOptionPane.showMessageDialog(null, "O carro acelerou "
								+ this.velocidade + " Km/h");
					}
				} else if (this.marcha == 2) {
					if (velocidade < 50) {
						this.velocidade = velocidade;
						JOptionPane.showMessageDialog(null, "O carro acelerou "
								+ this.velocidade + " Km/h");
					}
				} else if (this.marcha == 3) {
					if (velocidade < 80) {
						this.velocidade = velocidade;
						JOptionPane.showMessageDialog(null, "O carro acelerou "
								+ this.velocidade + " Km/h");
					}
				}
			} else {
				JOptionPane.showMessageDialog(null, "Freio de mão está puxado");
			}
		} else {
			JOptionPane.showMessageDialog(null, "O carro está desligado");
		}
	}

	public void trocarMarcha() {
		this.marcha = this.marcha + 1;
		JOptionPane.showMessageDialog(null, "Trocou de Marcha para " + this.marcha);
	}

}
