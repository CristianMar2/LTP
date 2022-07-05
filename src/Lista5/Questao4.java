package Lista5;

import javax.swing.*;
import java.util.Random;

public class Questao4
{
    public static void main(String[] args)
    {
        JOptionPane.showMessageDialog(null,"A matriz está sendo construída.");
        somaMatriz();
    }
    public static void somaMatriz()
    {
        int[][] matriz = new int[3][10];
        int[] soma = new int[3];
        StringBuilder imprim = new StringBuilder();
        Random num = new Random();

        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 10; j++)
            {
                matriz[i][j] = num.nextInt(10) + 1;
                if (matriz[i][j] == 10)
                    imprim.append(matriz[i][j]).append(" \t | \t");
                else
                    imprim.append(matriz[i][j]).append(" \t | \t");
                soma[i] += matriz[i][j];
            }
            imprim.append(" = ").append(soma[i]).append("\n");
        }
        JOptionPane.showMessageDialog(null,"A matriz junto com a soma de suas linhas foi:\n\n"+ imprim);
    }
}