package Program;

public class ImportedProduct extends Product {

    private Double customsFee;


    public ImportedProduct(Double customsFee, Double price, String name) {
        super(name, price);
        this.customsFee = customsFee;
    }


    public Double getCustomsFee() {
        return this.customsFee;
    }

    public void setCustomsFee(Double customsFee) {
        this.customsFee = customsFee;
    }

    public Double totalPrice() {
        return getPrice() + customsFee;
    }
    
    @Override
    public String priceTag() {
        return getName() + " $ " + String.format("%.2f", totalPrice()) + "(Customs fee: $ " + String.format("%.2f", customsFee) + ")";
    }

}
