/*public class ForLoop {
    public static void main(String[] args) {
        int number;
        for (number = 1; number <= 10; number++) {
            System.out.println("My Number Is:" + number);
        }
    }
}
*/
public class ForLoop {
    public static void main(String[] args) {
        int number;
        for (number = 1; number <= 10; number++) {
            if (number == 4) continue;
            double division = number / 2;
            System.out.println("My Mumber Is:" + number);
        }
    }
}


