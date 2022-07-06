package Lista5;

import javax.swing.*;
import java.util.Arrays;

public class Questao10
{
    public static void main(String[] args)
    {
        char[][] jogoVelha = new char[3][3];
        String jogador1, jogador2;
        int i;

        for (i = 0; i < 3; i++)
            Arrays.fill(jogoVelha[i], ' ');
        jogador1 = JOptionPane.showInputDialog("Digite o nome do primeiro jogador:");
        jogador2 = JOptionPane.showInputDialog("Digite o nome do segundo jogador:");
        imprimeJogo(jogoVelha);
        do
        {

        }while(true);
    }
    public static void imprimeJogo(char[][] velha)
    {
        StringBuilder jogo = new StringBuilder("");

        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                jogo.append(velha[i][j]);
                if (j < 2)
                    jogo.append("   |");
            }
            if (i < 2)
                jogo.append("\n--+--+--\n");
        }
        JOptionPane.showMessageDialog(null,jogo);
    }
}