public class ProductCalc {
    void productCalc(Product[] products){
        for(Product product : products) {
        int salesAmount = product.getQuantity() * product.getSellingPrice(); // 판매금액
        int purchaseAmount = product.getQuantity() * product.getPurchasePrice();// 매입금액
        int profit = salesAmount - (purchaseAmount + product.getShippingPrice()); // 이익금

        double profitMargin = (double) profit / purchaseAmount * 100;
            product.setProfit(profit);
            product.setProfitMargin(profitMargin);
        }
    }
}
