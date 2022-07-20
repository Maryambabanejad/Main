import java.util.Scanner;

public class SwitchWile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean again = true;
        while (again) {
            System.out.println("1:play");
            System.out.println("2:setting");
            System.out.println("3:Exit");
            System.out.println("Enter Your choice");
        switch ('i') {
            case 1:
                System.out.println("play");
                break;
            case 2:
                System.out.println("setting");
                break;
            case 3:
                System.out.println(again=false);
                break;
            default:
                System.out.println("Enter a Valid Number");
                break;
        }

    }
}
    }