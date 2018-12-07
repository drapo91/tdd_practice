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
}
