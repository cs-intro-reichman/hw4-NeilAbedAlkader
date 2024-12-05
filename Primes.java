public class Primes {
    public static void main(String[] args) {
        System.out.println( "Prime numbers up to " + (args [0] + ":"));
        int bound = Integer.parseInt(args [0]);
        int count = 0;
        int num1 = 2;
        while (num1 <= bound) {
            if (num1 == 2) {
                System.out.println(num1);
                count ++;
            } else {
                int num = num1 -1;
                while (num1 % num != 0) {
                    num --;
                    if (num == 1) {
                        count ++;
                        System.out.println(num1);
                        break;
                    }
                }
            } num1++;
        }
        System.out.println("There are " + count + " primes between 2 and " + bound + " (" + ((count * 100) / bound) + "% are primes)");

    }
}
