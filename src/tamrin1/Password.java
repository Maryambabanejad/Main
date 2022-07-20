/*package tamrin1;
import java.util.Scanner;
public class Password {
    public static void main(String[] args) {
        Scanner passwordInput = new Scanner(System.in);
        System.out.println("please Enter your Password :");
        int password = 2714287;
        if (passwordInput.hasNextInt() && passwordInput.nextInt() == password) {
            System.out.println("thanks your entere is corect");
        } else {
            System.out.println("sorry your Enter is not corect");
        }
        passwordInput.close();

    }
}*/
import java.util.Scanner;
public class Password {
    public static void main(String[] args) {
      Scanner passwordInput = new Scanner(System.in);
      System.out.println("Please Enter your Password:");
      int password =13570230;
        if (passwordInput.hasNextInt() && passwordInput.nextInt() == password ) {
           System.out.println("your password is right format");
        } else {
            System.out.println("password isnot right format");
        }
        passwordInput.close();
    }

}


