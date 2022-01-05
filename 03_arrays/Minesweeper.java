public class Minesweeper {
    
    public static void main(String[] args) {
        
        // grid size
        int m = Integer.parseInt(args[0]);
        int n = Integer.parseInt(args[1]);
        
        // number of mines
        int k = Integer.parseInt(args[2]);

        String[][] mineField = new String[m][n];
        String mine = "*";

        // initialize array
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mineField[i][j] = "";
            }
        }

        // place the mines
        for (int i = 0; i < k; i++) {


            int mineIndex = (int) (Math.random() * m * n);
            if (mineField[mineIndex / n][mineIndex % n].equals("*")) i--; 
            else mineField[mineIndex / n][mineIndex % n] = mine;

        }
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int mineFlag = 0;
                
                // skip asterisk
                if (mineField[i][j].equals("*")) continue;

                // check all 8 directions and make sure it's within bounds
                if (i > 0) {
                    // check up
                    if (mineField[i - 1][j].equals("*")) mineFlag++;
                    
                    // check up diagonals
                    if (j > 0) {
                        // up-left
                        if (mineField[i - 1][j - 1].equals("*")) mineFlag++;    
                    }

                    if (j < n - 1) {
                        // up-right
                        if (mineField[i - 1][j + 1].equals("*")) mineFlag++;
                    }
                }

                // check right
                if (j < n - 1) {
                    if (mineField[i][j + 1].equals("*")) mineFlag++;
                } 
                    
                // check left
                if (j > 0) {
                    if (mineField[i][j - 1].equals("*")) mineFlag++;
                }

                if (i < m - 1) {
                    // check down
                    if (mineField[i + 1][j].equals("*")) mineFlag++;
                    
                    // check down diagonals
                    if (j > 0) {
                        // down-left
                        if (mineField[i + 1][j - 1].equals("*")) mineFlag++;    
                    }
                    if (j < n - 1) {
                        // down-right
                        if (mineField[i + 1][j + 1].equals("*")) mineFlag++;
                    }
                    
                }

                // set the mine flag
                mineField[i][j] = Integer.toString(mineFlag);

            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(mineField[i][j] + "  ");
            }
            System.out.println();
        }

    }
}
