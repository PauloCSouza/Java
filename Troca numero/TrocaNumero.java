/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trocanumero;

import javax.swing.JOptionPane;
/**
 *
 * @author Paulo Souza
 */
public class TrocaNumero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int a, b;
        
        a =  Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o numero a"));
        b = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o numero b"));
        
        /*
        Exemplo:
        A = 3 e B = 5 (Entrada)
        A = 5 e B = 3 (Saida)
        */
        System.out.println("A= " +a+ " B= " +b);
        b -= a;
        System.out.println("A= " +a+ " B= " +b);
        a += b;
        System.out.println("A= " +a+ " B= " +b);
        b = a - b;
        System.out.println("A= " +a+ " B= " +b);
    }
    
}
