package com.tddjava.shipkata;

public class Ship {
    private Location location;

    public Ship(Location location){
        this.location=location;
    }

    public Location getLocation() {
        return location;
    }

    public boolean moveForward() {
        return location.forward();
    }

    public boolean moveBackward() {
        return location.backward();
    }

    public void turnLeft() {
        location.turnLeft();
    }

    public void turnRight() {
        location.turnRight();
    }

    public void receiveCommand(String commands) {
        for (char command : commands.toCharArray()) {
            switch (command) {
                case 'f':
                    location.forward();
                    break;
                case 'b':
                    location.backward();
                    break;
                case 'l':
                    location.turnLeft();
                    break;
                case 'r':
                    location.turnRight();
                    break;
            }
        }
    }
}
