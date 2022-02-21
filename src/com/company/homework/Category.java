package com.company.homework;

public abstract class Category implements Element {
    protected String iconDescription;
    protected String name;

    protected Category(String name, String iconDescription) {
        this.name = name;
        this.iconDescription = iconDescription;
    }
    protected Category(String name){
        this.name = name;
    }

    public abstract void open();

    @Override
    public String getType() {
        return "Category";
    }

    @Override
    public void click() {
        open();
    }
}