package Lista4;

import javax.swing.*;

public class Questao7
{
    public static void main(String[] args)
    {
        String[] vetor1 = new String[5], vetor2 = new String[5];
        int i;

        for (i = 0; i < 5; i++)
        {
            vetor1[i] = JOptionPane.showInputDialog("Digite a "+ (i+1) +"º palavra para o primeiro vetor:");
            vetor2[i] = JOptionPane.showInputDialog("Digite a "+ (i+1) +"° palavra para o segundo vetor:");
        }
        if (verificaIgual(vetor1, vetor2))
            JOptionPane.showMessageDialog(null,"Há pelo menos uma palavra em comum entre os vetores!!!");
        else
            JOptionPane.showMessageDialog(null,"Não há nenhuma palavra em comum entre os vetores!!!");
    }
    public static boolean verificaIgual(String[] text1, String[] text2)
    {
        for (int i = 0; i < 5; i++)
        {
            for (int y = 0; y < 5; y++)
            {
                if (text1[i].equals(text2[y]))
                    return true;
            }
        }
        return false;
    }
}