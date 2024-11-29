import java.util.ArrayList;

public class Primes {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        boolean[] isPrime = new boolean[n + 1];
        ArrayList<Integer> primes = new ArrayList<>();
        int count = 0;

        // Initialize isPrime array
        for (int i = 2; i <= n; i++) {
            isPrime[i] = true;
        }

        // Sieve of Eratosthenes to mark non-prime numbers
        for (int i = 2; i * i <= n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        // Collect primes and count them
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                primes.add(i);
                count++;
            }
        }

        // Print prime numbers
        System.out.println("Prime numbers up to " + n + ":");
        for (int prime : primes) {
            System.out.println(prime);
        }

        // Correctly calculate total numbers in range [2, n]
        int totalNumbers = n - 1; // Total numbers between 2 and n (inclusive)
        double percentage = (count / (double) totalNumbers) * 100;

        // Print count and percentage
        System.out.printf("There are %d primes between 2 and %d (%.0f%% are primes)%n", count, n, percentage);
    }
}