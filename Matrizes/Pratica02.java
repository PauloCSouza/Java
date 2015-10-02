// NÃO EXIBE VALORES
// NOTA 3.0

import javax.swing.JOptionPane;

public class Pratica02 {

    public static void main (String args[]){
    	int dia, mes, qtdm, qtdi, valormeia = 0, valorinteira = 0, vl_total = 0;
    	
    	
    	mes  = Integer.parseInt(JOptionPane.showInputDialog("digite o mes"));
    	dia  = Integer.parseInt(JOptionPane.showInputDialog("digite o dia"));
    	qtdm = Integer.parseInt(JOptionPane.showInputDialog("digite a quantidade de meia entrada"));
    	qtdi = Integer.parseInt(JOptionPane.showInputDialog("digite a quantidade de entrada inteira"));
    	
    		switch (mes)
    		{
    			case 1: case 7: case 12: 
    				if (dia < 5){
    					valormeia = qtdm * 30;
						valorinteira = qtdi * 60;
    					}else{
    					
    			
    				if (dia > 5 && dia < 7){
    						valormeia = qtdm * 40;
    				
    						valorinteira = qtdi * 80;
    					}
    					}
    				
    				break;
    			default :
    				if (dia < 5){
    				 	valormeia = qtdm * 25;
						valorinteira = qtdi * 50;
    				 }else{
    				 
    				 
    				if(dia > 5 && dia < 7){
    				 		valormeia = qtdm * 35;
    				 		valorinteira = qtdi * 70;
    				 	}
    				} 
    				 
    		}
    		vl_total = valorinteira + valormeia;
    		System.out.println("O mês é: " + mes);  
    		System.out.println("O dia é: " + dia);	 				
    		System.out.println("quantidade de inteiras foi: " + qtdi);
    		System.out.println("quantidade de meia foi: " + qtdm);
	        System.out.println("O valor de inteiras foi: " + valorinteira);    			
	        System.out.println("O valor de meia foi: " + valormeia);  
	        System.out.println("O valor total foi : " + vl_total);    			
    }
    
    
}