import java.util.*;
public class Linklist {
    public static void main(String[] args) {
        Queue<String> ll = new LinkedList<>();
        ll.offer("AAA");
        ll.offer("BBB");
        ll.offer("CCC");
        ll.offer("DDD");
        System.out.println("LinkedList: " + ll);
        System.out.println("Peek: " + ll.peek());
        System.out.println("Poll: " + ll.poll());
        System.out.println("Updated: " + ll);
        System.out.println("Size: " + ll.size());


    }
}