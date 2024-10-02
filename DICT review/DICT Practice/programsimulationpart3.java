class programsimulationpart3{

    public static void main(String[] args){


     
        int[] storage = {500, 3, 23, 4, 21, 100, 400 };
        int temp = 0;

        for(int x = 0; x <= storage.length; x++)
        {
            for(int y = 0; x < storage.length-1; y++)
            {
                if(storage[y] > storage[y+1])
                {
                    temp = storage[y];
                    storage[y] = storage [y+1];
                    storage [y+1] = temp;
                }
            }
        }
            for (int z : storage)
            {
                System.out.println(z);
            }        
        }
    }
