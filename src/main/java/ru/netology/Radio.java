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

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
        if (currentVolume >= 100) {
            currentVolume = 100;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
        if (currentVolume <= 0) {
            currentVolume = 0;
        }
    }
}


















