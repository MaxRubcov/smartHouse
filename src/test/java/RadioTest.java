import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.Radio;

public class RadioTest {
    @Test

    public void giveNextRadioStation() {
        Radio radio = new Radio();

        radio.nextRadioStationNumber(9);

        int expected = 0;
        int actual = radio.radioStationNumber;

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void NextRadioStation() {
        Radio radio = new Radio();

        radio.nextRadioStationNumber(0);

        int expected = 1;
        int actual = radio.radioStationNumber;

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void givePrevRadioStation() {
        Radio radio = new Radio ();
        radio.prevRadioStation(0);
        int expected = 9;
        int actual = radio.radioStationNumber;

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void PrevRadioStation() {
        Radio radio = new Radio ();
        radio.prevRadioStation(8);
        int expected = 7;
        int actual = radio.radioStationNumber;

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void giveSetRadioStation() {
        Radio radio = new Radio ();
        radio.setRadioStationNumber(5);
        int expected = 5;
        int actual = radio.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }
}