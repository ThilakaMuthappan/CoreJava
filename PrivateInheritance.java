
public class PrivateInheritance {
    public static void main(String[] args) {
        Parent p = new Child();
        p.start();
    }
}

Class Child extends Parent {
    public void shout() { System.out.println("Child"); }
}
