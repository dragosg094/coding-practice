package stack_and_queue;

import java.util.EmptyStackException;

public class MyStack<T> {
    private static class StackNode<T> {
        private T data;
        private StackNode<T> next;

        public StackNode(T data) {
            this.data = data;
        }
    }

    private StackNode top;

    public T pop() {
        if (top == null) throw new EmptyStackException();
        T item = (T) top.data;
        top = top.next;
        return item;
    }

    public void push(T item) {
        StackNode<T> t = new StackNode<>(item);
        t.next = top;
        top = t;
    }

    public T peek() {
        if (top == null) throw new EmptyStackException();
        return (T) top.data;
    }

    public boolean isEmpty() {
        return top == null;
    }
}
