/**
 * @(#)Exemplo6.java
 *
 *
 * Módulo Procedimento sem parâmetros
 */

import javax.swing.JOptionPane;
public class Exemplo6 {
   
	 public static void main (String args[]){
	 	int opcao = 1;
	 	
	    while (opcao >=1 && opcao <= 4) {
	        opcao = Integer.parseInt(JOptionPane.showInputDialog("Escolha a sua opção:\n" +
	        "1 - Adição\n" +
	        "2 - Subtração\n" +
	        "3 - Multiplicação\n" +
	        "4 - Divisão \n" +	
            "5 - Fim do Programa"));
   
    //Chmada dos módulos procedimento sem parâmetros               
		    switch (opcao){
		      case 1 :  modAdicao(); break;
		      case 2 : modSubtr(); break;
		      case 3 : modMultipl(); break;
	          case 4 : modDiv();break;
		      default : JOptionPane.showMessageDialog(null, "Fim do Programa");
		    }
	    } //fim do while
	  } //fim da classe main()
	  
	// Módulo procedimento modAdicao - sem passagem de parâmetro
	  static void modAdicao(){
	    double v1,v2, res;
	    v1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o  primeiro valor"));
	    v2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor"));
	    res = v1 + v2;
	    JOptionPane.showMessageDialog(null, "Soma = " + res);
	    	    
	  } //fim do módulo modAdicao
	
	 // Módulo procedimento modSubtr - sem passagem de parâmetro 
	  static void modSubtr(){
	    double v1,v2, res;
	    v1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o  primeiro valor"));
	    v2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor"));
	    res = v1 - v2;
	    JOptionPane.showMessageDialog(null, "Subtração = " + res);
	  } //fim do módulo modSubt

      // Módulo procedimento modMultipl - sem passagem de parâmetro
	  static void modMultipl(){
	    double v1,v2, res;
	    v1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o  primeiro valor"));
	    v2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor"));
	    res = v1 * v2;
	    JOptionPane.showMessageDialog(null, "Multiplicação = " + res);
	  } //fim do módulo modMultipl
	
	  // Módulo procedimento modDiv - sem passagem de parâmetro
	  static void modDiv(){
	    double v1,v2, res;
	    v1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o  primeiro valor"));
	    v2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor"));
	    res = v1 / v2;
	    JOptionPane.showMessageDialog(null, "Divisão = " + res);
	  } //fim do módulo modDiv
} //fim da classe Exemplo6
