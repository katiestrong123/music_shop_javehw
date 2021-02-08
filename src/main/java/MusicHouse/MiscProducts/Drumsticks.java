package MusicHouse.MiscProducts;

import MusicHouse.MiscProducts.OtherProducts;
import MusicHouse.MusicShop.ISell;

public class Drumsticks extends OtherProducts implements ISell {

    int bangLevel;

    public int getBangLevel() {
        return bangLevel;
    }

    public Drumsticks(String product, int buyingPrice, int sellingPrice, int bangLevel) {
        super(product, buyingPrice, sellingPrice);
        this.bangLevel = bangLevel;
    }

    public void setBangLevel(int bangLevel) {
        this.bangLevel = bangLevel;
    }

    @Override
    public int calculateProfit() {
         return this.getSellingPrice() - this.getBuyingPrice();
    }
}
