public class M {
    public static void main(String[] args) {
        int[][][] a = {
            {
                {1, 2, 3},
                {4, 5, 6}
            },
            {
                {7, 8, 9},
                {10, 11, 12}
            }
        };

        int[][][] b = {
            {
                {1, 1, 1},
                {1, 1, 1}
            },
            {
                {2, 2, 2},
                {2, 2, 2}
            }
        };

        int[][][] sum = new int[2][2][3];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 3; k++) {
                    sum[i][j][k] = a[i][j][k] + b[i][j][k];
                }
            }
        }

        for (int i = 0; i < 2; i++) {
            System.out.println("Block " + (i + 1) + ":");
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 3; k++) {
                    System.out.print(sum[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
