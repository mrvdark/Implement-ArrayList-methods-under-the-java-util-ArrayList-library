
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        elements = new Object[capacity];
    }

    private void ensureCapa() { //nếu không khai báo ensureCapa, khi nhập quá capacity 10 sẽ lỗi
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    public void add(E e) {
        if (size == elements.length) {
            ensureCapa();
        }
        elements[size++] = e;
    }

    public void add(int index, E e) {
        if (size == elements.length) {
            ensureCapa();
        }
        if (index > size) {
            elements[size++] = e;
        } else {
            elements[size++] = elements[size];
            for (int i = size + 1; i > index; i--) {
                elements[i] = elements[i - 1];
            }
            elements[index] = e;
        }
    }

    public static List<MyList> cloneList(List<MyList> myLists ) { // clone Mylist
        List<MyList> cloneList = new ArrayList<MyList>(myLists.size());
        for (MyList myList : cloneList){
            cloneList.add(new MyList());
        }
        return cloneList;
    }

    public void remove(int index) {
        for (int i = index; i < size; i++) {
            elements[i] = elements[i + 1];
        }
        size--;
    }

    public int size() {
        return size;
    }

    public boolean contain(E e) {
        for (int i = 0; i < size; i++) {
            if (elements[i] == e) return true;
        }
        return false;
    }

    public String indexOf(E e) {
        for (int i = 0; i < size; i++) {
            if (elements[i] == e) return ("the index of " +e + " is: " +i );
        }
        return ("not found");
    }

    public E get(int i) {
        if (i >= size || i < 0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
        }
        return (E) elements[i];
    }

    public void clear() {
        while (size != 0) {
            remove(size);
        }
    }

    public void output() {
        for (int i = 0; i < size; i++) {
            System.out.println("element " + i + ": " + elements[i]);
        }
    }
}