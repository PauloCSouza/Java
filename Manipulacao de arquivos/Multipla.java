 import java.io.*;	
import javax.swing.JOptionPane;
public class Multipla {
    static Aluno[] aluno = new Aluno[3];
    public static void main (String arg [ ]) throws IOException	 {
      int opc;
    do
    {
      opc = Integer.parseInt(JOptionPane.showInputDialog("1 - GRAVAR ARQUIVO \n 2 - LER REGISTRO \n 9 - FIM"));
      switch (opc)
         {
            case 1: GravaAluno(aluno);	
                    break;
            case 2: LerAluno();
                    break;
            case 9: JOptionPane.showMessageDialog(null,"FIM DO PROCESSAMENTO ");
                    break;
            default: JOptionPane.showMessageDialog(null,"CODIGO ERRADO");
         }
         
      } while (opc!=9);
            
     
   }
   
    static void GravaAluno(Aluno[] aluno)	throws IOException	
     {
      // Aluno[] aluno = new Aluno[3];	
       int i;	
       String fileName = "ArquivoAluno.txt";	
	
       BufferedWriter writer = new BufferedWriter(new FileWriter( fileName ));	

       for (i = 0 ; i < 3 ; i++)	
       aluno[i] = new Aluno();
	
       for (i = 0 ; i < 3 ; i++)
           {	
              aluno[i].pnome = JOptionPane.showInputDialog("Entre o nome do aluno:");	
              writer.write( aluno[i].pnome );  	
              writer.newLine();	
              aluno[i].unome = JOptionPane.showInputDialog("Entre o sobrenome do aluno:");	
              writer.write( aluno[i].unome );  	
              writer.newLine();	
              aluno[i].pontos = Integer.parseInt(JOptionPane.showInputDialog("Pontos Graduao do aluno:"));	
              writer.write(Integer.toString(aluno[i].pontos));   	
              writer.newLine();	
           }	
  	
      for (i = 0 ; i < 3; i++) {	
          System.out.println(aluno[i].pnome + " " + aluno[i].unome + " pontos: " + aluno[i].pontos);	
           }
          writer.close();	
   } 
   
   static void LerAluno()  throws IOException	
        {	
         // Aluno[] aluno = new Aluno[3];	
          int i;	
          String fileName = "ArquivoAluno.txt";	
	
          BufferedReader ler = new BufferedReader(new FileReader( fileName ));	

          for (i = 0 ; i < 3 ; i++)	
               aluno[i] = new Aluno();
	
          for (i = 0 ; i < 3 ; i++)
             {	
                aluno[i].pnome = ler.readLine();  	
                aluno[i].unome = ler.readLine();	
                aluno[i].pontos = Integer.parseInt(ler.readLine());	
             }	
  	
         for (i = 0 ; i < 3; i++) {	
            System.out.println(aluno[i].pnome + " " + aluno[i].unome + " pontos: " + aluno[i].pontos);	
          }
         ler.close();	
	
} 

}

