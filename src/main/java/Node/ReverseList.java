package Node;

public class ReverseList<Item> {

    private class ListNode {
        Item item;
        ListNode next;
    }

    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }
        return prev;
    }

    public static void main(String[] args) {
        ReverseList reverseList = new ReverseList();

    }



}
