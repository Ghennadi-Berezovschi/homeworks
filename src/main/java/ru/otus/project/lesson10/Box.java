package ru.otus.project.lesson10;

public class Box {
    public static void main(String[] args) {
        Box box1 = new Box(30, "red");
        box1.putItem("Ball");
        box1.putItem("Key");
        box1.putItem("Phone");
        box1.printInfoOfBox();
        box1.removeItem("Ball");
        box1.printInfoOfBox();
    }

    private int volumeOfBox;
    private String color;
    private String[] content;
    private boolean isOpen = true;

    public Box(int volume, String color) {
        this.volumeOfBox = volume;
        this.color = color;
        this.content = new String[5];
    }

    public void setColorOfBox(String color) {
        this.color = color;
    }

    public void printInfoOfBox() {
        System.out.println("The volume of the box - " + volumeOfBox);
        System.out.println("Color of box - " + color);
        for (int i = 0; i < content.length; i++) {
            if(content[i] != null){
                System.out.println("Box contents: " + content[i] );
            }

        }

    }
    public void removeItem(String item){
        if (isOpen) {
            for (int i = 0; i < content.length; i++) {
                if (content[i] != null && content[i].equals(item)) {
                    content[i] = null;
                    System.out.println(item + " has been removed from the box.");
                    return;
                }
            }
            System.out.println(item + " is not in the box.");
        } else {
            System.out.println("Box is closed. Cannot remove item.");
        }
    }

    public void putItem(String item) {
        if (isOpen) {
            for (int i = 0; i < content.length; i++) {
                if (content[i] == null) {
                    content[i] = item;
                    System.out.println(item + " is placed in the box.");
                    return;
                }
            }
            System.out.println("Box is full.");
        } else {
            System.out.println("Box is closed. Cannot put item.");
        }
    }
}
