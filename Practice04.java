// Pattern printing by nested loop


public class Pattern {
    public static void main(String[]args){
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}



// Filtering system for products :
public class Filter_Product {
    void filterProducts(String category) {
        System.out.println("Filtering products in category: " + category);
    }

    void filterProducts(double minPrice, double maxPrice) {
        System.out.println("Filtering products in price range: $" + minPrice + " - $" + maxPrice);
    }

    void filterProducts(String brand, boolean isFilter) {
        if (isFilter) {
            System.out.println("Filtering products by brand: " + brand);
        }
    }

    void filterProducts(String category, double minPrice, double maxPrice) {
        System.out.println("Filtering products in category and price range: " + category +
                ", with price range: $" + minPrice + " - $" + maxPrice);
    }

    void filterProducts(String category, double minPrice, double maxPrice, String brand) {
        System.out.println("Filtering products in category with price range and brand name: " + category +
                ", with price range: $" + minPrice + " - $" + maxPrice + ", and the brand is: " + brand);
    }

    public static void main(String[] args) {
        Filter_Product filter = new Filter_Product();

        filter.filterProducts("Electronics");
        filter.filterProducts(100.0, 500.0);
        filter.filterProducts("Apple", true);
        filter.filterProducts("Fashion", 100.0, 500.0);
        filter.filterProducts("Electronics", 100.0, 500.0, "Realme");
    }
}


