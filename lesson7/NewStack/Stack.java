package lesson7.NewStack;


import java.util.ArrayList;
import java.util.EmptyStackException;

public class Stack {


    private ArrayList<Object> arrayList = new ArrayList<Object>();
    private int size;

    public Stack () {

        size = 0;
    }
    public int size() {
        return size;
    }

    public void push (Object object) {

        arrayList.add(object);
        size++;
    }
    public Object pop() {
        if (size==0){
            throw new EmptyStackException();
        } else {
        Object head = arrayList.get(size-1);
        arrayList.remove(size-1);
        size--;
        return head;
        }
    }
    public Object peek() {
        if (size==0){
            throw new EmptyStackException();
        } else {
        Object head = arrayList.get(size-1);
        return head;
        }
    }
}
