package com.codedifferently.assessment01.part03;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class MyStack<T>{

    public ArrayList<T> list = new ArrayList<>();

    public boolean isEmpty() {
        if(list.size() == 0){
            return true;
        }
        return false;
    }

    public void push(T i) {
        list.add(i);
    }

    public T pop() throws EmptyStackException {
        if(list.isEmpty()){
            throw new EmptyStackException();
        }
        T tempVar = list.get(list.size()-1);
        list.remove(list.size()-1);
        return tempVar;
    }

    public T peek() {
        if(!list.isEmpty()){
            return list.get(list.size() - 1);
        }
        return null;
    }

    public Integer size(){
        return list.size();
    }
}
