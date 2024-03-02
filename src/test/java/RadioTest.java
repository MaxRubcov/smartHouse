import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.Radio;

public class RadioTest {
    @Test
    public void shoulNextRadioStationMin() {
        Radio radio = new Radio();

        radio.nextRadioStationNumber(9);

        int expected = 0;
        int actual = radio.radioStationNumber;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shoulNextRadioStation() {
        Radio radio = new Radio();

        radio.nextRadioStationNumber(0);

        int expected = 1;
        int actual = radio.radioStationNumber;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shoulPrevRadioStation() {
        Radio radio = new Radio();

        radio.prevRadioStation(0);

        int expected = 9;
        int actual = radio.radioStationNumber;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shoulPrevRadioStationNamber() {
        Radio radio = new Radio();

        radio.prevRadioStation(8);

        int expected = 7;
        int actual = radio.radioStationNumber;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shoulSetRadioStation() {
        Radio radio = new Radio();

        radio.setRadioStationNumber(5);

        int expected = 5;
        int actual = radio.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shoulNotSetRadioStation() {
        Radio radio = new Radio();

        radio.setRadioStationNumber(10);

        int expected = 0;
        int actual = radio.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shoulNotSetRadioStationNamber() {
        Radio radio = new Radio();

        radio.setRadioStationNumber(-1);

        int expected = 0;
        int actual = radio.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shoulIncreaseMaxVolume() {
        Radio radio = new Radio();

        radio.increaseVolume(100);

        int expected = 100;
        int actual = radio.currentVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shoulIncreaseVolume() {
        Radio radio = new Radio();

        radio.increaseVolume(50);

        int expected = 51;
        int actual = radio.currentVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shoulDecreaseMinVolume() {
        Radio radio = new Radio();

        radio.decreaseVolume(0);

        int expected = 0;
        int actual = radio.currentVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shoulDecreaseVolume() {
        Radio radio = new Radio();

        radio.decreaseVolume(50);

        int expected = 49;
        int actual = radio.currentVolume;

        Assertions.assertEquals(expected, actual);
    }
}