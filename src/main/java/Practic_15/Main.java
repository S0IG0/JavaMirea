package Practic_15;

public class Main {
    public static void main(String[] args) {
        MyArrayList<String> myArrayList = new MyArrayList<>(new String[]{
           "Hello",
           "World",
           "Education",
        });
        myArrayList.add("Footer");
        myArrayList.add(2, "Head");
        myArrayList.remove(4);

        for (int i = 0; i < myArrayList.getSize(); i++) {
            System.out.println(myArrayList.get(i));
        }

        for(Object obj: myArrayList.getArray()){
            System.out.println(obj);
        }

        System.out.println(myArrayList);

    }
}
