package stack;

import java.util.Arrays;

public class StackOfStringUsingArray {
    private String[] stack;
    int size=0;
    public StackOfStringUsingArray(){
        stack = new String[size];
    }
    public void push(String x){
        String[] newStack = new String[++size];
        newStack[0] = x;
        for(int i=0;i<stack.length;i++){
            newStack[i+1] = stack[i];
        }
        stack = newStack;
    }
    public String pop(){
        String[] newStack = new String[--size];
        String result = stack[0];
        for(int i=1;i<stack.length;i++){
            newStack[i-1] = stack[i];
        }
        stack = newStack;
        return result;
    }
    public boolean isEmpty(){
        return size > 0;
    }
    public int size(){
        return size;
    }

    @Override
    public String toString() {
        return "Stack{" +
                "stack=" + Arrays.toString(stack) +
                ", size=" + size +
                '}';
    }
}
