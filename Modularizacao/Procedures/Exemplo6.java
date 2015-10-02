/**
 * @(#)Exemplo6.java
 *
 *
 * M�dulo Procedimento sem par�metros
 */

import javax.swing.JOptionPane;
public class Exemplo6 {
   
	 public static void main (String args[]){
	 	int opcao = 1;
	 	
	    while (opcao >=1 && opcao <= 4) {
	        opcao = Integer.parseInt(JOptionPane.showInputDialog("Escolha a sua op��o:\n" +
	        "1 - Adi��o\n" +
	        "2 - Subtra��o\n" +
	        "3 - Multiplica��o\n" +
	        "4 - Divis�o \n" +	
            "5 - Fim do Programa"));
   
    //Chmada dos m�dulos procedimento sem par�metros               
		    switch (opcao){
		      case 1 :  modAdicao(); break;
		      case 2 : modSubtr(); break;
		      case 3 : modMultipl(); break;
	          case 4 : modDiv();break;
		      default : JOptionPane.showMessageDialog(null, "Fim do Programa");
		    }
	    } //fim do while
	  } //fim da classe main()
	  
	// M�dulo procedimento modAdicao - sem passagem de par�metro
	  static void modAdicao(){
	    double v1,v2, res;
	    v1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o  primeiro valor"));
	    v2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor"));
	    res = v1 + v2;
	    JOptionPane.showMessageDialog(null, "Soma = " + res);
	    	    
	  } //fim do m�dulo modAdicao
	
	 // M�dulo procedimento modSubtr - sem passagem de par�metro 
	  static void modSubtr(){
	    double v1,v2, res;
	    v1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o  primeiro valor"));
	    v2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor"));
	    res = v1 - v2;
	    JOptionPane.showMessageDialog(null, "Subtra��o = " + res);
	  } //fim do m�dulo modSubt

      // M�dulo procedimento modMultipl - sem passagem de par�metro
	  static void modMultipl(){
	    double v1,v2, res;
	    v1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o  primeiro valor"));
	    v2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor"));
	    res = v1 * v2;
	    JOptionPane.showMessageDialog(null, "Multiplica��o = " + res);
	  } //fim do m�dulo modMultipl
	
	  // M�dulo procedimento modDiv - sem passagem de par�metro
	  static void modDiv(){
	    double v1,v2, res;
	    v1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o  primeiro valor"));
	    v2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor"));
	    res = v1 / v2;
	    JOptionPane.showMessageDialog(null, "Divis�o = " + res);
	  } //fim do m�dulo modDiv
} //fim da classe Exemplo6
