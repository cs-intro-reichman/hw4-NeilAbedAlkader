public class Primes {
    public static void main(String[] args) {
        int n = 7; // Change this value to test different ranges
        printPrimesUpTo(n);
    }

    public static void printPrimesUpTo(int n) {
        int count = 0;
        System.out.println("Prime numbers up to " + n + ":");
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.println(i);
                count++;
            }
        }
        int totalNumbers = n - 1; // Total numbers in the range [2, n]
        double percentage = (count / (double) totalNumbers) * 100;
        System.out.printf("There are %d primes between 2 and %d (%.0f%% are primes)%n", count, n, percentage);
    }

    public static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}

