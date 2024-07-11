public class Product {
    String productName; // 상품명
    int quantity; // 수량
    int sellingPrice; // 판매단가
    int purchasePrice; // 매입단가
    int shippingPrice; // 운송료
    int profit; // 이익금
    int profitMargin; //이익률

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(int sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public int getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(int purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public int getShippingPrice() {
        return shippingPrice;
    }

    public void setShippingPrice(int shippingPrice) {
        this.shippingPrice = shippingPrice;
    }

    public int getProfit() {
        return profit;
    }

    public void setProfit(int profit) {
        this.profit = profit;
    }

    public int getProfitMargin() {
        return profitMargin;
    }

    public void setProfitMargin(int profitMargin) {
        this.profitMargin = profitMargin;
    }
}
