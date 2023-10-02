package com.designpatterns.creational.prototype;

public abstract class Shape implements Cloneable {
    private int id;
    protected String type;

    public abstract String getType();

    public abstract void draw();

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public Object clone() {
        Object clone = null;

        try {
            clone = super.clone();

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return clone;
    }
}
