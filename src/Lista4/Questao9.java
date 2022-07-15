package Lista4;

import javax.swing.*;
import java.util.Random;

public class Questao9
{
    public static void main(String[] args)
    {
        int[] vetor = new int[10];
        int  i;
        StringBuilder valores = new StringBuilder();
        Random gira = new Random();

        JOptionPane.showMessageDialog(null, "Os números estão sendo atribuídos.");
        for (i = 0; i < 10; i++)
        {
            vetor[i] = gira.nextInt(11);
            valores.append(vetor[i]).append(" | ");
        }
        JOptionPane.showMessageDialog(null,"Os números são: "+valores);
        verificaMenor2(vetor);
    }
    public static void verificaMenor2(int[] vet)
    {
        int i, prim, segu;
        if(vet[0] < vet[1])
        {
            prim = vet[0];
            segu = vet[1];
        }
        else
        {
            prim = vet[1];
            segu = vet[0];
        }
        for (i = 2; i < 10; i++)
        {
            if (vet[i] < segu)
            {
                if (vet[i] < prim)
                {
                    segu = prim;
                    prim = vet[i];
                }
                else
                    segu = vet[i];
            }
        }
        JOptionPane.showMessageDialog(null, "O segundo menor número no vetor é: "+segu);
    }
}