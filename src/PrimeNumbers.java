public class PrimeNumbers {


    public static void main(String[] args) {
        /*for (int num = 0; num < 200; num++) {
            if (isPrime(num)) {
                System.out.println(num);
            }
        }*/

        int b = 4;
        ++b;

        System.out.println(++b);  // --> 6
        System.out.println(b++);  // --> 6
        System.out.println(++b);  // --> 8


    }

    /**
     *
     * @param number is integer
     * @return type is a boolean that ....
     * ALT + CTRL + L
     */
    static boolean isPrime(int number) {
        if (number < 2)
            return false;
        for (int i = 2; i < number; i++)
            if (number % i == 0)
                return false;
        return true;
    }


//    int a = 1;

    /*static boolean isPrime_(int number) {
        if (number < 2)
            return false;
        for (int i = 2; i < number; i++)
            if (number % i == 0)
                return false;
        return true;
    }*/

}
