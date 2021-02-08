import MusicHouse.MusicShop.Piano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    Piano piano;

    @Before
    public void before(){
        piano = new Piano("Instruments.Piano", "black", 40, 100, 23);

    }

    @Test
    public void hasInstrumentType(){
        assertEquals("Instruments.Piano", piano.getInstrumentType());
    }

    @Test
    public void hasColour(){
        assertEquals("black", piano.getColour());
    }

    @Test
    public void hasBuyingPrice(){
        assertEquals(40, piano.getBuyingPrice());
    }

    @Test
    public void hasSellingPrice(){
        assertEquals(100, piano.getSellingPrice());
    }

    @Test
    public void hasNumberOfAliciaKeys(){
        assertEquals(23, piano.getNumberOfAliciaKeys());
    }

    @Test
    public void canPlay(){
        assertEquals("Let's hear it for NY", piano.playSweetMelody());
    }

    @Test
    public void canCalculateProfit(){
        assertEquals(60, piano.getSellingPrice() - piano.getBuyingPrice());
    }

}