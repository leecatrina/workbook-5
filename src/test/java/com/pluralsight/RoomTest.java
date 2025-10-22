package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {
    @Test
    void testConstructorAndGetters() {
        Room room = new Room(2, 120.0, false, false);

        assertEquals(2, room.getNumberOfBeds());
        assertEquals(120.0, room.getPrice());
        assertFalse(room.isOccupied());
        assertFalse(room.isDirty());

    }
    @Test

    void testIsAvailable () {
        Room room = new Room(1, 100.0, false, false);
        assertTrue(room.isAvailable()); //should be available if not dirty and not occupied

        Room room2 = new Room(1,100.0,true,false);
        assertFalse(room2.isAvailable()); // not available if occupied

        Room room3 = new Room(1, 100.0,false,true);
        assertFalse(room3.isAvailable()); // not available if dirty

    }

    @Test
    void testCheckIn() {
        Room room = new Room(1, 100.0, false, false);
        room.checkIn();

        assertTrue(room.isOccupied());
        assertTrue(room.isDirty());
    }
}