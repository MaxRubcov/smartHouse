import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.Radio;

public class RadioTest {
    @Test
    public void shouldNextRadioStationMin() {
        Radio radio = new Radio(25);

        radio.setRadioStationNumber(24);
        radio.nextRadioStationNumber();

        Assertions.assertEquals(0, radio.getRadioStationNumber());
    }

    @Test
    public void shouldNextRadioStation() {
        Radio radio = new Radio(25);

        radio.setRadioStationNumber(17);
        radio.nextRadioStationNumber();

        Assertions.assertEquals(18, radio.getRadioStationNumber());
    }

    @Test
    public void shouldPrevRadioStation() {
        Radio radio = new Radio(25);

        radio.setRadioStationNumber(0);
        radio.prevRadioStationNumber();

        Assertions.assertEquals(24, radio.getRadioStationNumber());
    }

    @Test
    public void shouldPrevRadioStationNamber() {
        Radio radio = new Radio(25);

        radio.setRadioStationNumber(18);
        radio.prevRadioStationNumber();

        Assertions.assertEquals(17, radio.getRadioStationNumber());
    }

    @Test
    public void shouldSetRadioStation() {
        Radio radio = new Radio(25);

        radio.setRadioStationNumber(24);

        Assertions.assertEquals(24, radio.getRadioStationNumber());
    }

    @Test
    public void shouldNotSetRadioStation() {
        Radio radio = new Radio(25);

        radio.setRadioStationNumber(26);

        Assertions.assertEquals(0, radio.getRadioStationNumber());
    }

    @Test
    public void shouldNotSetRadioStationNamber() {
        Radio radio = new Radio(25);

        radio.setRadioStationNumber(-1);

        Assertions.assertEquals(0, radio.getRadioStationNumber());
    }

    @Test
    public void shoulNotSetIncreaseMaxVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(101);

        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shoulNotSetIncreaseMinVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);

        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shoulSetIncreaseMaxVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(99);

        Assertions.assertEquals(99, radio.getCurrentVolume());
    }

    @Test
    public void shoulIncreaseMaxVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(75);
        radio.increaseVolume();

        Assertions.assertEquals(76, radio.getCurrentVolume());
    }

    @Test
    public void shoulIncreaseVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(100);
        radio.increaseVolume();

        Assertions.assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void shoulDecreaseMinVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);
        radio.decreaseVolume();

        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shoulDecreaseVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(100);
        radio.decreaseVolume();

        Assertions.assertEquals(99, radio.getCurrentVolume());
    }
}