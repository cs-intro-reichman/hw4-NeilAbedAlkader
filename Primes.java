public class Primes {
    public static void main(String[] args) {
        int n = 7;
        boolean[] isPrime = new boolean[n + 1];
        int[] arr1 = new int[n];
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
        System.out.println("Prime numbers up to " + n + ":");
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                arr1[i-2]=i;
                result = i;
                count += 1;
            }
        }
        System.out.println("Prime numbers up to " + result + ":");
        for (int i = 2; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
        System.out.println("There are "+ count +" Prime numbers between 2 and " + result + ":");
    }
}

