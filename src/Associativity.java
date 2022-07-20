public class Associativity {
    public static void main(String[] args) {
        int b;
        b = 4;
        b++;
        int a;
        a = 12;
        a += 2;
        b = a * b;
        System.out.println(b);
    }
}
