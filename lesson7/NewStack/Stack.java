package lesson7.NewStack;


import java.util.Arrays;
import java.util.EmptyStackException;

public class Stack {

    public Object [] stackObj;
    private int size;

    public Stack () {
        stackObj = new Object[10];
        size = 0;
    }
    public int size() {
        return size;
    }

    public void push (Object object) {
        if (size!=0 && stackObj[stackObj.length-1] != null  ) {
            Object [] list = Arrays.copyOf(stackObj, stackObj.length+1);
            stackObj = list;
        }
        for (int i = 0; i <= size; i++) {
            if (stackObj[i] == null) {
                stackObj[i] = object;
                break;
            }
        }
        size++;
    }
    public Object pop() {
        if (size==0){
            throw new EmptyStackException();
        } else {
        Object head = stackObj[size-1];
        stackObj[size-1]=null;
        size--;
        return head;
        }
    }
    public Object peek() {
        if (size==0){
            throw new EmptyStackException();
        } else {
        Object head = stackObj[size-1];
        return head;
        }
    }
}
