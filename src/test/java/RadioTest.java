import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {
    @Test
    public void allStation(){
        Radio rad = new Radio(10);
        assertEquals(10,rad.getAllNumberStation());
    }
    @Test
    public void nextNineNumberStation() {
        Radio rad = new Radio();
        rad.setNumberStation(9);
        int expected = 0;
        int actual = rad.getNumberStation();
        assertEquals(expected, actual);
    }

    @Test
    public void nextNumberStation() {
        Radio rad = new Radio();
        rad.setNumberStation(4);
        int expected = 5;
        int actual = rad.getNumberStation();
        assertEquals(expected, actual);
    }

    @Test
    public void prevNumberStation() {
        Radio rad = new Radio();
        rad.setPrevNumberStation(0);
        int expected = 9;
        int actual = rad.getNumberStation();
        assertEquals(expected, actual);
    }

    @Test
    public void prevNumberStation2() {
        Radio rad = new Radio();
        rad.setPrevNumberStation(2);
        int expected = 1;
        int actual = rad.getNumberStation();
        assertEquals(expected, actual);
    }

    @Test
    public void notValidStation() {
        Radio rad = new Radio();
        rad.setChangeStation(10);
        int expected = 0;
        int actual = rad.getNumberStation();
        assertEquals(expected, actual);
    }

    @Test
    public void validStation() {
        Radio rad = new Radio();
        rad.setChangeStation(7);
        int expected = 7;
        int actual = rad.getNumberStation();
        assertEquals(expected, actual);
    }

    @Test
    public void plusCurrentVolume() {
        Radio rad = new Radio();
        rad.setVolume(100);
        int expected = 100;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void plusCurrentVolume2() {
        Radio rad = new Radio();
        rad.setVolume(70);
        int expected = 71;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void minusCurrentVolume() {
        Radio rad = new Radio();
        rad.setReductionVolume(1);
        int expected = 0;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void minusCurrentVolume2() {
        Radio rad = new Radio();
        rad.setReductionVolume(61);
        int expected = 60;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);
    }
}