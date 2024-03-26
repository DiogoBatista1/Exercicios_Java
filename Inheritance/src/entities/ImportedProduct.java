package entities;

public class ImportedProduct extends Product {
    private Double customFee;
    public ImportedProduct(String name, Double price, Double customFee) {
        super(name, price);
        this.customFee = customFee;
    }

    // Getter and Setter for customFee
    public Double getCustomFee() {
        return customFee;
    }

    public void setCustomFee(Double customFee) {
        this.customFee = customFee;
    }

    @Override
    public String priceTag() {
        double totalPrice = getPrice() + customFee;
        return getName() + " $" + String.format("%.2f", totalPrice) + " (Customs fee: $" + String.format("%.2f", customFee) + ")";
    }
}
