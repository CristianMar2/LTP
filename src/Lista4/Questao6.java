package Lista4;

import javax.swing.*;
import java.util.Random;

public class Questao6
{
    public static void main(String[] args)
    {
        int[] vetor = new int[10];
        int i, resp, cont1 = 0;
        boolean sinal;
        Random num = new Random();
        StringBuilder valores = new StringBuilder();

        JOptionPane.showMessageDialog(null,"Os números estão sendo atribuídos!");
        for (i = 0; i < 10; i ++)
        {
            sinal = num.nextBoolean();
            if (sinal)
                vetor[i] = num.nextInt(26);
            else
                vetor[i] = num.nextInt(26) * -1;
            valores.append(vetor[i]).append(" | ");
        }
        /*for (i = 0; i < 10; i ++)
        {
            (max - min + 1) - min, para pegar números negativos
            vetor[i] = num.nextInt(51) - 25;
        }*/
        JOptionPane.showMessageDialog(null,"Os números são: " + valores + ".");
        do {
            resp = Integer.parseInt(JOptionPane.showInputDialog(
                    """
                    Digite 1 se deseja ver a quantidade de números pares e ímpares
                    Digite 2 para ver a quantidade de números primos
                    Digite 3 para ver a quantidade de números positivos e negativos
                    Digite 4 para ver a quantidade de números múltiplos por um número de sua escolha
                    Digite 5 para ver o maior e o menor valor do vetor
                    Digite 6 para ver a quantidade de números duplicados, quais são e quantas vezes repetem no vetor
                    Digite 7 para sair do programa
                    """));
            if (resp < 1 || resp > 7)
                JOptionPane.showMessageDialog(null,"Resposta inválida! Tente novamente");
        }while (resp < 1 || resp > 7);
        switch (resp)
        {
            case 1: verificaParImpar(vetor);
            case 2:
                for (i = 0; i < vetor.length; i++)
                {
                    if (verificaPrimos(vetor[i]))
                    {
                        cont1++;
                    }
                }
                JOptionPane.showMessageDialog(null, "Há " + cont1 + " números primos!");
                break;
            case 3: verificaPosNeg(vetor);
            case 4: verificaMultiplo(vetor);
            case 5: verificaMaiorMenor(vetor);
            case 6: verificaDuplicado(vetor);
            case 7: JOptionPane.showMessageDialog(null,"Obrigado por utilizar o programa!!");
                System.exit(0);
        }
    }
    public static void verificaParImpar(int[] vetor)
    {
        int cont1 = 0, cont2 = 0;
        for ( int i = 0; i < 10; i++)
        {
            if (vetor[i] % 2 == 0)
                cont1++;
            else
                cont2++;
        }
        JOptionPane.showMessageDialog(null, "Há " + cont1 + " números pares e " + cont2 +
                " números ímpares!");
    }
    public static boolean verificaPrimos(int x)
    {
        if (x <= 1 )
            return false;
        else if (x == 2 || x == 3)
            return true;
        else
        {
            for (int j = 2; j <= Math.sqrt(x); j++)
            {
                if (x % j == 0)
                    return false;
            }
            return true;
        }
    }
    public static void verificaPosNeg(int[] vetor)
    {
        int cont1 = 0, cont2 = 0;
        for (int i = 0; i < 10; i++)
        {
            if (vetor[i] > 0)
                cont1++;
            else
                cont2++;
        }
        JOptionPane.showMessageDialog(null, "Há " + cont1 + " números positivos e " + cont2
                + " números negativos!");
    }
    public static void verificaMultiplo(int[] vetor)
    {
        int cont1, cont2 = 0;
        cont1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o número que deseja ver os múltiplos:"));
        for (int i = 0; i < 10; i++)
        {
            if (vetor[i] % cont1 == 0)
                cont2++;
        }
        JOptionPane.showMessageDialog(null, "Há " + cont2 + " múltiplo(s) de " + cont1 + "!");
    }
    public static void verificaMaiorMenor(int[] vetor)
    {
        int cont1, cont2;
        cont1 = vetor[0];
        cont2 = vetor[0];
        for (int i = 0; i < 10; i++) {
            if (vetor[i] > cont1)
                cont1 = vetor[i];
            if (vetor[i] < cont2)
                cont2 = vetor[i];
        }
        JOptionPane.showMessageDialog(null, "O maior número é " + cont1 + " e o menor número" +
                " é " + cont2 + "!");
    }
    public static void verificaDuplicado(int[] vetor)
    {
        boolean sinal = false;
        StringBuilder valores = new StringBuilder();
        StringBuilder fim = new StringBuilder();
        int[] rep = new int[51];

        for (int j : vetor)
        {
            rep[j + 25]++;
            if (rep[j + 25] > 1)
            {
                valores.append(j).append(" ");
                fim.append(rep[j + 25]).append(" vezes, ");
                sinal = true;
            }
        }
        if (sinal)
            JOptionPane.showMessageDialog(null,"Há números iguais! Eles são "+valores+
                    " e repetem "+fim+"respectivamente!");
        else
            JOptionPane.showMessageDialog(null,"Não há números duplicados!");
    }
}