package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    Radio road = new Radio();

    @Test
    public void addMaxMinStation() {
        Radio road = new Radio(5);
        assertEquals(4, road.getMaxStation());

        Radio road2 = new Radio(50);
        assertEquals(49, road2.getMaxStation());

        Radio road3 = new Radio(10);
        assertEquals(0, road3.getMinStation());
    }

    @Test
    public void currentStation() {
        road.setCurrentStation(0);
        road.setCurrentStation(-1);
        road.setCurrentStation(11);
        assertEquals(0, road.getCurrentStation());
    }

    @Test
    public void addNextStation() {
        road.setCurrentStation(0);
        road.addNextStation();
        assertEquals(1, road.getCurrentStation());

        road.setCurrentStation(10);
        road.addNextStation();
        assertEquals(0, road.getCurrentStation());

        road.setCurrentStation(-1);
        road.addNextStation();
        assertEquals(0, road.getCurrentStation());

        road.setCurrentStation(11);
        road.addNextStation();
        assertEquals(1, road.getCurrentStation());
    }

    @Test
    public void addPrevStation() {
        road.setCurrentStation(0);
        road.addPrevStation();
        assertEquals(10, road.getCurrentStation());

        road.setCurrentStation(10);
        road.addPrevStation();
        assertEquals(9, road.getCurrentStation());
    }

    @Test
    public void maxStation() {
        assertEquals(10, road.getMaxStation());
    }

    @Test
    public void addMaxStation() {
        road.setMaxStation(-1);
        road.setMaxStation(0);
        road.setMaxStation(11);
        assertEquals(11, road.getMaxStation());
    }

    @Test
    public void minStation() {
        assertEquals(0, road.getMinStation());
    }

    @Test
    public void addMinStation() {
        road.setMinStation(-1);
        road.setMinStation(0);
        road.setMinStation(11);
        assertEquals(11, road.getMinStation());
    }

    @Test
    public void currentVolume() {
        road.setCurrentVolume(101);
        assertEquals(0, road.getCurrentVolume());

        road.setCurrentVolume(-1);
        assertEquals(100, road.getCurrentVolume());

        road.setCurrentVolume(3);
        assertEquals(3, road.getCurrentVolume());
    }

    @Test
    public void minVolume() {
        assertEquals(0, road.getMinVolume());
    }

    @Test
    public void maxVolume() {
        assertEquals(100, road.getMaxVolume());
    }

    @Test
    public void addMinVolume() {
        road.setMaxVolume(100);
        road.setMinVolume(1);
        assertEquals(1, road.getMinVolume());
    }

    @Test
    public void addMaxVolume() {
        road.setMinVolume(0);
        road.setMaxVolume(100);
        assertEquals(100, road.getMaxVolume());
    }

    @Test
    public void addVolumeUp() {
        road.setCurrentVolume(3);
        road.addVolumeUp();
        assertEquals(4, road.getCurrentVolume());

        road.setCurrentVolume(100);
        road.addVolumeUp();
        assertEquals(0, road.getCurrentVolume());
    }

    @Test
    public void addVolumeDown() {
        road.setCurrentVolume(6);
        road.addVolumeDown();
        assertEquals(5, road.getCurrentVolume());

        road.setCurrentVolume(0);
        road.addVolumeDown();
        assertEquals(100, road.getCurrentVolume());
    }
}