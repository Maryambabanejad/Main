package tamrin1;

import java.util.Scanner;

public class CharSwitch {
    public static void main(String[] args) {
        System.out.println("Please choose which type of mail would you like ");
        Scanner typeSelection = new Scanner(System.in);
        char typeChosen  = typeSelection.next().charAt(0);

    }
}
