package stack;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Iterator;

public class Stack<Item> implements Iterable<Item>{
//    栈顶
    private Node first;
//    元素数量
    private int N;
    private class Node {
        Item item;
        Node next;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public int size() {
        return N;
    }

    /**
     * 向栈顶添加元素
     */
    public void push(Item item) {
        Node oldfirst = first;
        first = new Node();
        first.item = item;
        first.next = oldfirst;
        N++;
    }

    /**
     * 从栈顶删除元素
     * @return
     */
    public Item pop() {
        Item item = first.item;
        first = first.next;
        N--;
        return item;
    }


    public Iterator<Item> iterator() {
        return null;
    }

    public static void main(String[] args) {
        Stack<String> s = new Stack<String>();

        while (!StdIn.isEmpty()) {
            String item = StdIn.readString();

            /**
             * 当输入的不为 - 时,就往栈里push, 否则且不为空时,就从栈顶 删除最近的元素
             */
            if (!item.equals("-")) {
                s.push(item);
                StdOut.println("push" + item.toString());
            } else if (!s.isEmpty()) {
                StdOut.print(s.pop() + " ");
            }
        }

        StdOut.println("(" + s.size() + " left on stack)");

    }
}


