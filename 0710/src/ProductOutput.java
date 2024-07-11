public class ProductOutput {
    void productOutput(Product [] products){
        System.out.println("-------------------------------------------------");
        System.out.println("상품명\t수량\t판매단가\t매입단가\t운송료\t이익금\t이익율");
        System.out.println("-------------------------------------------------");
        for(Product product : products){
            System.out.printf("%-20s%,d\t%,d\t%,d\t%,d\t\t%,d\t%10.2f%n",
                    product.productName,product.quantity,product.sellingPrice,
                        product.purchasePrice,product.shippingPrice,product.profit,
                        product.profitMargin);

        }
    }
}
