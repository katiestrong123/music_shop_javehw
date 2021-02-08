package MiscProductsTests;

import MusicHouse.MiscProducts.MusicSheet;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MusicSheetTest {

    MusicSheet musicSheet;

    @Before
    public void before(){
        musicSheet = new MusicSheet("music content", 1,6,true );
    }

    @Test
    public void hasProductType(){
        assertEquals("music content", musicSheet.getProduct());
    }

    @Test
    public void hasBuyingPrice(){
        assertEquals(1, musicSheet.getBuyingPrice());
    }

    @Test
    public void hasSellingPrice(){
        assertEquals(6, musicSheet.getSellingPrice());
    }

    @Test
    public void testGivesASheet(){
        assertEquals(true, musicSheet.getGivesASheet());
    }

    @Test
    public void canCalculateProfit(){
        assertEquals(5, musicSheet.getSellingPrice() - musicSheet.getBuyingPrice());
    }

}
