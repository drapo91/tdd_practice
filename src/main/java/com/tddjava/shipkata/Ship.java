package com.tddjava.shipkata;

public class Ship {
    private Location location;
    private Planet planet;

    public Ship(Location location, Planet planet){
        this.location=location;
        this.planet=planet;
    }

    public Location getLocation() {
        return location;
    }

    public Planet getPlanet() {
        return planet;
    }

    public boolean moveForward() {
        return location.forward(planet.getMax());
    }

    public boolean moveBackward() {
        return location.backward(planet.getMax());
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
