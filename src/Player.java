public class Player {
    private String name;
    private int age;
    public void setAge(int a){
        age = a;
    }
public void setName(String n ){
        name = n;
}
    public void shoot() {
        System.out.println("shoot");
    }

    public void run() {
        System.out.println("run");
    }

    public static void main(String[] args) {
        Player p = new Player();
        p.setName("Ali Daei");
        p.setAge(30);
                p.shoot();
        p.run();

    }
}/*

public class Player{
   private String name;
   private int age;

    public void setAge(int a) {
        age = a;
    }

    public void setName(String n){
        name = n;
    }

    public void shoot(){
        System.out.println("shoot!");
    }

    public void run(){
        System.out.println("run!");
    }

    public static void main(String[] args) {

    }
*/