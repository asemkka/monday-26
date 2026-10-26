public class q4 {
    public static void printMatrix(int n, int m) {
        int k = 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(k + " ");
                k++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printMatrix(2, 3);
    }
}