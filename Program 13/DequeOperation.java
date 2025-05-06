import java.util.*;
public class DequeOperation
{
public static void main(String[]args)
{
Deque<String> deque=new ArrayDeque<>();
deque.add("Apple");
deque.add("Banana");
deque.add("Mango");
deque.add("Blueberry");
System.out.println("Initial Deque:" + deque);
deque.remove();
System.out.println("After removing first element using remove():" + deque);
deque.poll();
System.out.println("After removing second element using poll():" + deque);
deque.pollLast();
System.out.println("After removing last element using pollLast():" + deque);
}
}

