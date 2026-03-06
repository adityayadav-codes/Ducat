interface My {
    static void show() {
        System.out.println("show interface from My");
    }
}
public class Child implements My {
    public static void main (String [] args) {
        My.show();
    }
}