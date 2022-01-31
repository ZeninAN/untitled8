import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {
    @Test
    public void nextNumberStation (){
        Radio rad = new Radio();
        rad.setNumberStation(4);
        int expected = 5;
        int actual = rad.getNumberStation();
        assertEquals(expected,actual);
    }
}