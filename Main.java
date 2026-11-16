import java.util.*;
public class Main {
    public static void main(String[] args){
        Queue<Integer> que = new ArrayDeque<>();
        que.offer(100);
        que.offer(200);
        que.offer(300);
        System.out.println("The element in queue "+ que);
        que.poll();
        System.out.println("After del"+ que);
        System.out.println("peek element"+ que.peek());
    }
}