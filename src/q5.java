public class q5{
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
        if (isPrime(29)) {
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }
    }
}