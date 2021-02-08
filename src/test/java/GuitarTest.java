import MusicHouse.MusicShop.Guitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class GuitarTest {

    Guitar guitar;

    @Before
    public void before(){
        guitar = new Guitar( "String", "Red", 5,25, 6 );
    }

    @Test
    public void hasInstrumentType(){
        assertEquals("String", guitar.getInstrumentType());
    }

    @Test
    public void hasColour(){
        assertEquals("Red", guitar.getColour());
    }

    @Test
    public void hasBuyingPrice(){
        assertEquals(5, guitar.getBuyingPrice());
    }

    @Test
    public void hasSellingPrice(){
        assertEquals(25, guitar.getSellingPrice());
    }

    @Test
    public void hasNumberOfStrings(){
        assertEquals(6, guitar.getNumberOfStrings());
    }

    @Test
    public void canPlay(){
        assertEquals("And now.. wonderwall..?", guitar.playSweetMelody());
    }

    @Test
    public void canCalculateProfit(){
        assertEquals(20, guitar.getSellingPrice() - guitar.getBuyingPrice());
    }

}