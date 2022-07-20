package tamrin2;/*import java.util.Scanner;
public class Tamrin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number:");
        double a = 5;
        double b = 8;
        double c = 10;
        double miyangin;
        miyangin = (a + b + c) / 3;
        System.out.println(miyangin);

    }
}
*/
import java.util.Scanner;
public class Tamrin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number:");
        double a = scanner.nextInt() , b= scanner.nextDouble(), c = scanner.nextDouble();
        int miyangin = (int)(a + b + c) / 3;
        System.out.println(miyangin);
    }
}