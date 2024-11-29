public class Primes {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        boolean[] isPrime = new boolean[n + 1];
        int result = 0;
        int count = 0;

        for (int i = 2; i <= n; i++) {
            isPrime[i] = true;
        }

        for (int i = 2; i * i <= n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                System.out.println(i);
                result = i;
                count += 1;
            }
        }
        System.out.println("There are "+ count +" Prime numbers between 2 and " + result + ":");
    }
}

