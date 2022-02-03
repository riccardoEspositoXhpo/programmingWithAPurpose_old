public class Duplicates {
    
    public static void main(String[] args) {
        
        boolean[] numbers = new boolean[10];

        while (!StdIn.isEmpty()) {

            int x = StdIn.readInt();

            numbers[x] = true;
        }

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] == true) System.out.print(i + " ");
        }

    }
}
