package Lista4;

import java.util.Arrays;

public class Ordem
{
    public static void main(String[] args)
    {
        int[] organiza = {5,9,2,6,12,2};

        Arrays.sort(organiza);
        for (int i = 0; i < organiza.length; i++)
        {
            System.out.print(organiza[i] + " ");
        }
    }
}