package linkedList;

import java.util.Iterator;

/**
 * Created by Алекс on 24.11.2015.
 */
public class SimpleLinkedList implements Iterable<Object>{
    Node root;
    int size;

    public SimpleLinkedList () {
     size = 0;

    }
    private class Node  {
        Object obj;
        Node ref;
    }

    @Override
    public Iterator<Object> iterator() {
        return new SLLIterator();
    }

    class SLLIterator implements Iterator<Object> {
        private Node n;
        private Node prev;

        @Override
        public void remove() {
            if (!hasNext() && prev==null) {
                n=null;
                root=null;
            }else if (!hasNext() && prev != null) {
                prev.ref=null;
                n=null;
            }else if (hasNext() && prev !=null) {
                prev.ref = n.ref;
                n = n.ref;
            } else {
                root = n.ref;
                n = root;
            }
            size--;

        }

        @Override
        public boolean hasNext() {
            return (n == null && root != null) || (n != null && n.ref != null);
        }

        @Override
        public Object next() {
            if (n == null) {
                n = root;
                return n.obj;
            }

            if (hasNext()) {
                prev = n;
                n = n.ref;
                return n.obj;
            }
            throw new IllegalStateException("List has not elements");
        }

    }


    public int getSize() {
        return size;
    }

    public void addFirst(Object obj) {
        Node node = new Node();
        node.obj = obj;
        if (root != null) {
        node.ref = root; }

        root = node;
        size++;
    }
    public void addLast (Object obj) {
        Node n = new Node();
        n.obj = obj;

        if (root == null) {
            root = n;
        } else {
            Node last = root;
            Node cp = root;
            while (cp!=null) {
                last = cp;
                cp = cp.ref;
            }
            last.ref = n;
        }size++;
    }

    public void addAfter(Object obj1, Object prev) {


        if (getSize() > 1) {
            Node current = root;

            for (int i = 0; i < this.size; i++) {
                if (prev.equals(current.obj)) {
                    if (current.ref == null) {
                        System.out.println("Our element at last position");
                        break;
                    } else {
                        Node n = new Node();
                        n.obj = obj1;
                        n.ref = current.ref;
                        current.ref = n;
                        break;
                    }
                }
                current = current.ref;
                if (current == null) {
                    throw new IllegalStateException("No this element at list");
                }
            }
            size++;
        } else {
            System.out.println("List has too little elements");
        }
    }

    public void printList () {
        Node current = root;
        for (int i = 0; i < this.size; i++) {
            if (current!=null) {
                System.out.println(current.obj );
                current = current.ref;
            }
        }
    }
}
