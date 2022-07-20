package tamrin2;
import java.util.Scanner;
public class Tamrin4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int miyangin;
        miyangin = (a + b + c) / 3;
        System.out.println(miyangin);
    }
}

