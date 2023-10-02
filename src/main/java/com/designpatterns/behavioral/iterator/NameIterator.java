package com.designpatterns.behavioral.iterator;

public class NameIterator implements Iterator{
    int index;
    String[] names;

    public NameIterator(String[] names) {
        this.names = names;
    }

    @Override
    public boolean hasNext() {
        return index < names.length;
    }

    @Override
    public Object next() {
        if(this.hasNext()){
            return names[index++];
        }
        return null;
    }
}
