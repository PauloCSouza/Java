package seunascimento;

import javax.swing.JOptionPane;

public class SeuNascimento {

    public static void main(String[] args) {

        // Declaração de variaveis
        int a = 2015;
        int r, k, d, m, aa;
        String name;
        
        // Colher Nome, Idade e Resultado do Usuário
        name = JOptionPane.showInputDialog("Qual é seu nome?");
        d = Integer.parseInt(JOptionPane.showInputDialog("Que dia você nasceu?"));
        JOptionPane.showMessageDialog(null, "Pense no mês em que você nasceu. Ex: Jan = 1, Fev = 2 etc...");
        JOptionPane.showMessageDialog(null, "Multiplique o número por 2.");
        JOptionPane.showMessageDialog(null, "Some mais 5 ao resultado.");
        JOptionPane.showMessageDialog(null, "Multiplique o resultado por 50.");
        JOptionPane.showMessageDialog(null, "Some sua idade ao resultado.");
        r = Integer.parseInt(JOptionPane.showInputDialog("Informe o resultado"));
        
        r -= 250;
        
        // Resultado
        if(r < 200){
            
            // Operação Matemática
            r -= 100;
            a -= r;
            aa = a - 1;
            m = 13;
            k = d + 2*m + (3*(m+1)/5) + aa + aa/4 - aa/100 + aa/400 + 2;
            k = k%7;
            
                // Resultado
                if(k==0){
                    JOptionPane.showMessageDialog(null, name + ", você tem " +r+ " anos e nasceu no Sábado dia " +d+ " de Janeiro de " +a);
                } else if(k==1) {
                    JOptionPane.showMessageDialog(null, name + ", você tem " +r+ " anos e nasceu no Domingo dia " +d+ " de Janeiro de " +a);
                } else if(k==2) {
                    JOptionPane.showMessageDialog(null, name + ", você tem " +r+ " anos e nasceu na Segunda-Feira dia " +d+ " de Janeiro de " +a);
                } else if(k==3) {
                    JOptionPane.showMessageDialog(null, name + ", você tem " +r+ " anos e nasceu na Terça-Feira dia " +d+ " de Janeiro de " +a);
                } else if(k==4) {
                    JOptionPane.showMessageDialog(null, name + ", você tem " +r+ " anos e nasceu na Quarta-Feira dia " +d+ " de Janeiro de " +a);
                } else if(k==5) {
                    JOptionPane.showMessageDialog(null, name + ", você tem " +r+ " anos e nasceu no Quinta-Feira dia " +d+ " de Janeiro de " +a);
                } else if(k==6) {
                    JOptionPane.showMessageDialog(null, name + ", você tem " +r+ " anos e nasceu no Sexta-Feira dia " +d+ " de Janeiro de " +a);
                }
            
        } else if(r>200 && r<300){
            
            // Operação Matemática
            r -= 200;
            a -= r;
            aa = a - 1;
            m = 14;
            k = d + 2*m + (3*(m+1)/5) + aa + aa/4 - aa/100 + aa/400 + 2;
            k = k%7;
            
                // Resultado
                if(k==0){
                    JOptionPane.showMessageDialog(null, name + ", você tem " +r+ " anos e nasceu no Sábado dia " +d+ " de Fevereiro de " +a);
                } else if(k==1) {
                    JOptionPane.showMessageDialog(null, name + ", você tem " +r+ " anos e nasceu no Domingo dia " +d+ " de Fevereiro de " +a);
                } else if(k==2) {
                    JOptionPane.showMessageDialog(null, name + ", você tem " +r+ " anos e nasceu na Segunda-Feira dia " +d+ " de Fevereiro de " +a);
                } else if(k==3) {
                    JOptionPane.showMessageDialog(null, name + ", você tem " +r+ " anos e nasceu na Terça-Feira dia " +d+ " de Fevereiro de " +a);
                } else if(k==4) {
                    JOptionPane.showMessageDialog(null, name + ", você tem " +r+ " anos e nasceu na Quarta-Feira dia " +d+ " de Fevereiro de " +a);
                } else if(k==5) {
                    JOptionPane.showMessageDialog(null, name + ", você tem " +r+ " anos e nasceu no Quinta-Feira dia " +d+ " de Fevereiro de " +a);
                } else if(k==6) {
                    JOptionPane.showMessageDialog(null, name + ", você tem " +r+ " anos e nasceu no Sexta-Feira dia " +d+ " de Fevereiro de " +a);
                }
                
        } else if(r>300 && r<400){
            
            // Operação Matemática
            r -= 300;
            a -= r;
            m = 3;
            k = d + 2*m + (3*(m+1)/5) + a + a/4 - a/100 + a/400 + 2;
            k = k%7;
            
                // Resultado
                if(k==0){
                    JOptionPane.showMessageDialog(null, name + ", você tem " +r+ " anos e nasceu no Sábado dia " +d+ " de Março de " +a);
                } else if(k==1) {
                    JOptionPane.showMessageDialog(null, name + ", você tem " +r+ " anos e nasceu no Domingo dia " +d+ " de Março de " +a);
                } else if(k==2) {
                    JOptionPane.showMessageDialog(null, name + ", você tem " +r+ " anos e nasceu na Segunda-Feira dia " +d+ " de Março de " +a);
                } else if(k==3) {
                    JOptionPane.showMessageDialog(null, name + ", você tem " +r+ " anos e nasceu na Terça-Feira dia " +d+ " de Março de " +a);
                } else if(k==4) {
                    JOptionPane.showMessageDialog(null, name + ", você tem " +r+ " anos e nasceu na Quarta-Feira dia " +d+ " de Março de " +a);
                } else if(k==5) {
                    JOptionPane.showMessageDialog(null, name + ", você tem " +r+ " anos e nasceu no Quinta-Feira dia " +d+ " de Março de " +a);
                } else if(k==6) {
                    JOptionPane.showMessageDialog(null, name + ", você tem " +r+ " anos e nasceu no Sexta-Feira dia " +d+ " de Março de " +a);
                }
            
        } else if(r>400 && r<500){
            
            // Operação Matemática
            r -= 400;
            a -= r;
            m = 4;
            k = d + 2*m + (3*(m+1)/5) + a + a/4 - a/100 + a/400 + 2;
            k = k%7;
            
                // Resultado
                if(k==0){
                    JOptionPane.showMessageDialog(null, name + ", você tem " +r+ " anos e nasceu no Sábado dia " +d+ " de Abril de " +a);
                } else if(k==1) {
                    JOptionPane.showMessageDialog(null, name + ", você tem " +r+ " anos e nasceu no Domingo dia " +d+ " de Abril de " +a);
                } else if(k==2) {
                    JOptionPane.showMessageDialog(null, name + ", você tem " +r+ " anos e nasceu na Segunda-Feira dia " +d+ " de Abril de " +a);
                } else if(k==3) {
                    JOptionPane.showMessageDialog(null, name + ", você tem " +r+ " anos e nasceu na Terça-Feira dia " +d+ " de Abril de " +a);
                } else if(k==4) {
                    JOptionPane.showMessageDialog(null, name + ", você tem " +r+ " anos e nasceu na Quarta-Feira dia " +d+ " de Abril de " +a);
                } else if(k==5) {
                    JOptionPane.showMessageDialog(null, name + ", você tem " +r+ " anos e nasceu no Quinta-Feira dia " +d+ " de Abril de " +a);
                } else if(k==6) {
                    JOptionPane.showMessageDialog(null, name + ", você tem " +r+ " anos e nasceu no Sexta-Feira dia " +d+ " de Abril de " +a);
                }
                
        } else if(r>500 && r<600){
            
            // Operação Matemática
            r -= 500;
            a -= r;
            m = 5;
            k = d + 2*m + (3*(m+1)/5) + a + a/4 - a/100 + a/400 + 2;
            k = k%7;
            
                // Resultado
                if(k==0){
                    JOptionPane.showMessageDialog(null, name + ", você tem " +r+ " anos e nasceu no Sábado dia " +d+ " de Maio de " +a);
                } else if(k==1) {
                    JOptionPane.showMessageDialog(null, name + ", você tem " +r+ " anos e nasceu no Domingo dia " +d+ " de Maio de " +a);
                } else if(k==2) {
                    JOptionPane.showMessageDialog(null, name + ", você tem " +r+ " anos e nasceu na Segunda-Feira dia " +d+ " de Maio de " +a);
                } else if(k==3) {
                    JOptionPane.showMessageDialog(null, name + ", você tem " +r+ " anos e nasceu na Terça-Feira dia " +d+ " de Maio de " +a);
                } else if(k==4) {
                    JOptionPane.showMessageDialog(null, name + ", você tem " +r+ " anos e nasceu na Quarta-Feira dia " +d+ " de Maio de " +a);
                } else if(k==5) {
                    JOptionPane.showMessageDialog(null, name + ", você tem " +r+ " anos e nasceu no Quinta-Feira dia " +d+ " de Maio de " +a);
                } else if(k==6) {
                    JOptionPane.showMessageDialog(null, name + ", você tem " +r+ " anos e nasceu no Sexta-Feira dia " +d+ " de Maio de " +a);
                }
            
        } else if(r>600 && r<700){
            
            // Operação Matemática
            r -= 600;
            a -= r;
            m = 6;
            k = d + 2*m + (3*(m+1)/5) + a + a/4 - a/100 + a/400 + 2;
            k = k%7;
            
                // Resultado
                if(k==0){
                    JOptionPane.showMessageDialog(null, name + ", você tem " +r+ " anos e nasceu no Sábado dia " +d+ " de Junho de " +a);
                } else if(k==1) {
                    JOptionPane.showMessageDialog(null, name + ", você tem " +r+ " anos e nasceu no Domingo dia " +d+ " de Junho de " +a);
                } else if(k==2) {
                    JOptionPane.showMessageDialog(null, name + ", você tem " +r+ " anos e nasceu na Segunda-Feira dia " +d+ " de Junho de " +a);
                } else if(k==3) {
                    JOptionPane.showMessageDialog(null, name + ", você tem " +r+ " anos e nasceu na Terça-Feira dia " +d+ " de Junho de " +a);
                } else if(k==4) {
                    JOptionPane.showMessageDialog(null, name + ", você tem " +r+ " anos e nasceu na Quarta-Feira dia " +d+ " de Junho de " +a);
                } else if(k==5) {
                    JOptionPane.showMessageDialog(null, name + ", você tem " +r+ " anos e nasceu no Quinta-Feira dia " +d+ " de Junho de " +a);
                } else if(k==6) {
                    JOptionPane.showMessageDialog(null, name + ", você tem " +r+ " anos e nasceu no Sexta-Feira dia " +d+ " de Junho de " +a);
                }
            
        } else if(r>700 && r<800){
            
            // Operação Matemática
            r -= 700;
            a -= r;
            m = 7;
            k = d + 2*m + (3*(m+1)/5) + a + a/4 - a/100 + a/400 + 2;
            k = k%7;
            
                // Resultado
                if(k==0){
                    JOptionPane.showMessageDialog(null, name + ", você tem " +r+ " anos e nasceu no Sábado dia " +d+ " de Julho de " +a);
                } else if(k==1) {
                    JOptionPane.showMessageDialog(null, name + ", você tem " +r+ " anos e nasceu no Domingo dia " +d+ " de Julho de " +a);
                } else if(k==2) {
                    JOptionPane.showMessageDialog(null, name + ", você tem " +r+ " anos e nasceu na Segunda-Feira dia " +d+ " de Julho de " +a);
                } else if(k==3) {
                    JOptionPane.showMessageDialog(null, name + ", você tem " +r+ " anos e nasceu na Terça-Feira dia " +d+ " de Julho de " +a);
                } else if(k==4) {
                    JOptionPane.showMessageDialog(null, name + ", você tem " +r+ " anos e nasceu na Quarta-Feira dia " +d+ " de Julho de " +a);
                } else if(k==5) {
                    JOptionPane.showMessageDialog(null, name + ", você tem " +r+ " anos e nasceu no Quinta-Feira dia " +d+ " de Julho de " +a);
                } else if(k==6) {
                    JOptionPane.showMessageDialog(null, name + ", você tem " +r+ " anos e nasceu no Sexta-Feira dia " +d+ " de Julho de " +a);
                }
            
        } else if(r>800 && r<900){
            
            // Operação Matemática
            r -= 800;
            a -= r;
            m = 8;
            k = d + 2*m + (3*(m+1)/5) + a + a/4 - a/100 + a/400 + 2;
            k = k%7;
            
                // Resultado
                if(k==0){
                    JOptionPane.showMessageDialog(null, name + ", você tem " +r+ " anos e nasceu no Sábado dia " +d+ " de Agosto de " +a);
                } else if(k==1) {
                    JOptionPane.showMessageDialog(null, name + ", você tem " +r+ " anos e nasceu no Domingo dia " +d+ " de Agosto de " +a);
                } else if(k==2) {
                    JOptionPane.showMessageDialog(null, name + ", você tem " +r+ " anos e nasceu na Segunda-Feira dia " +d+ " de Agosto de " +a);
                } else if(k==3) {
                    JOptionPane.showMessageDialog(null, name + ", você tem " +r+ " anos e nasceu na Terça-Feira dia " +d+ " de Agosto de " +a);
                } else if(k==4) {
                    JOptionPane.showMessageDialog(null, name + ", você tem " +r+ " anos e nasceu na Quarta-Feira dia " +d+ " de Agosto de " +a);
                } else if(k==5) {
                    JOptionPane.showMessageDialog(null, name + ", você tem " +r+ " anos e nasceu no Quinta-Feira dia " +d+ " de Agosto de " +a);
                } else if(k==6) {
                    JOptionPane.showMessageDialog(null, name + ", você tem " +r+ " anos e nasceu no Sexta-Feira dia " +d+ " de Agosto de " +a);
                }
            
        } else if(r>900 && r<1000){
            
            // Operação Matemática
            r -= 900;
            a -= r;
            m = 9;
            k = d + 2*m + (3*(m+1)/5) + a + a/4 - a/100 + a/400 + 2;
            k = k%7;
            
                // Resultado
                if(k==0){
                    JOptionPane.showMessageDialog(null, name + ", você tem " +r+ " anos e nasceu no Sábado dia " +d+ " de Setembro de " +a);
                } else if(k==1) {
                    JOptionPane.showMessageDialog(null, name + ", você tem " +r+ " anos e nasceu no Domingo dia " +d+ " de Setembro de " +a);
                } else if(k==2) {
                    JOptionPane.showMessageDialog(null, name + ", você tem " +r+ " anos e nasceu na Segunda-Feira dia " +d+ " de Setembro de " +a);
                } else if(k==3) {
                    JOptionPane.showMessageDialog(null, name + ", você tem " +r+ " anos e nasceu na Terça-Feira dia " +d+ " de Setembro de " +a);
                } else if(k==4) {
                    JOptionPane.showMessageDialog(null, name + ", você tem " +r+ " anos e nasceu na Quarta-Feira dia " +d+ " de Setembro de " +a);
                } else if(k==5) {
                    JOptionPane.showMessageDialog(null, name + ", você tem " +r+ " anos e nasceu no Quinta-Feira dia " +d+ " de Setembro de " +a);
                } else if(k==6) {
                    JOptionPane.showMessageDialog(null, name + ", você tem " +r+ " anos e nasceu no Sexta-Feira dia " +d+ " de Setembro de " +a);
                }
            
        } else if(r>1000 && r<1100){
            
            // Operação Matemática
            r -= 1000;
            a -= r;
            m = 10;
            k = d + 2*m + (3*(m+1)/5) + a + a/4 - a/100 + a/400 + 2;
            k = k%7;
            
                // Resultado
                if(k==0){
                    JOptionPane.showMessageDialog(null, name + ", você tem " +r+ " anos e nasceu no Sábado dia " +d+ " de Outubro de " +a);
                } else if(k==1) {
                    JOptionPane.showMessageDialog(null, name + ", você tem " +r+ " anos e nasceu no Domingo dia " +d+ " de Outubro de " +a);
                } else if(k==2) {
                    JOptionPane.showMessageDialog(null, name + ", você tem " +r+ " anos e nasceu na Segunda-Feira dia " +d+ " de Outubro de " +a);
                } else if(k==3) {
                    JOptionPane.showMessageDialog(null, name + ", você tem " +r+ " anos e nasceu na Terça-Feira dia " +d+ " de Outubro de " +a);
                } else if(k==4) {
                    JOptionPane.showMessageDialog(null, name + ", você tem " +r+ " anos e nasceu na Quarta-Feira dia " +d+ " de Outubro de " +a);
                } else if(k==5) {
                    JOptionPane.showMessageDialog(null, name + ", você tem " +r+ " anos e nasceu no Quinta-Feira dia " +d+ " de Outubro de " +a);
                } else if(k==6) {
                    JOptionPane.showMessageDialog(null, name + ", você tem " +r+ " anos e nasceu no Sexta-Feira dia " +d+ " de Outubro de " +a);
                }
            
        } else if(r>1100 && r<1200){
            
            // Operação Matemática
            r -= 1100;
            a -= r;
            m = 11;
            k = d + 2*m + (3*(m+1)/5) + a + a/4 - a/100 + a/400 + 2;
            k = k%7;
            
                // Resultado
                if(k==0){
                    JOptionPane.showMessageDialog(null, name + ", você tem " +r+ " anos e nasceu no Sábado dia " +d+ " de Novembro de " +a);
                } else if(k==1) {
                    JOptionPane.showMessageDialog(null, name + ", você tem " +r+ " anos e nasceu no Domingo dia " +d+ " de Novembro de " +a);
                } else if(k==2) {
                    JOptionPane.showMessageDialog(null, name + ", você tem " +r+ " anos e nasceu na Segunda-Feira dia " +d+ " de Novembro de " +a);
                } else if(k==3) {
                    JOptionPane.showMessageDialog(null, name + ", você tem " +r+ " anos e nasceu na Terça-Feira dia " +d+ " de Novembro de " +a);
                } else if(k==4) {
                    JOptionPane.showMessageDialog(null, name + ", você tem " +r+ " anos e nasceu na Quarta-Feira dia " +d+ " de Novembro de " +a);
                } else if(k==5) {
                    JOptionPane.showMessageDialog(null, name + ", você tem " +r+ " anos e nasceu no Quinta-Feira dia " +d+ " de Novembro de " +a);
                } else if(k==6) {
                    JOptionPane.showMessageDialog(null, name + ", você tem " +r+ " anos e nasceu no Sexta-Feira dia " +d+ " de Novembro de " +a);
                }
            
        } else if(r>1200 && r<1300){
            
            // Operação Matemática
            r -= 1200;
            a -= r;
            m = 12;
            k = d + 2*m + (3*(m+1)/5) + a + a/4 - a/100 + a/400 + 2;
            k = k%7;
            
                // Resultado
                if(k==0){
                    JOptionPane.showMessageDialog(null, name + ", você tem " +r+ " anos e nasceu no Sábado dia " +d+ " de Dezembro de " +a);
                } else if(k==1) {
                    JOptionPane.showMessageDialog(null, name + ", você tem " +r+ " anos e nasceu no Domingo dia " +d+ " de Dezembro de " +a);
                } else if(k==2) {
                    JOptionPane.showMessageDialog(null, name + ", você tem " +r+ " anos e nasceu na Segunda-Feira dia " +d+ " de Dezembro de " +a);
                } else if(k==3) {
                    JOptionPane.showMessageDialog(null, name + ", você tem " +r+ " anos e nasceu na Terça-Feira dia " +d+ " de Dezembro de " +a);
                } else if(k==4) {
                    JOptionPane.showMessageDialog(null, name + ", você tem " +r+ " anos e nasceu na Quarta-Feira dia " +d+ " de Dezembro de " +a);
                } else if(k==5) {
                    JOptionPane.showMessageDialog(null, name + ", você tem " +r+ " anos e nasceu no Quinta-Feira dia " +d+ " de Dezembro de " +a);
                } else if(k==6) {
                    JOptionPane.showMessageDialog(null, name + ", você tem " +r+ " anos e nasceu no Sexta-Feira dia " +d+ " de Dezembro de " +a);
                }
                
        }
    }
}
