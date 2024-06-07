package stack;

public class StackOfStringUsingLinkedList {
    private Node first = null;
    private class Node{
        private String item;
        private Node next;
    }

    public void push(String item){
        Node oldFirst = first;
        first = new Node();
        first.item = item;
        first.next = oldFirst;
    }
    public String pop(){
        if(first == null){
            return "String is empty!";
        }
        String result = first.item;
        first = first.next;
        return result;
    }
    public boolean isEmpty(){
        return first == null;
    }

    @Override
    public String toString() {
        String out = "";
        Node curr = first;
        while (curr != null){
            if(curr.next != null)
                out+= curr.item + " -> ";
            else
                out+= curr.item;
            curr = curr.next;
        }
        return out;
    }
}
