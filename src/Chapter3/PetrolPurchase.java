package Chapter3;

public class PetrolPurchase { //Exercise 3.12
    private String stationLocation;
    private String typeOfPetrol;
    private int quantityInLiters;
    private double pricePerLitre;
    private double percentageDiscount;




    public void setStateLocation(String location){
        this.stationLocation = location;
    }

    public void setTypeOfPetrol(String petrolType){
        this.typeOfPetrol = petrolType;
    }

    public void setQuantityInLiters(int quantity){
        this.quantityInLiters = quantity;
    }

    public final void setPricePerLitre(double price){
        this.pricePerLitre = price;
    }

    public final void setPercentageDiscount(double discount){
        this.percentageDiscount = discount;
    }

    public String getStationLocation(){
        return "location";
    }

    public String getTypeOfPetrol(){
        return typeOfPetrol;
    }

    public int getQuantityInLiters(){
        return quantityInLiters;
    }

    public double getPricePerLitre(){
        return pricePerLitre;
    }

    public double getPercentageDiscount() {
        return percentageDiscount;
    }

    public double getPurchaseAmount(){
        double netPurchaseAmount = (quantityInLiters * pricePerLitre) - percentageDiscount;

        return netPurchaseAmount;
    }
}
