package lesson11.simpleList;

import java.util.Iterator;

public interface FileList {

    void add(Object obj);

    void remove(Object obj);

    int getSize();

    Iterator<Object> iterator();
}
