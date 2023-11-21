package org.example;

public class MyElevatorTest {
    public static void main(String[] args) {

        MyElevator myElevator = new MyElevator();
        myElevator.open();
        myElevator.close();
        myElevator.down();
        myElevator.down();
        myElevator.up();
        myElevator.up();
        myElevator.up();
        myElevator.open();
        myElevator.up();
        myElevator.open();
    }
}