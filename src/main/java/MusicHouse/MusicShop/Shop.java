package MusicHouse.MusicShop;

import ISell;

import java.util.ArrayList;

    public static class Shop {
        ArrayList<ISell> stock;

        public Shop() {
            this.stock = new ArrayList<>();
        }

        public void addToStock(ISell item) {
            this.stock.add(item);
        }

        public void removeFromStock(ISell item) {
            this.stock.remove(item);
        }

        public ArrayList getStock() {
            return this.stock;
        }

        public double getTotalProfit() {
            double totalProfit = 0;
            for (ISell item : this.stock) {
                totalProfit += item.calculateProfit();
            }
            return totalProfit;

        }
    }