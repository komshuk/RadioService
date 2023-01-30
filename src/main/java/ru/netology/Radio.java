package ru.netology;

public class Radio {
    private int station;
    private int soundVolume;

    public int getStation() {

        return station;
    }

    public void setStation(int station) {
        if (station < 0) {
            return;
        }
        if (station > 9) {
            return;
        }
        this.station = station;
    }

    public void nextStation() {
        if (station < 9) {
            station++;
        } else {
            station = 0;
        }
    }

    public void prevStation() {
        if (station > 0) {
            station--;
        } else {
            station = 9;
        }
    }

    public int getSoundVolume() {
        return soundVolume;
    }

    public void setSoundVolume(int soundVolume) {
        if (soundVolume < 0) {
            return;
        }
        if (soundVolume > 10) {
            soundVolume = 10;
        }
        this.soundVolume = soundVolume;
    }

    public void increaseSoundVolume() {
        if (soundVolume < 10) {
            soundVolume++;
        }
    }

    public void reduceSoundVolume() {
        if (soundVolume > 0) {
            soundVolume--;
        }
    }

}