package ru.netology;

public class Radio {

    private int sumRadioStation = 10;
    private int maxVolume = 100;
    private int minVolume = 0;
    private int currentVolume;
    private int radioStationNumber;

    public Radio(int sumRadioStation) {
        this.sumRadioStation = sumRadioStation;
    }

    public Radio() {

    }

    public int getRadioStationNumber() {
        return radioStationNumber;

    }

    public int getCurrentVolume() {

        return currentVolume;
    }

    public void setRadioStationNumber(int newRadioStationNumber) {
        if (newRadioStationNumber < 0) {
            return;
        }
        if (newRadioStationNumber > sumRadioStation - 1) {
            return;
        }
        radioStationNumber = newRadioStationNumber;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume > maxVolume) {
            return;
        }
        if (newCurrentVolume < minVolume) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void nextRadioStationNumber() {
        if (radioStationNumber < sumRadioStation - 1) {
            radioStationNumber = radioStationNumber + 1;
        } else {
            radioStationNumber = 0;
        }

    }

    public void prevRadioStationNumber() {
        if (radioStationNumber > 0) {
            radioStationNumber = radioStationNumber - 1;
        } else {
            radioStationNumber = sumRadioStation - 1;
        }

    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        }
        if (currentVolume == maxVolume) {
            currentVolume = maxVolume;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        }
        if (currentVolume == minVolume) {
            currentVolume = minVolume;
        }
    }
}


















