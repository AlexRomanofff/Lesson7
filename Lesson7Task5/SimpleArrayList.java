package Lesson7Task5;

import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class SimpleArrayList implements SimpleList <Object>, Iterable<Object> {

    public Object [] list;
    private int size;

    public SimpleArrayList () {
        list = new Object[10];
        size = 0;
    }
    @Override
    public void add(Object object) {

        if (size!=0 && list[list.length-1] != null  ) {
            Object [] list1 = Arrays.copyOf(list, list.length+1);
            list= list1;
        }
        for (int i = 0; i <= size(); i++) {
            if (list[i] == null) {
                list[i] = object;
                break;
            }
        }
        size++;
    }

    @Override
    public boolean contains(Object object) {

        if (object==null) {
            for (int i = 0; i < size; i++) {
                if (list[i]==null) {
                    return true;
                }
            }
        } else {

            for (int i = 0; i < size; i++) {
                if (list[i] != null) {
                    if (list[i].equals(object)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override
    public void remove(Object object) {
        if (contains(object)) {
            for (int i = 0; i < size; i++) {
                if (list[i].equals(object)) {
                    list[i] = null;
                    System.arraycopy(list, i+1, list, i , list.length - i - 1);
                    list[list.length-1]=null;
                    size--;
                    break;
                }
            }
        } else {
            System.err.println("Object not found");
        }
    }


    @Override
    public int size() {
        return size;
    }
    @Override
    public Iterator<Object> iterator() {
        return new SALIterator();
    }

    private class SALIterator implements Iterator<Object> {
        int cursor;

        @Override
        public Object next() {
            if (hasNext()) {
                cursor++;
                return list[cursor-1];
            }
            else {
                throw new NoSuchElementException();
            }
        }

        @Override
        public boolean hasNext() {
            return (cursor<size);
        }

        @Override
        public void remove() {
            if(hasNext()) {
            list[cursor-1]=null;
            System.arraycopy(list, cursor, list, cursor-1 , list.length - cursor - 2);
            size--;
            } else {
                throw new NoSuchElementException();
            }
        }
    }
}
