package com.company.homework;

public class Plate extends Category implements Element {
    public Plate (String name, String iconDescription ) {
        super(name,iconDescription);
    }

    @Override
    public void open() {
        System.out.println("Open category page "+name+ " Icon description:" + iconDescription);


}
}