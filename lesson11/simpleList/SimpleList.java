package lesson11.simpleList;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SimpleList implements FileList,Serializable, Iterable<Object>{
    List<Object> list;
    File file;

    public SimpleList(){
        file = new File("Simple_List");
        list = fileToList();
    }

    @Override
    public void add(Object obj) {

        list.add(obj);
        try {
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            for (Object o : list) {
                oos.writeObject(o);
            }
            oos.flush();
            oos.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public boolean contains(Object object) {
        if (list.contains(object)) {
            return true;
        } return false;
    }

    public void remove(Object obj) {
        if (contains(obj)) {
            list.remove(obj);
            try {
                FileOutputStream fos = new FileOutputStream(file);
                ObjectOutputStream oos = new ObjectOutputStream(fos);

                for (Object o : list) {
                    oos.writeObject(o);

                }
                oos.flush();
                oos.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        } else {
            System.out.println("List hasn't this object");
        }
    }

    @Override
    public int getSize() {
        return fileToList().size();

    }

    public List<Object> fileToList() {
        List<Object> myList = new ArrayList<>();
        ObjectInputStream ois = null;
        BufferedInputStream bis = null;
        try {
              if (file.exists()) {
            bis = new BufferedInputStream(new FileInputStream(file));
            ois = new ObjectInputStream(bis);
            while (bis.available() > 0) {

                myList.add(ois.readObject());
            }

              }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            try {
                bis.close();
                ois.close();}
            catch (Exception ex1) {
                ex1.printStackTrace();
            }
        }
        return myList;
    }

    @Override
    public Iterator<Object> iterator() {
        return new FileListIterator();
    }

    class FileListIterator implements Iterator<Object> {
        private int pos;

        @Override
        public boolean hasNext() {
            return (pos < list.size());
        }

        @Override
        public Object next() {
            if (hasNext()) {
                pos++;
                return list.get(pos-1);
            }
            throw new IllegalStateException("File has not elements");
        }
    }
}

