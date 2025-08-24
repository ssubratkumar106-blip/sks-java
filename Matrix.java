public class Arr2 {
    public static void main(String[] args) {
        int[][] a = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                System.out.print(a[i][j] + " "); // Use print instead of println to keep row format
            }
            System.out.println(); // Move to next line after each row
        }
    }
}
