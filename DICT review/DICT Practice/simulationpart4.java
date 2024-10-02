
class simulationpart4
{
    public static void main(String []args)
    {
      int a;
      int b;

      a = 1;
      b = 1;

      while (a < 3) {
        while (b < 3) {
            System.out.print( [a]" , " [b] );
            b += 1;
        }
        a += 1;
      }

    }
}