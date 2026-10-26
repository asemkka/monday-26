public class q6 {
    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }

        for (int i = 2; i <= n / i; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int a = 10, b = 30;
        int count = 0;

        for (int i = a; i <= b; i++) {
            if (isPrime(i)) {
                count++;
            }
        }

        System.out.println("Prime Count = " + count);
    }
}