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
        return location.forward(planet.getMax(), planet.getObstacles());
    }

    public boolean moveBackward() {
        return location.backward(planet.getMax(), planet.getObstacles());
    }

    public void turnLeft() {
        location.turnLeft();
    }

    public void turnRight() {
        location.turnRight();
    }

    public String receiveCommand(String commands) {
        StringBuilder movesStatus = new StringBuilder();
        for (char command : commands.toCharArray()) {
            boolean moveable=true;
            switch (command) {
                case 'f':
                    moveable = moveForward();
                    break;
                case 'b':
                    moveable = moveBackward();
                    break;
                case 'l':
                    turnLeft();
                    break;
                case 'r':
                    turnRight();
                    break;
            }
            if(moveable){
                movesStatus.append("O");
            }else {
                movesStatus.append("X");
            }
        }
        return movesStatus.toString();
    }
}
