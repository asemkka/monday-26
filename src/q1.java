public class q1 {
    public static void printStrip(int n, char symbol) {
        for (int i = 0; i < n; i++) {
            System.out.print(symbol);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        printStrip(7, '#');
    }
}