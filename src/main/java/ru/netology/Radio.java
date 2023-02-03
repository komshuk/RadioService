package ru.netology;

public class Radio {
    private int station;
    private int soundVolume;
    private int numberStations = 10;
    private int scaleVolume = 100;

    public Radio(int numberStations) {
        this.numberStations = numberStations;
    }
    public Radio() {
        this.numberStations = 10;
    }

    public int getStation() {
        return station;
    }

    public int getNumberStation() {
        return numberStations;
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

    public int getScaleVolume() {
        return scaleVolume;
    }

    public void setSoundVolume(int soundVolume) {
        if (soundVolume < 0) {
            return;
        }
        if (soundVolume > 99) {
            soundVolume = 99;
        }
        this.soundVolume = soundVolume;
    }

    public void increaseSoundVolume() {
        if (soundVolume < 99) {
            soundVolume++;
        }
    }

    public void reduceSoundVolume() {
        if (soundVolume > 0) {
            soundVolume--;
        }
    }

}
