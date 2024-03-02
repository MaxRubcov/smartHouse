package ru.netology;

public class Radio {
    public int currentVolume;
    public int radioStationNumber;

    public int getRadioStationNumber() {
        return radioStationNumber;

    }

    public void nextRadioStationNumber(int newRadioStationNamber) {
        if (newRadioStationNamber == 9) {
            radioStationNumber = 0;
        }
        if (newRadioStationNamber < 9) {
            radioStationNumber = radioStationNumber + 1;
        }
    }

    public void prevRadioStation(int newRadioStationNamber) {
        if (newRadioStationNamber == 0) {
            radioStationNumber = 9;
        }
        if (newRadioStationNamber > 0)
            radioStationNumber = newRadioStationNamber - 1;
    }

    public void setRadioStationNumber(int newRadioStationNumber) {
        if (newRadioStationNumber < 0) {
            return;
        }
        if (newRadioStationNumber > 9) {
            return;
        }
        radioStationNumber = newRadioStationNumber;
    }

    public void increaseVolume(int newCurrentVolume) {
        if (newCurrentVolume < 100) {
            currentVolume = newCurrentVolume + 1;
        }
        if (newCurrentVolume >= 100) {
            currentVolume = 100;
        }
    }

    public void decreaseVolume(int newCurrentVolume) {
        if (newCurrentVolume > 0) {
            currentVolume = newCurrentVolume - 1;
        }
        if (newCurrentVolume <= 0) {
            currentVolume = 0;
        }
    }
}


















