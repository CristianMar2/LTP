package Lista4;

import javax.swing.*;

public class Questao10
{
    public static void main(String[] args)
    {
        int[] vetor = new int[5];
        int i;

        for (i = 0; i < 5; i++)
            vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o "+(i + 1)+"º número do vetor"));
        verificaOrdem(vetor);
    }
    public static void verificaOrdem(int[] vet)
    {
        int i, cresc = 0, decres = 0;
        for (i = 0; i < 4; i ++)
        {
            if (vet[i] < vet[i + 1])
                cresc++;
            else if (vet[i] > vet[i + 1])
                decres++;
        }
        if (decres == 4)
            JOptionPane.showMessageDialog(null,"Os números estão organizados em ordem decrescente!!!");
        else if (cresc == 4)
            JOptionPane.showMessageDialog(null,"Os números estão organizados em ordem crescente!!!");
        else
            JOptionPane.showMessageDialog(null,"Os números estão desorganizados!!! Que desmazelo!!!");
    }
}