package Lista5;

import javax.swing.*;
import java.util.Random;

public class Questao8
{
    public static void main(String[] args)
    {
        int[][] produtos = new int[10][50];
        int i, j, resp = 0;
        Random nota = new Random();

        JOptionPane.showMessageDialog(null,"As notas estão sendo atribuídas.");
        for (i = 0; i < 10; i++)
        {
            for (j = 0; j < 50; j++)
                produtos[i][j] = nota.nextInt(10) + 1;
        }
        while(true)
        {
            resp = Integer.parseInt(JOptionPane.showInputDialog("""
                    Digite 1 para ver a média de avaliação de todos os produtos
                    Digite 2 para ver a média e a frequência de notas de um produto específico
                    Digite 3 para ver um gráfico com as médias das avaliações
                    Digite 4 para ver um gráfico com a frequência de avaliações de um determinado produto
                    Digite 5 para finalizar o programa"""));
            switch (resp)
            {
                case 1:
                    StringBuilder result = new StringBuilder("");
                    float[] medias = new float[10];

                    for (i = 0; i < 10; i++)
                    {
                        medias[i] = (float) verificaMediaTotal(produtos[i]);
                        result.append("A média do produto ").append(i + 1).append(" é: ").append(medias[i]).append("\n");
                    }
                    JOptionPane.showMessageDialog(null, result);
                    break;
                case 2:
                    do {
                        resp = Integer.parseInt(JOptionPane.showInputDialog("Digite o número do produto:")) - 1;
                        if (resp < 0 || resp > 9)
                        {
                            JOptionPane.showMessageDialog(null, "Produto inexistente, tente novamente!");
                        }
                    } while (resp < 0 || resp > 9);
                    verificaProdutoEspec(produtos, resp);
                    break;
                case 3:
                    int[] media = new int[10];

                    for (i = 0; i < 10; i++)
                        media[i] = (int) verificaMediaTotal(produtos[i]);
                    imprimiGraficoMedia(media);
                    break;
                case 4:
                    do
                    {
                        resp = Integer.parseInt(JOptionPane.showInputDialog("Digite o número do produto:")) - 1;
                        if (resp < 0 || resp > 9)
                        {
                            JOptionPane.showMessageDialog(null, "Produto inexistente, tente novamente!");
                        }
                    } while (resp < 0 || resp > 9);
                    imprimiGraficoEspc(produtos, resp);
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null,"O programa está sendo finalizado!");
                    System.exit(0);
                    break;
            }
        }
    }
    public static float verificaMediaTotal(int[] produtos)
    {
        float media = 0;

        for (int j = 0; j < 50; j++)
        {
            media += produtos[j];
        }
        media = media / 50;
        return media;
    }
    public static void verificaProdutoEspec(int[][] produto, int resp)
    {
        int media = 0;
        int[] freq = new int[11];
        StringBuilder frequencia = new StringBuilder("");

        for (int i = 0; i < 50; i++)
        {
            media += produto[resp][i];
            freq[produto[resp][i]]++;
        }
        for (int i = 1; i < 11; i++)
        {
            frequencia.append("Nota ").append(i).append(" : ").append(freq[i]).append("\n");
        }
        media = media / 50;
        JOptionPane.showMessageDialog(null,"A média do produto escolhido foi: "+ media +"\nE a frequência de cada" +
                " nota foi:\n"+ frequencia);
    }
    public static void imprimiGraficoMedia(int[] vetor)
    {
        StringBuilder grafico = new StringBuilder("");

        for (int i = 0; i < 10; i++)
        {
            grafico.append("|");
            for (int j = 0; j < 10; j++)
            {
                if (j < vetor[i])
                    grafico.append("* ");
                else grafico.append("   ");
            }
            grafico.append("Produto ").append(i+1).append("\n");
        }
        JOptionPane.showMessageDialog(null,grafico);
    }
    public static void imprimiGraficoEspc(int[][] vetor, int resp)
    {
        int[] freq = new int[11];
        StringBuilder grafico = new StringBuilder("");

        for (int i = 0; i < 50; i++)
            freq[vetor[resp][i]]++;
        for (int i = 1; i < 11; i++)
        {
            grafico.append("|");
            for (int j = 1; j < 11; j++)
            {
                if (j <= freq[i])
                    grafico.append("* ");
                else grafico.append("  ");
            }
            grafico.append(" Nota ").append(i).append("\n");
        }
        JOptionPane.showMessageDialog(null, grafico);
    }
}