package Lista5;

public class Questao11
{
    public static void main(String[] args)
    {
        quadro();
        formaX();
        losango();
        //Obs.: O losango foi feito utilizando "@" e "*" pois com 0 e 1 não tinha um bom contraste.
    }
    public static void quadro()
    {
        char[][] figura = new char[12][12];
        StringBuilder mostra = new StringBuilder("");
        int i, j;

        for ( i = 0; i < figura.length; i++)
        {
            for ( j = 0; j < figura.length; j++)
            {
                if (i == 0 || i == 1 || j == 0 || j == 1 || i == 11 || i == 10 || j == 11 || j == 10)
                    figura[i][j] = '0';
                else
                    figura[i][j] = '1';
                mostra.append(figura[i][j]);
            }
            mostra.append("\n");
        }
        System.out.println(mostra);
    }
    public static void formaX()
    {
        char[][] figura = new char[12][12];
        StringBuilder mostra = new StringBuilder("");
        int i, j;

        for (i = 0; i < figura.length; i++)
        {
            for (j = 0; j < figura.length; j++)
            {
                if (j == i || i + j == 11 || i + 1 == j || i - 1 == j || i + j == 10 || i + j == 12)
                    figura[i][j] = '0';
                else
                    figura[i][j] = '1';
                mostra.append(figura[i][j]);
            }
            mostra.append("\n");
        }
        System.out.println(mostra);
    }
    public static void losango()
    {
        char[][] quadr1 = new char[6][6], quadr2 = new char[6][6], quadr3 = new char[6][6];
        char[][] quadr4 = new char[6][6];
        StringBuilder mostra = new StringBuilder();
        int i, j, k = 0, l = 0, count = 0;

        for (i = 0; i < quadr1.length; i++)
        {
            for (j = 0; j < quadr1.length; j++)
            {
                if (j == i)
                {
                    quadr2[i][j] = '@';
                    quadr4[i][j] = '@';
                    quadr1[i][j] = '*';
                    quadr3[i][j] = '*';
                }
                else if (j + i == 5)
                {
                    quadr1[i][j] = '@';
                    quadr3[i][j] = '@';
                    quadr2[i][j] = '*';
                    quadr4[i][j] = '*';
                }
                else
                {
                    quadr2[i][j] = '*';
                    quadr4[i][j] = '*';
                    quadr1[i][j] = '*';
                    quadr3[i][j] = '*';
                }
            }
        }
        for (i = 0; i < 6; i++)
        {
            for (j = 0; j < 12; j++)
            {
                if (j < 6)
                    mostra.append(quadr1[i][j]);
                else if (j < 12)
                    mostra.append(quadr2[i][j-6]);
            }
            mostra.append("\n");
        }
        for (i = 0; i < 6; i++)
        {
            for (j = 0; j < 12; j++)
            {
                if (j < 6)
                    mostra.append(quadr4[i][j]);
                else if (j < 12)
                    mostra.append(quadr3[i][j-6]);
            }
            mostra.append("\n");
        }
        System.out.println(mostra);
    }
}