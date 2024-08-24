import arrayListImpl.MyArrayList;

public class Main {
    public static void main(String[] args) {
        MyArrayList<Integer>  list = new MyArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.remove(2);
//        list.clear();
        System.out.println(list);
    }
}