public class ProductMgmt {
    public static void main(String[] args)throws java.io.IOException {
        Product [] product = new Product[7];

        ProductMgmt d = new ProductMgmt(); // 주소 만들기

//        for (int i = 0; i < 7; i++) {
//            product[i] = new Product(); // 상품생성
//            String line = sc.nextLine();
//            String [] array = line.split("\\s+");
//            product[i].productName = array[0].trim();
//            product[i].quantity = Integer.parseInt(array[1].trim());
//            product[i].sellingPrice = Integer.parseInt(array[2].trim());
//            product[i].purchasePrice = Integer.parseInt(array[3].trim());
//            product[i].shippingPrice = Integer.parseInt(array[4].trim());
//            product[i].profit = Integer.parseInt(array[5].trim());
//            product[i].profitMargin = Integer.parseInt(array[6].trim());
//        }
//        int j = 0;
//        while (j < 7) {
//            System.out.printf("%10s\t%5d\t%5d\t%5d\t%5d\t%5d\t%5d\t%5d%n",
//                    product[j].productName, product[j].quantity,
//                    product[j].sellingPrice, product[j].purchasePrice,
//                    product[j].shippingPrice, product[j].profit,
//                    product[j].profitMargin);
//            j++;
//        }
    }
    void input(Product product){
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print( "상품명 : ");
            product.productName = sc.next();
        System.out.print( " 수량 :");
            product.quantity = sc.nextInt();

    }
    void calc(Product product){}
    void output(Product product){}

}
