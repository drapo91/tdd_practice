package com.tddjava.shipkata;

import org.testng.annotations.*;

import static org.testng.Assert.assertEquals;

@Test
public class ShipSpec {
    private Ship ship;
    private Location location;
    private Planet planet;

    @BeforeMethod
    public void beforeTest(){
        planet = new Planet(new Point(50, 50));
        location = new Location(new Point(21,13), Direction.EAST);
        ship = new Ship(location, planet);
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

    public void whenReceiveCommandFThenForward(){
        Location expectedLocation = location.copy();
        expectedLocation.forward();
        ship.receiveCommand("f");
        assertEquals(ship.getLocation(), expectedLocation);
    }

    public void whenReceiveCommandBThenBackward(){
        Location expectedLocation = location.copy();
        expectedLocation.backward();
        ship.receiveCommand("b");
        assertEquals(ship.getLocation(), expectedLocation);
    }

    public void whenReceiveCommandLThenLeft(){
        Location expectedLocation = location.copy();
        expectedLocation.turnLeft();
        ship.receiveCommand("l");
        assertEquals(ship.getLocation(), expectedLocation);
    }

    public void whenReceiveCommandRThenRight(){
        Location expectedLocation = location.copy();
        expectedLocation.turnRight();
        ship.receiveCommand("r");
        assertEquals(ship.getLocation(), expectedLocation);
    }

    public void whenReceiveCommandsThenAllAreExecuted(){
        Location expectedLocation = location.copy();
        expectedLocation.turnRight();
        expectedLocation.forward();
        ship.receiveCommand("rf");
        assertEquals(ship.getLocation(), expectedLocation);
    }

    public void whenInstantiatedThenPlanetIsStored(){
        assertEquals(ship.getPlanet(), planet);
    }

    public void givenDirectionEAndMaxXWhenReceiveCommandFThenWrap(){
        location.setDirection(Direction.EAST);
        location.getPoint().setX(planet.getMax().getX());
        ship.receiveCommand("f");
        assertEquals(location.getX(), 1);
    }

    public void givenDirectionEAndMinXWhenWhenReceiveCommandBThenWrap(){
        location.setDirection(Direction.EAST);
        location.getPoint().setX(1);
        ship.receiveCommand("b");
        assertEquals(location.getX(), planet.getMax().getX());
    }


}
