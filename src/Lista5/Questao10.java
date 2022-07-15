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
        boolean vezPrimeiro = true;
        boolean encerra = false;

        for (i = 0; i < 3; i++)
            Arrays.fill(jogoVelha[i], ' ');
        jogador1 = JOptionPane.showInputDialog("Digite o nome do primeiro jogador:");
        jogador2 = JOptionPane.showInputDialog("Digite o nome do segundo jogador:");

        while (!encerra)
        {
            imprimeJogo(jogoVelha);
            if (vezPrimeiro)
            {
                System.out.println("\nVez do(a) " + jogador1 + " (x):");
            } else
            {
                System.out.println("\nVez do(a) " + jogador2 + " (o):");
            }
            char simbolo = ' ';
            if (vezPrimeiro)
            {
                simbolo = 'X';
            }
            else
            {
                simbolo = 'O';
            }
            int linha = 0;
            int coluna = 0;
            while (true)
            {
                linha = Integer.parseInt(JOptionPane.showInputDialog("Digite o número da linha (1, 2, ou 3): "));
                coluna = Integer.parseInt(JOptionPane.showInputDialog("Digite o número da coluna (1, 2, ou 3): "));
                if (linha < 1 || coluna < 1 || linha > 3 || coluna > 3)
                   JOptionPane.showMessageDialog(null,"Essa posição não existe no tabuleiro! Tente novamente.");
                else if (jogoVelha[linha-1][coluna-1] != ' ')
                    JOptionPane.showMessageDialog(null,"Essa posição já foi escolhida! Tente novamente.");
                else
                    break;
            }
            jogoVelha[linha-1][coluna-1] = simbolo;
            if (verificaGanhador(jogoVelha) == 'X')
            {
                JOptionPane.showMessageDialog(null,"Parabéns " + jogador1 + ", você ganhou!");
                encerra = true;
            }
            else if (verificaGanhador(jogoVelha) == 'O')
            {
                JOptionPane.showMessageDialog(null,"Parabéns " + jogador2 + ", você ganhou!");
                encerra = true;
            }
            else
            {
                if (tabuleiroEstaCheio(jogoVelha))
                {
                    JOptionPane.showMessageDialog(null,"Que pena, deu velha!");
                    encerra = true;
                }
                else
                    vezPrimeiro = !vezPrimeiro;
            }
        }
        imprimeJogo(jogoVelha);
    }
    public static char verificaGanhador(char[][] tabuleiro)
    {
        for (int i = 0; i < 3; i++)
        {
            if (tabuleiro[i][0] == tabuleiro[i][1] && tabuleiro[i][1] == tabuleiro[i][2] && tabuleiro[i][0] != ' ')
                return tabuleiro[i][0];
        }
        for (int j = 0; j < 3; j++)
        {
            if (tabuleiro[0][j] == tabuleiro[1][j] && tabuleiro[1][j] == tabuleiro[2][j] && tabuleiro[0][j] != ' ')
                return tabuleiro[0][j];
        }
        if (tabuleiro[0][0] == tabuleiro[1][1] && tabuleiro[1][1] == tabuleiro[2][2] && tabuleiro[0][0] != ' ')
            return tabuleiro[0][0];
        if (tabuleiro[2][0] == tabuleiro[1][1] && tabuleiro[1][1] == tabuleiro[0][2] && tabuleiro[2][0] != ' ')
            return tabuleiro[2][0];
        return ' ';
    }
    public static boolean tabuleiroEstaCheio(char[][] tabuleiro)
    {
        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                if (tabuleiro[i][j] == ' ')
                    return false;
            }
        }
        return true;
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