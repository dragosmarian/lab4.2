package second;

import first.Task;

import java.util.ArrayList;

public class Queue implements Container {
    ArrayList<Task> list = new ArrayList<Task>();

    @Override
    public void push(Task task) {
        list.add(list.size(),task);
    }

    public Task pop(){
        return list.remove(0);
    }

    public int size(){
        return list.size();
    }

    public boolean isEmpty(){
        return list.isEmpty();
    }

    public void transferFrom(Container container){
        while (!container.isEmpty()){
            this.push(container.pop());
        }
    }
}