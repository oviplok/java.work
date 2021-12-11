package ex2;

import java.util.LinkedList;

public class LinkedQueue extends AbstractQueue {

    private LinkedList<Object> q;


    public LinkedQueue(){
        q = new LinkedList<>();
        h = t = 0;
    }

    @Override
    public Object dequeue() {
        if(isEmpty()){
            throw new IndexOutOfBoundsException("Queue is empty!");
        }
        return  q.remove(h);
    }

    @Override
    public Object element() {
        if(isEmpty()) {
            throw new IndexOutOfBoundsException("Queue is empty!");
        }
        return  q.get(h);     }

    @Override
    public void enqueue(Object o) {
        q.add(o);
        t++;
    }

    @Override
    public boolean isEmpty() {
        return t == h;
    }

    @Override
    public boolean clear() {
        boolean r = ! isEmpty();
        q.clear();
        h = t = 0;
        return r;
    }
}