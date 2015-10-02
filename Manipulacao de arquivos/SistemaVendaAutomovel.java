import java.io.*;	
import javax.swing.JOptionPane;
public class SistemaVendaAutomovel{
    static RegistroAutomovel[] automovel = new RegistroAutomovel[3];
    public static void main (String arg [ ]) throws IOException	 {
      int opc,solicitaCodigo,retornoCodigo;
      double solicitaPreco = 0;
      
    do
    {
      opc = Integer.parseInt(JOptionPane.showInputDialog("1 - Grava Veiculos \n 2 - Pesquisa Preco \n 3 - Pesquisa Codigo \n 9 - FIM"));
      switch (opc)
         {
            case 1: automovel = GravaAutomovel(automovel);	
                    break;
                    
            case 2: 
                    solicitaPreco = Double.parseDouble(JOptionPane.showInputDialog("Digite o preco maximo a ser pesquisado "));	
                    PesquisaPreco(automovel,solicitaPreco);
                    break;
           
            case 3: solicitaCodigo = Integer.parseInt(JOptionPane.showInputDialog("Digite o codigo a ser pesquisado "));	
                    if ((PesquisaCodigo(automovel,solicitaCodigo)) == 1)
                       {
                         JOptionPane.showMessageDialog(null,"Codigo encontrado ");                      	
                       }
                    else
                       {
                         JOptionPane.showMessageDialog(null,"Codigo não encontrado ");                      	
                       }
                    
                    break;
            
            case 9: JOptionPane.showMessageDialog(null,"FIM DO PROCESSAMENTO ");
                    break;
            default: JOptionPane.showMessageDialog(null,"Codigo nao encontrado");
         }
         
      } while (opc!=9);
            
     
   }
   
    static RegistroAutomovel[] GravaAutomovel(RegistroAutomovel[] automovel) throws IOException	
     {
       int i;	
       String fileName = "ArquivoAutomovel.txt";	
	
       BufferedWriter writer = new BufferedWriter(new FileWriter( fileName ));	

       for (i = 0 ; i < 3 ; i++)	
       automovel[i] = new RegistroAutomovel();
	
       for (i = 0 ; i < 3 ; i++)
           {	
              automovel[i].vcod =Integer.parseInt(JOptionPane.showInputDialog("Entre com o codigo do veiculo "));	
              writer.write(Integer.toString(automovel[i].vcod));   	
              writer.newLine();	
              automovel[i].vnome = JOptionPane.showInputDialog("Entre o nome do veiculo");	
              writer.write( automovel[i].vnome);  	
              writer.newLine();
              automovel[i].vtipo = Integer.parseInt(JOptionPane.showInputDialog("Entre com o tipo do veiculo "));	
              writer.write(Integer.toString(automovel[i].vtipo));   	
              writer.newLine();	
              automovel[i].vvalor = Double.parseDouble(JOptionPane.showInputDialog("Entre com o valor do veiculo "));	
              writer.write(Double.toString(automovel[i].vtipo));   	
              writer.newLine();	
           
           }	
  	
          writer.close();
          return automovel;	
   } 
   
   static void PesquisaPreco(RegistroAutomovel[] automovel, Double preco) 	
        {	
          int i;	
    
         for (i = 0 ; i < 3; i++) 
             {	
              if (automovel[i].vvalor <= preco)
                 {
                   System.out.println(automovel[i].vcod + 
                                      " " + automovel[i].vnome + 
                                      " " + automovel[i].vtipo +
                                      " " + automovel[i].vvalor);	
                 }
                
             }
        }
        
        
     static int PesquisaCodigo(RegistroAutomovel[] automovel, int codigo){
     	
     	int i,flag=0;	
    
        for (i = 0 ; i < 3; i++) 
             {	
              if (codigo == automovel[i].vcod)
                 {
                   flag = 1;
                   break;	
                 }
              else
                 {
                   flag = 2;   	
                 }
              }
         return flag;            
                
      }
     	
     }
      	
	
 



