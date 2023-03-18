package Chapter3;

public class CarClass { //Exercise 3.13
    private String model;
    private String year;
    private double price;

    private double discount;


    public CarClass(String model,String year,double price){
        this.model = model;

        this.year = year;

        if(price >= 0)
            this.price = price;

    }
    public void setDiscount(double discount){
        this.discount = discount;
    }
    public double getDiscount(){
        return discount;
    }

    public void setModel(String model){
        this.model = model;
    }

    public void setYear(String year){
        this.year = year;
    }

    public void setPrice(double price){
        if(price >= 0)
            this.price = price * discount;
    }

    public String getModel(){
        return model;
    }

    public String getYear(){
        return year;
    }

    public double getPrice(){
        return price * discount;
    }


}
