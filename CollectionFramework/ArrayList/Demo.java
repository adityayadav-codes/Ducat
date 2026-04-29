import java.util.ArrayList;
import java.util.List;

public class Demo {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        // add()
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);
        list.add(90);
        list.add(100);
        // System.out.println(list);
        list.add(5, 100);
        // System.out.println(list);

        // add elements of another list
        List<Integer> newList = new ArrayList<>();
        newList.add(300);
        newList.add(500);
        list.addAll(newList);
        System.out.println(list);

        // get()
        // System.out.println(list.get(1));
        // System.out.println(list.getFirst());
        // System.out.println(list.getLast());
        // System.out.println(list.getClass());
        // System.out.println(list);

        // remove
        list.remove(0);
        // System.out.println(list);
        list.removeFirst();
        list.removeLast();
        list.reversed();
        // System.out.println(list);
        
        // set()
        list.set(5, 1000);
        System.out.println(list);
    }
}
