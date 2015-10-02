import javax.swing.JOptionPane;
public class Calcula_Valor {
   static Double SB,SL,DESC;
	 public static void main (String args[]){
	 	Double VHR,HTR;
	 	
	    VHR = Double.parseDouble(JOptionPane.showInputDialog("Digite o Valor Hora"));
	    HTR = Double.parseDouble(JOptionPane.showInputDialog("Digite Horas Trabalhadas"));
	    SB = (VHR * HTR);
	    Calcula();
	    Exibe_Dados();
	  } //fim da classe main()
	  
	// Mdulo procedimento Calcula - sem passagem de parmetro
	  static void Calcula(){
	  	if (SB < 300){
	  		DESC = 0.0;
	  	}
	  	else if (SB >= 300 && SB < 700){
	  		    DESC = (SB * 0.05);
	  	}
	  	else if (SB >= 700 && SB < 1200){
	  		    DESC = (SB * 0.10);
	  	}
	  	else if (SB > 1200 && SB < 1700){
	  		    DESC = (SB * 0.15);
	  	} 
	  	else {
	  		    DESC = (SB * 0.20);
	  	}
	  	
	  	SL = (SB - DESC);
	  	}
	  		  	  	
	 // Mdulo procedimento modSubtr - sem passagem de parmetro 
	  static void Exibe_Dados(){
	    
	    JOptionPane.showMessageDialog(null, "Salrio Bruto = " + SB+
	                                        "\n Salrio Lquido = " + SL+
	                                        "\n Desconto = " + DESC);
	    
	  } //fim do mdulo 

} //fim da classe Calcula_Valor
