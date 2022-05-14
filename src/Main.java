public class Main {
    public static void main(String[] args) {

        //# int i = "initialization"(how it should start)
        // i<4 = "terminator / condition"(how it should end),
        // i++ = "increment"(how it should do the work)

        for (int i = 0; i < 4; i++) {
            System.out.println(i + " loops \n");
        }

        for (int i = 2; i < 9; i++) {
            System.out.println(" the interest: " + String.format("%.1f", calculateInterest(10000, i)));
        }

        System.out.println("\n the reverse order \n");
        //# this is in reverse
        for (int i = 8; i > 1; i--) {
            System.out.println(" the interest: " + String.format("%.1f", calculateInterest(10000, i)));
        }


        int count = 0;
        for (int i = 10; i < 50; i++) {
            if (isPrime(i)) {
                count++;
                System.out.println("prime no1 : " + isPrime(i) + " at " + i);

                if (count == 7) {
                    System.out.println("\n stop here after this amount " + count);
                    break;
                }
            }

        }

        int count1 = 0;
        int sum = 0;
        for (int i = 1; i <= 1000; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                count1++;
                sum += i;
                System.out.println("\n this number met the condition: " + i);
            }
            if (count1 == 5) {
                break;
            }

        }

        System.out.println(" the total is " + sum);
    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }


    public static boolean isPrime(int n) {

        if (n == 1) {
            return false;
        }

        for (int i = 2; i <= (long) Math.sqrt(n); i++) {
            if (n % i == 0) {
                System.out.println("testing loop sequence " + i);
                return false;
            }
        }
        return true;
    }



}