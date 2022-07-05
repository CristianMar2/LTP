package Lista4;

import javax.swing.*;

public class Questao5
{
    public static void main(String[] args)
    {
        long[] vetor = new long[10];
        boolean verif = false;

        for (int i = 0; i < 10; i++)
        {
            vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero:"));
        }
        for (long l : vetor)
        {
            if (verificaPrimo(l))
            {
                verif = true;
                break;
            }
        }
        if(verif) System.out.println("Existe um n�mero primo na sequ�ncia.");
        else System.out.println("N�o tem n�mero primo na sequ�ncia.");
    }

    public static boolean verificaPrimo(long vet)
    {
        if(vet<=1)
            return false;
        if(vet == 2 || vet== 3)
            return true;
        else{
            for(int j = 2; j <= Math.sqrt(vet) ; j++)
            {
                if( vet % j == 0)
                    return false;
            }
            return true;
        }
    }
}
