package stack_and_queue;

import java.util.Stack;

public class QueueViaStacks<T> {
    Stack<T> stack1, stack2;

    public QueueViaStacks() {
        this.stack1 = new Stack<T>();
        this.stack2 = new Stack<T>();
    }

    public int size(){
        return stack1.size()+ stack2.size();
    }
    public void add(T value){
        stack1.push(value);
    }
    private void changeStacks(){
        if(stack2.isEmpty()){
            while(!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }
    }
    public T peek(){
        changeStacks();
        return stack2.peek();
    }
    public T remove(){
        changeStacks();
        return stack2.pop();
    }
}
