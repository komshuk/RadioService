package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void numberRadioStation() {
        Radio road = new Radio();

        Assertions.assertEquals(10, road.getNumberStation());
    }

    @Test
    public void numberRadioStation2() {
        Radio road = new Radio(10);

        Assertions.assertEquals(10, road.getNumberStation());
    }

    @Test
    void nextRadioStation() {
        Radio road = new Radio();

        road.setStation(2);
        road.nextStation();
        int actual = road.getStation();
        int expected = 3;

        assertEquals(actual, expected);
    }

    @Test
    void nextRadioStation2() {
        Radio road = new Radio();

        road.setStation(9);
        road.nextStation();
        int actual = road.getStation();
        int expected = 0;

        assertEquals(actual, expected);
    }

    @Test
    void nextRadioStation3() {
        Radio road = new Radio();

        road.setStation(0);
        road.nextStation();
        int actual = road.getStation();
        int expected = 1;

        assertEquals(actual, expected);
    }

    @Test
    void nextRadioStation4() {
        Radio road = new Radio();

        road.setStation(22);
        road.nextStation();
        int actual = road.getStation();
        int expected = 1;

        assertEquals(actual, expected);
    }

    @Test
    void prevRadioStation() {
        Radio road = new Radio();

        road.setStation(9);
        road.prevStation();

        int actual = road.getStation();
        int expected = 8;

        assertEquals(actual, expected);
    }

    @Test
    void prevRadioStation2() {
        Radio road = new Radio();

        road.setStation(33);
        road.prevStation();

        int actual = road.getStation();
        int expected = 9;

        assertEquals(actual, expected);
    }

    @Test
    void prevRadioStation3() {
        Radio road = new Radio();

        road.setStation(-1);
        road.prevStation();

        int actual = road.getStation();
        int expected = 9;

        assertEquals(actual, expected);
    }

    @Test
    void prevRadioStation4() {
        Radio road = new Radio();

        road.setStation(10);
        road.prevStation();

        int actual = road.getStation();
        int expected = 9;

        assertEquals(actual, expected);
    }

    @Test
    void increaseVolume() {
        Radio road = new Radio();

        road.setSoundVolume(3);
        road.increaseSoundVolume();

        int actual = road.getSoundVolume();
        int expected = 4;

        assertEquals(actual, expected);
    }

    @Test
    void increaseVolume2() {
        Radio road = new Radio();

        road.setSoundVolume(123);
        road.increaseSoundVolume();

        int actual = road.getSoundVolume();
        int expected = 99;

        assertEquals(actual, expected);
    }

    @Test
    void reduceVolume() {
        Radio road = new Radio();

        road.setSoundVolume(8);
        road.reduceSoundVolume();
        int actual = road.getSoundVolume();
        int expected = 7;

        assertEquals(actual, expected);
    }

    @Test
    void reduceVolume2() {
        Radio radio = new Radio();

        radio.setSoundVolume(-3);
        radio.reduceSoundVolume();

        int actual = radio.getSoundVolume();
        int expected = 0;

        assertEquals(actual, expected);
    }

}