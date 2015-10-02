import javax.swing.*;

class Vetor_fun01
{
public static void main (String x[])
  {
     int i, soma = 0, vet[];

    vet = new int [10];

    for(i = 0 ; i <= 9 ; i++)
      {
        vet[i] = Integer.parseInt(JOptionPane.showInputDialog("digite um número"));
      }

     soma = Soma_Vetor(vet);
     JOptionPane.showMessageDialog (null, " A SOMA DO VETOR É " +soma);
    
}

public static int Soma_Vetor (int vet[])
  {
    int s = 0, i;

    for (i = 0 ; i < 10 ; i++)
      {
         s = vet[i] + s;
      }
    return s;
  }

// mdulo principal com a chamada adequada dos mdulos


}









