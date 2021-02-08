package MiscProductsTests;

import MusicHouse.MiscProducts.Drumsticks;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumsticksTest {

    Drumsticks drumsticks;

    @Before
    public void before(){
        drumsticks = new Drumsticks("instrument accessories", 2, 15, 5);
    }

    @Test
    public void hasProductType(){
        assertEquals("instrument accessories", drumsticks.getProduct());
    }

    @Test
    public void hasBuyingPrice(){
        assertEquals(2, drumsticks.getBuyingPrice());
    }

    @Test
    public void hasSellingPrice(){
        assertEquals(15, drumsticks.getSellingPrice());
    }

    @Test
    public void hasBangLevel(){
        assertEquals(5, drumsticks.getBangLevel());
    }

    @Test
    public void canCalculateProfit(){
        assertEquals(13, drumsticks.getSellingPrice() - drumsticks.getBuyingPrice());
    }

}
