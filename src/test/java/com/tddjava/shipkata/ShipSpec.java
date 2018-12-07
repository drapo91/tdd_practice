package com.tddjava.shipkata;

import org.testng.annotations.*;

import static org.testng.Assert.assertEquals;

@Test
public class ShipSpec {
    private Ship ship;
    private Location location;

    @BeforeMethod
    public void beforeTest(){
        location = new Location(new Point(21,13), Direction.EAST);
        ship = new Ship(location);
    }

    public void whenInstantiatedThenLocationIsSet(){
        assertEquals(ship.getLocation(), location);
    }

    public void whenMoveForwardThenForward(){
        Location expectedLocation = location.copy();
        expectedLocation.forward();
        ship.moveForward();
        assertEquals(ship.getLocation(), expectedLocation);
    }

    public void whenMoveBackwardThenBackward(){
        Location expectedLocation = location.copy();
        expectedLocation.backward();
        ship.moveBackward();
        assertEquals(ship.getLocation(), expectedLocation);
    }

    public void whenTurnLeftThenLeft(){
        Location expectedLocation = location.copy();
        expectedLocation.turnLeft();
        ship.turnLeft();
        assertEquals(ship.getLocation(), expectedLocation);
    }

    public void whenTurnRightThenRight(){
        Location expectedLocation = location.copy();
        expectedLocation.turnRight();
        ship.turnRight();
        assertEquals(ship.getLocation(), expectedLocation);
    }
}
