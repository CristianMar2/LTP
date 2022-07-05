package Lista5;

import javax.swing.*;
import java.util.Random;

public class Questao7
{
    public static void main(String[] args)
    {
        JOptionPane.showMessageDialog(null,"As duas matrizes estão sendo feitas.");
        somaMatriz();
    }
    public static void somaMatriz()
    {
        int[][] matriz1 = new int[3][3], matriz2 = new int[3][3], soma = new int[3][3];
        StringBuilder impri1 = new StringBuilder(""), impri2 = new StringBuilder(""), result = new StringBuilder("");
        Random valor = new Random();

        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                matriz1[i][j] = valor.nextInt(5) + 1;
                impri1.append(matriz1[i][j]).append(" | ");
                matriz2[i][j] = valor.nextInt(5) + 1;
                impri2.append(matriz2[i][j]).append(" | ");
                soma[i][j] = matriz1[i][j] + matriz2[i][j];
                result.append(soma[i][j]).append(" | ");
            }
            impri1.append("\n");
            impri2.append("\n");
            result.append("\n");
        }
        JOptionPane.showMessageDialog(null,"A primeira matriz foi:\n"+ impri1);
        JOptionPane.showMessageDialog(null,"A segunda matriz foi:\n"+ impri2);
        JOptionPane.showMessageDialog(null,"A soma das duas matrizes deu:\n"+ result);
    }
}