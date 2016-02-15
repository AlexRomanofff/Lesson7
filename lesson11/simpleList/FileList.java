package lesson11.simpleList;

import java.util.Iterator;

public interface FileList<T> {

    void add(T obj);

    void remove(T obj);

    boolean contains(T object);

    int getSize();

    Iterator<T> iterator();
}
