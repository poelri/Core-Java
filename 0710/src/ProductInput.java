import java.io.FileNotFoundException;

public class ProductInput {
    public void productInput(Product [] product) throws java.io.IOException  {
        java.util.Scanner sc = new java.util.Scanner(new java.io.File("src/product.dat"));
        for (int i = 0; i < product.length; i++) {

            String line = sc.nextLine();// "NOTEBOOK"	"36000"	"5000"	"4700"	"2000"
            String [] array = line.split("\\s+");
            product[i] = new Product();
            product[i].productName = array[0].trim(); // 이름
            product[i].quantity = Integer.parseInt(array[1].trim()); // 수량
            product[i].sellingPrice = Integer.parseInt(array[2].trim()); // 판매단가
            product[i].purchasePrice = Integer.parseInt(array[3].trim()); // 매입단가
            product[i].shippingPrice = Integer.parseInt(array[4].trim()); // 운송료
        }
    }
}
