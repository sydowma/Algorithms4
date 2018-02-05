package queue;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Iterator;

public class Queue<Item> implements Iterable<Item>{

//    指向最早添加的结点的链接
    private Node first;
//    指向最近添加的结点的链接
    private Node last;
//    队列中的元素数量
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

    public void enqueue(Item item) {
        Node oldlast = last;
        last = new Node();
        last.item = item;
        last.next = null;
        if (isEmpty()) {
            first = last;
        } else {
            oldlast.next = last;
        }

        N++;
    }

    public Item dequeue() {
        Item item = first.item;
        first = first.next;
        if (isEmpty()) {
            last = null;
        }

        N--;
        return item;
    }

    public Iterator<Item> iterator() {
        return null;
    }

    public static void main(String[] args) {
        Queue<String> q = new Queue<String>();

        while (!StdIn.isEmpty()) {
            String item = StdIn.readString();
            if (!item.equals("-")) {
                q.enqueue(item);

                StdOut.println(item.toString());

            } else if (!q.isEmpty()) {
                StdOut.print(q.dequeue() + " ");
            }
        }

        StdOut.println("(" + q.size() + " left on queue");
        StdOut.println("q" + q.toString());
    }


}
