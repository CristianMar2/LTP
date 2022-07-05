package Lista5;

import javax.swing.*;

public class Questao5
{
    public static void main(String[] args)
    {
        JOptionPane.showMessageDialog(null,"O Jogo da Velha");
        jogoVelha();
    }
    public static void jogoVelha()
    {
        String[][] velha = new String[3][3];

        velha[0][0] = "O | ";
        velha[0][1] = "  | ";
        velha[0][2] = "O\n";
        velha[1][0] = "  | ";
        velha[1][1] = "X | ";
        velha[1][2] = " \n";
        velha[2][0] = "X | ";
        velha[2][1] = "  | ";
        velha[2][2] = "O";
        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                System.out.print(velha[i][j]);
            }
        }
    }
}