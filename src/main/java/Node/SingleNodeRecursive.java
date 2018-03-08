//package Node;
//
///**
// * 单链表反转
// */
//public class SingleNodeRecursive {
//
//
//
//    public static Node reverse(Node head) {
//        Node previous = null;
//
//        while (head != null) {
//            Node nextNode = head.next();
//
//            head.setNext(previous);
//            previous = head;
//            head = nextNode;
//
//        }
//
//        return previous;
//    }
//}
