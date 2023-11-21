package org.example;

public class MyElevator {
    private final int MAX_FLOOR = 10;
    private final int MIN_FLOOR = 1;
    private boolean isOpened = false;

    private int currentFloor = MIN_FLOOR;

    public void open() {
        if (isOpened) {
            System.out.println("The door is opened, can't open again !!");
        } else {
            System.out.println("Try to open door,");
            isOpened = true;
            System.out.println("The door is open now.");
        }
    }

    public void close() {
        if (!isOpened) {
            System.out.println("The door is closed. Can't close again !!");
        } else {
            System.out.println("Try to close door,");
            isOpened = false;
            System.out.println("The door is close now.");
        }
    }

    public void up() {
        if(currentFloor >= MAX_FLOOR) {
            System.out.println("It's " + currentFloor + "F. Can't go up anymore.");
        } else {
            if (isOpened) {
                System.out.println("The door is opened now. Must be closed before go up.");
            } else {
                System.out.println("Elevator up...");
                currentFloor++;
                System.out.println("Now "+ currentFloor +".");
            }
        }
    }

    public void down() {
        if (currentFloor <= MIN_FLOOR) {
            System.out.println("It's " + currentFloor + "F. Can't go down anymore.");
        } else {
            if (isOpened) {
                System.out.println("The door is opened now. Must be closed before go up.");
            } else {
                System.out.println("Elevator down...");
                currentFloor++;
                System.out.println("Now " + currentFloor + ".");
            }
        }
    }

    public void toFloor(int targetFloor) {
        while (currentFloor != targetFloor) {
            if (currentFloor < targetFloor) {
                up();
            } else {
                down();
            }
        }
    }

    }
