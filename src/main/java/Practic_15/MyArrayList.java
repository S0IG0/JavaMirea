package Practic_15;


import java.util.Arrays;

public class MyArrayList<T> {
    private Object[] array;

    public MyArrayList(T[] array) {
        this.array = array;
    }

    public void add(T data) {
        Object[] newArray = new Object[array.length + 1];
        System.arraycopy(array, 0, newArray, 0, array.length);
        newArray[newArray.length - 1] = data;
        array = newArray.clone();
    }

    public void add(int index, T data) {
        Object[] newArray = new Object[array.length + 1];
        if (index >= 0) System.arraycopy(array, 0, newArray, 0, index);
        newArray[index] = data;

        if (array.length - index >= 0) System.arraycopy(array, index, newArray, index + 1, array.length - index);
        array = newArray.clone();
    }

    public void remove(int index) {
        Object[] newArray = new Object[array.length - 1];
        if (index >= 0) System.arraycopy(array, 0, newArray, 0, index);
        if (array.length - (index + 1) >= 0)
            System.arraycopy(array, index + 1, newArray, index + 1 - 1, array.length - (index + 1));
        array = newArray.clone();
    }

    public Object get(int index){
        return array[index];
    }

    public int getSize(){
        return array.length;
    }

    public Object[] getArray() {
        return array;
    }

    @Override
    public String toString() {
        return "MyArrayList{" +
                "array=" + Arrays.toString(array) +
                '}';
    }
}
