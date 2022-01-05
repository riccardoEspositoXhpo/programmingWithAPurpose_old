

public class Transpose {
    
    public static void main(String[] args) {
        
        int[][] array = {
            {1, 2, 3, 4, 5},
            {1, 2, 3, 4, 5},
            {1, 2, 3, 4, 5},
            {1, 2, 3, 4, 5},
            {1, 2, 3, 4, 5}
        };

        // transpose the array
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                
                // you can't swap every value.
                // if you do then you are swapping things twice
                // we only swap on one side of the diagonal
                
                if (j > i) {
                    int temp = array[i][j];
                    array[i][j] = array[j][i];
                    array[j][i] = temp;    
                }

                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }



    }
}
