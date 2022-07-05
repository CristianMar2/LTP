package Lista5;

import javax.swing.*;
import java.util.Random;

public class Questao2
{
    public static void main(String[] args)
    {
        JOptionPane.showMessageDialog(null,"Os dados estão sendo jogados.");
        jogarDados();
    }
    public static void jogarDados()
    {
        Random face = new Random();
        int cont = 0, dado1, dado2;

        do
        {
            dado1 = face.nextInt(6) + 1;
            dado2 = face.nextInt(6) + 1;
            cont++;
        } while (dado1 + dado2 != 7);
        JOptionPane.showMessageDialog(null,"A soma das faces dos dados foi igual a 7, para isso, foi necessário jogar" +
                " os dados "+ cont +" vezes. O primeiro dado deu "+ dado1 + " e o segundo dado deu "+ dado2);
    }
}