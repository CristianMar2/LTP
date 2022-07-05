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

        JOptionPane.showMessageDialog(null,"Os n�meros est�o sendo atribu�dos!");
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
            (max - min + 1) - min, para pegar n�meros negativos
            vetor[i] = num.nextInt(51) - 25;
        }*/
        JOptionPane.showMessageDialog(null,"Os n�meros s�o: " + valores + ".");
        do {
            resp = Integer.parseInt(JOptionPane.showInputDialog(
                    """
                    Digite 1 se deseja ver a quantidade de n�meros pares e �mpares
                    Digite 2 para ver a quantidade de n�meros primos
                    Digite 3 para ver a quantidade de n�meros positivos e negativos
                    Digite 4 para ver a quantidade de n�meros m�ltiplos por um n�mero de sua escolha
                    Digite 5 para ver o maior e o menor valor do vetor
                    Digite 6 para ver a quantidade de n�meros duplicados, quais s�o e quantas vezes repetem no vetor
                    Digite 7 para sair do programa
                    """));
            if (resp < 1 || resp > 7)
                JOptionPane.showMessageDialog(null,"Resposta inv�lida! Tente novamente");
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
                JOptionPane.showMessageDialog(null, "H� " + cont1 + " n�meros primos!");
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
        JOptionPane.showMessageDialog(null, "H� " + cont1 + " n�meros pares e " + cont2 +
                " n�meros �mpares!");
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
        JOptionPane.showMessageDialog(null, "H� " + cont1 + " n�meros positivos e " + cont2
                + " n�meros negativos!");
    }
    public static void verificaMultiplo(int[] vetor)
    {
        int cont1, cont2 = 0;
        cont1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o n�mero que deseja ver os m�ltiplos:"));
        for (int i = 0; i < 10; i++)
        {
            if (vetor[i] % cont1 == 0)
                cont2++;
        }
        JOptionPane.showMessageDialog(null, "H� " + cont2 + " m�ltiplo(s) de " + cont1 + "!");
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
        JOptionPane.showMessageDialog(null, "O maior n�mero � " + cont1 + " e o menor n�mero" +
                " � " + cont2 + "!");
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
            JOptionPane.showMessageDialog(null,"H� n�meros iguais! Eles s�o "+valores+
                    " e repetem "+fim+"respectivamente!");
        else
            JOptionPane.showMessageDialog(null,"N�o h� n�meros duplicados!");
    }
}