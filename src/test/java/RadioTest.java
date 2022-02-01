import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {
    @Test
    public void nextNineNumberStation (){
        Radio rad = new Radio();
        rad.setNumberStation(9);
        int expected = 0;
        int actual = rad.getNumberStation();
        assertEquals(expected,actual);
    }
    @Test
    public void nextNumberStation (){
        Radio rad = new Radio();
        rad.setNumberStation(4);
        int expected = 5;
        int actual = rad.getNumberStation();
        assertEquals(expected,actual);
    }
    @Test
    public void prevNumberStation(){
        Radio rad = new Radio();
        rad.setPrevNumberStation(0);
        int expected = 9;
        int actual = rad.getNumberStation();
        assertEquals(expected,actual);
    }
    @Test
    public void prevNumberStation2(){
        Radio rad = new Radio();
        rad.setPrevNumberStation(2);
        int expected = 3;
        int actual = rad.getNumberStation();
        assertEquals(expected,actual);
    }
    @Test
    public void plusCurrentVolume(){
        Radio rad = new Radio();
        rad.setVolume(10);
        int expected = 10;
        int actual = rad.getCurrentVolume();
        assertEquals(expected,actual);
    }
    @Test
    public void plusCurrentVolume2(){
        Radio rad = new Radio();
        rad.setVolume(7);
        int expected = 8;
        int actual = rad.getCurrentVolume();
        assertEquals(expected,actual);
    }
    @Test
    public void minusCurrentVolume(){
        Radio rad = new Radio();
        rad.setReductionVolume(1);
        int expected = 1;
        int actual = rad.getCurrentVolume();
        assertEquals(expected,actual);
    }
    @Test
    public void minusCurrentVolume2(){
        Radio rad = new Radio();
        rad.setReductionVolume(6);
        int expected = 5;
        int actual = rad.getCurrentVolume();
        assertEquals(expected,actual);
    }
}