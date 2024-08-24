package arrayListImpl;

public class MyArrayList<AnyType> {
    private static final int DEFAULT_CAPACITY = 10;
    private AnyType[] items;
    private int theSize;
    public MyArrayList() {
        clear();
    }
    public void clear(){
        theSize = 0;
        ensureCapacity(DEFAULT_CAPACITY);
    }
    public int size(){
        return theSize;
    }
    public void trimToSize(){
        ensureCapacity(theSize);
    }
    public boolean isEmpty(){
        return size() == 0;
    }
    public AnyType get(int index){
        if(index < 0 || index >= size())
            throw new IndexOutOfBoundsException();
        return items[index];
    }
    public AnyType set(int index, AnyType element){
        if(index < 0 || index >= size())
            throw new IndexOutOfBoundsException();
        AnyType old = items[index];
        items[index] = element;
        return old;
    }
    public boolean add(AnyType element){
        add(size(), element);
        return true;
    }
    public void add(int index, AnyType element){
        if(items.length == size()){
            ensureCapacity(size() * 2 + 1);
        }
        for(int i=theSize;i>index;i--){
            items[i] = items[i-1];
        }
        items[index] = element;
        theSize++;
    }
    public AnyType remove(int index){
        if(index < 0 || index >= size()){
            throw new IndexOutOfBoundsException();
        }
        AnyType old = items[index];
        for(int i = index;i<size()-1;i++){
            items[i] = items[i+1];
        }
        theSize--;
        return old;
    }
    public void ensureCapacity(int newCapacity) {
        if(newCapacity < size()){
            return;
        }
        AnyType[] oldItems = items;
        items = (AnyType[]) new Object[newCapacity];
        for(int i=0;i<size();i++){
            items[i] = oldItems[i];
        }
    }

    @Override
    public String toString() {
        if (size()==0){
            return "[]";
        }
        StringBuilder output = new StringBuilder("[");
        for(int i=0;i<size()-1;i++){
            output.append(items[i]+", ");
        }
        output.append(items[size()-1]+"]");
        return output.toString();
    }
}
