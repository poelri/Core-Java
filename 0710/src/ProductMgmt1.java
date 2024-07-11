import java.io.IOException;

public class ProductMgmt1 {
    public static void main(String[] args) throws java.io.IOException {
        Product [] product = new Product[7];

        new ProductInput().productInput(product);

        new ProductCalc().productCalc(product);

        new ProductOutput().productOutput(product);

    }
}
