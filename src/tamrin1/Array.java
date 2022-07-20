package tamrin1;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
//        int []number =new int[4];
//        number [0]= 91270687;
//        number [1]= 91237280;
//        number [2]= 91251200;
//        number [3]= 91232125;
//        String [] name = new String [4];
//        name [0]= "MarYam";
//        name [1]= "Morteza";
//        name [2]= "Malihe";
//        name [3]= "HamidReza";
//        System.out.println("My Frist friend is name " +  name[0]  +  " and  her phone  number is " + number[0]);
        //String[]items = {"Bread","cheese","Butter","tea","onion","Coffe","Yogurt Drink","Mineral Water","Potato","Tomato","Moka"};
        // System.out.println(items.length);
        //int[][] row = {{10, 20, 30},{100, 200, 300}};
        // System.out.println(row[0][2]);
        String[] actorName = new String[6];
        actorName[0] = "zareei Merila";
        actorName[1] = "Hoseeini shahab";
        actorName[2] = "Sare Bayat";
        actorName[3] = "Moadi Peyman";
        actorName[4] = "Hatami Leila";
        actorName[5] = "Farhadi Sarina";
        Arrays.sort (actorName);

//        for (int index = 0; index < actorName.length; index++) {
//            System.out.println(actorName  + " : " + actorName[index]);
//        }

        for (String act : actorName) {
            System.out.println(act);
        }

    }
}
