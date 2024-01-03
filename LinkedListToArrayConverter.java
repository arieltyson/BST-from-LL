import java.util.ArrayList;
import java.util.List;

public class LinkedListToArrayConverter {

    public int[] convert(ListNode head) {

        List<Integer> list = new ArrayList<>();

        while (head != null) {
            list.add(head.value);
            head = head.next;
        }
        return list.stream().mapToInt(i -> i).toArray();
    }
}
