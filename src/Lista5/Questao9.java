package Lista5;

import javax.swing.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.jar.JarEntry;

public class Questao9
{
    public static void main(String[] args)
    {
        String[][] cinema = new String[3][4];
        for(int i=0; i<cinema.length; i++)
            Arrays.fill(cinema[i], ".");
        String nome, reserva;
        int linha, coluna, count=0;

        while (true){
            imprimeSala(cinema);
            while (true)
            {
                reserva = JOptionPane.showInputDialog("Digite o nome seguido da linha e da coluna para fazer uma" +
                        " reserva. Caso queira sair digite [0 0 0]");
                nome = reserva.split(" ")[0];
                linha = Integer.parseInt(reserva.split(" ")[1]);
                coluna = Integer.parseInt(reserva.split(" ")[2]);

                if (nome.equals(0)) break;
                else if (linha < 1 || coluna < 1 || linha > 3 || coluna > 4)
                    JOptionPane.showMessageDialog(null,"Número de assento inválido");
                else break;
            }
            if (nome.equals("0")) break;
            else if (fazReserva(cinema, nome, linha, coluna))
            {
                cinema[linha - 1][coluna - 1] = nome;
                count++;
            }

            if(count == 12) break;
        }
        imprimeSala(cinema);
        JOptionPane.showMessageDialog(null,"O programa foi finalizado pois, a quantidade total de assentos foram" +
                " preenchidos ou o usuário não deseja mais fazer reservas! Obrigado pela preferência!");
    }
    public static void imprimeSala(String[][] m)
    {
        StringBuffer sala = new StringBuffer("");

        sala.append("Os assentos da sala do cinema são:").append("\n\n");
        for(int i = 0; i<m.length; i++)
        {
            for(int j=0; j<m[0].length; j++)
            {
                sala.append(m[i][j]).append("       ");
            }
            sala.append("\n");
        }
        JOptionPane.showMessageDialog(null, sala);
    }
    public static boolean fazReserva(String[][] reserva, String nome, int linha, int coluna)
    {
        if (reserva[linha - 1][coluna - 1].equals("."))
            return true;
        else{
            JOptionPane.showMessageDialog(null,"Assento ocupado, tente novamente.");
            return false;
        }
    }
}