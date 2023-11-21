package org.example;

public class MyElevator {
    private final int MAX_FLOOR = 10;
    private final int MIN_FLOOR = 1;
    private boolean isOpened = false;

    private int currentFloor = 1;

    public void open() {
        System.out.println("Try to open door,");
        isOpened = true;
        System.out.println("Door is open now.");
    }

    public void close() {
        System.out.println("Try to close door,");
        isOpened = false;
        System.out.println("Door is close now.");
    }

    public void up() {
        System.out.println("Elevator up...");
        currentFloor++;
        System.out.println("Now"+ currentFloor +".");
    }

    public void down() {
        System.out.println("Elevator down...");
        currentFloor--;
        System.out.println("Now"+ currentFloor +".");
    }






}
