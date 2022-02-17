import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {
    @Test
    public void allStation(){
        Radio rad = new Radio(10);
        assertEquals(10,rad.getAllNumberStation());
    }
    @Test
    public void numberStation() {
        Radio rad = new Radio();
        rad.setNumberStation(0);
        int expected = 0;
        int actual = rad.getNumberStation();
        assertEquals(expected, actual);
    }

    @Test
    public void numberStationTwo() {
        Radio rad = new Radio();
        rad.setNumberStation(9);
        int expected = 9;
        int actual = rad.getNumberStation();
        assertEquals(expected, actual);
    }

    @Test
    public void numberStationThird() {
        Radio rad = new Radio();
        rad.setNumberStation(10);
        int expected = 0;
        int actual = rad.getNumberStation();
        assertEquals(expected, actual);
    }

    @Test
    public void numberStation4() {
        Radio rad = new Radio();
        rad.setNumberStation(-1);
        int expected = 0;
        int actual = rad.getNumberStation();
        assertEquals(expected, actual);
    }

    @Test
    public void nextStation() {
        Radio rad = new Radio();
        rad.setNumberStation(9);
        rad.setNext();
        int expected = 0;
        int actual = rad.getNumberStation();
        assertEquals(expected, actual);
    }

    @Test
    public void nextStation2() {
        Radio rad = new Radio();
        rad.setNumberStation(5);
        rad.setNext();
        int expected = 6;
        int actual = rad.getNumberStation();
        assertEquals(expected, actual);
    }

    @Test
    public void prevStation() {
        Radio rad = new Radio();
        rad.setNumberStation(0);
        rad.setPrev();
        int expected = 9;
        int actual = rad.getNumberStation();
        assertEquals(expected, actual);
    }

    @Test
    public void prevStation2() {
        Radio rad = new Radio();
        rad.setNumberStation(8);
        rad.setPrev();
        int expected = 7;
        int actual = rad.getNumberStation();
        assertEquals(expected, actual);
    }

    @Test
    public void currentVolume() {
        Radio rad = new Radio();
        rad.setVolume(0);
        int expected = 0;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void currentVolume2() {
        Radio rad = new Radio();
        rad.setVolume(10);
        int expected = 10;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void currentVolume3() {
        Radio rad = new Radio();
        rad.setVolume(11);
        int expected = 10;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void currentVolume4() {
        Radio rad = new Radio();
        rad.setVolume(-1);
        int expected = 0;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void increaseVolume() {
        Radio rad = new Radio();
        rad.setVolume(11);
        rad.setIncreaseVolume();
        int expected = 10;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void increaseVolume2() {
        Radio rad = new Radio();
        rad.setVolume(5);
        rad.setIncreaseVolume();
        int expected = 6;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void redactionVolume() {
        Radio rad = new Radio();
        rad.setVolume(0);
        rad.setReductionVolume();
        int expected = 0;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void redactionVolume2() {
        Radio rad = new Radio();
        rad.setVolume(5);
        rad.setReductionVolume();
        int expected = 4;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);
    }
}