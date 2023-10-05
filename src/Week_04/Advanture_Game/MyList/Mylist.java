package Week_04.Advanture_Game.MyList;

import java.util.Arrays;

public class Mylist<T> {
    private Object[] arr;
    private int size;
    private T[] subData;

    public Mylist() {
        this.arr = new Object[10];
        this.size = 0;

    }

    public Mylist(int capacity) {
        if (capacity < 0) {
            System.out.println("Index out of boundaries!");
        }
        this.arr = new Object[capacity];
        this.size = 0;
    }

    public int size() {
        return this.size;
    }

    public int getCapacity() {
        return arr.length;
    }

    public void add(T value) {
        if (size == arr.length) {
            int newCapacity = getCapacity() * 2;
            Object[] newArr = new Object[newCapacity];
            System.arraycopy(arr, 0, newArr, 0, size);
            arr = newArr;
        }
        arr[size] = value;
        size++;
    }

    public T get(int index) {
        if (index < 0 || index > size) {
            return null;
        } else {
            return (T) arr[index];
        }
    }

    public T remove(int index) {
        if (index < 0 || index > size) {
            System.out.println("Index out of boundaries !");
            return null;
        }

        T removedElement = (T) arr[index];
        System.arraycopy(arr, index + 1, arr, index, size - index - 1);
        arr[--size] = null;
        return removedElement;
    }

    public T set(int index, T value) {
        if (index < 0 || index > size) {
            System.out.println("Index out of boundaries !");
            return null;
        }
        arr[index] = value;
        return value;
    }

    public String toString() {
        return Arrays.toString(Arrays.copyOf(arr, size));
    }

    public int indexOf(T data) {
        for (int i = 0; i < size; i++) {
            if (arr[i] == data) {
                return i;
            }
        }
        return -1;
    }

    public int lastIndexOf(T data) {
        for (int i = size - 1; i >= 0; i--) {
            if (arr[i] == data) {
                return i;
            }
        }
        return -1;
    }

    public boolean isEmpty() {
        if (size == 0) {
            System.out.println("List is empty!");
        } else {
            System.out.println("List is filled");
        }
        return true;
    }

    public T[] toArray() {
        return (T[]) Arrays.copyOf(arr, size);
    }

    public void clear() {
        for (int i = 0; i < size; i++) {
            arr[i] = null;
            size = 0;
        }
    }

    public Mylist<T> sublist(int start, int finish) {
        if (start < 0 || finish >= size || start > finish) {
            System.out.println("Index out of boundaries");
        }
        Mylist<T> sublist = new Mylist<>(finish - start + 1);
        for (int i = start; i <= finish; i++) {
            sublist.add((T) arr[i]);
        }
        return sublist;

    }

    public boolean contains(T data) {
        return indexOf(data) != -1;
    }


}
