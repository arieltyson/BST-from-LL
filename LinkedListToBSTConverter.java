public class LinkedListToBSTConverter {
    private LinkedListToArrayConverter linkedListToArrayConverter;
    private SortedArrayToBSTConverter sortedArrayToBSTConverter;

    public LinkedListToBSTConverter() {
        linkedListToArrayConverter = new LinkedListToArrayConverter();
        sortedArrayToBSTConverter = new SortedArrayToBSTConverter();
    }

    public TreeNode convert(ListNode head) {
        int[] nums = linkedListToArrayConverter.convert(head);
        return sortedArrayToBSTConverter.convert(nums);
    }
}
