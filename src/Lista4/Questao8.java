package Lista4;

import javax.swing.*;

public class Questao8
{
    public static void main(String[] args)
    {
        int[] vetor1 = new int[5], vetor2 = new int[5];
        int i, j, count = 0;

        for (i = 0; i < 5; i++)
        {
            vetor1[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o "+ (i + 1) +"º número do primeiro vetor:"));
            vetor2[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o "+ (i + 1) +"° número do segundo vetor"));
        }
        if(verificaIgual(vetor1, vetor2))
            JOptionPane.showMessageDialog(null,"Há pelo menos um número em comum entre os dois vetores");
        else
            JOptionPane.showMessageDialog(null,"Não há nenhum número em comum entre os dois vetores");
    }
    public static boolean verificaIgual(int[] vet1, int[] vet2)
    {
        for (int i = 0; i < 5; i++)
        {
            for (int j = 0; j < 5; j ++)
            {
                if (vet1[i] == vet2[j])
                {
                    return true;
                }
            }
        }
        return false;
    }
}