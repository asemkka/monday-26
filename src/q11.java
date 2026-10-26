public class q11 {
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }

    public static int lcm(int a, int b) {
        if (a == 0 || b == 0) {
            return 0;
        }

        return Math.abs((a / gcd(a, b)) * b);
    }

    public static void main(String[] args) {
        System.out.println("LCM = " + lcm(6, 8));
    }
}