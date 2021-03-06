package utils;

import java.util.Stack;
import static org.assertj.core.api.Assertions.*;

public class SizedStack<T> extends Stack<T> {
    private int maxSize = 5;

    public SizedStack(int size) {
        super();
        this.maxSize = size;
    }

    public SizedStack(){
        super();
    }


    @Override
    public T push(T object) {
        //If the stack is too big, remove elements until it has the right size.
        while (this.size() >= maxSize) {
            this.remove(0);
        }
        return super.push(object);
    }

    public static void main(String[] args) {
        SizedStack stack = new SizedStack(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        System.out.println(stack.toString());

        assertThat(stack).containsOnly(2, 3, 4, 5, 6);

        System.out.println(stack.size());
    }
}