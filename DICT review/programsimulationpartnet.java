class programsimulationpartnet
{
    public static void main (String [] args)
    {
        int range;
        int tempRange = range;

        for(int row = 0; row < range; row++)
        {
            for(int column = 0; column < range; column++)
            {
                if(column != tempRange)
                {
                    System.out.print("");
                }
                else if(column % 2 == 0)
                {
                    for(int c = 1; c < row; c++)
                    {
                        System.out.print("% ");
                    }
                }
                else
                {
                     for (int d = 1; d < row; d++){
                    System.out.print("*_");
                    }
                }
            }
            System.out.println();
        }
    }
}