package tamrin1;
import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        Scanner elavator = new Scanner(System.in);
//         double myWeightOnEarth=85.5;
//         System.out.println("my Weight On Earth is :"+myWeightOnEarth);
//        double myWeightOnJupiter= myWeightOnEarth *2.52;
//        System.out.println("my Weight On Jupiter is :" +myWeightOnJupiter);
//        double myWeightOnzohal= myWeightOnEarth *1.06;
//        System.out.println("my WeightOn Zohal is:"+myWeightOnzohal);
//
//         int x ;
//         int y =10;
//        x=y*2+6;
//          System.out.println(x);
//        int studentnumber = 121;
//        studentnumber=studentnumber/10;
//         System.out.println(studentnumber++);
//         System.out.println(studentnumber);
        System.out.print("numberOfPeople: ");
        int numberOfPeople = elavator.nextInt();
       // System.out.println("numberOfPeople is :"+ numberOfPeople );
        double weightOfEachPerson = 75.5;
        double totalWeight = weightOfEachPerson * numberOfPeople;
        double elavatorCapacity = 750;
        if (totalWeight <= elavatorCapacity) {
            System.out.println("the door can be close");
        } else {
            System.out.println("the number of people is more than the elevator capacity and the door can't be close");


        }
    }
}
