package MusicHouse.MusicShop;

public abstract class Instrument {

    String instrumentType;
    String colour;
    int buyingPrice;
    int sellingPrice;

    public Instrument(String instrumentType, String colour, int buyingPrice, int sellingPrice){
        this.instrumentType = instrumentType;
        this.colour = colour;
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
    }

    public String getInstrumentType() {
        return instrumentType;
    }

    public void setInstrumentType(String instrumentType) {
        this.instrumentType = instrumentType;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getBuyingPrice() {
        return buyingPrice;
    }

    public void setBuyingPrice(int buyingPrice) {
        this.buyingPrice = buyingPrice;
    }

    public int getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(int sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public int calculateProfit(){
        return getSellingPrice() - getBuyingPrice();
    }

}
