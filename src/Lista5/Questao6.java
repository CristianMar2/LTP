package Lista5;

import javax.swing.*;

public class Questao6
{
    public static void main(String[] args)
    {
        JOptionPane.showMessageDialog(null,"A matriz está sendo feita.");
        fazMatriz();
    }
    public static void fazMatriz()
    {
        int[][] matriz = new int[5][5];
        StringBuilder imprim = new StringBuilder();

        for (int i = 0; i < 5; i++)
        {
            for (int j = 0; j < 5; j ++)
            {
                if (i == j)
                    matriz[i][j] = 1;
                else
                    matriz[i][j] = 0;
                imprim.append(matriz[i][j]).append(" | ");
            }
            imprim.append("\n");
        }
        JOptionPane.showMessageDialog(null,"A matriz ficou assim:\n\n" + imprim);
    }
}