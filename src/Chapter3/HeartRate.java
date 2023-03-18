package Chapter3;

public class HeartRate { // Exercise 3.16, Making a difference

    private String firstName;
    private String lastName;
    private int year;
    private int month;
    private int day;

    private int maximumHeartRate;

    private double targetHeartRate;

    public HeartRate(String firstName, String lastName, int year, int month, int day){
        this.firstName = firstName;
        this.lastName = lastName;

        if(year >= 1900){
            this.year = 2023 - year;
        }

        this.month = month;
        this.day = day;
    }



    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public void setYear(int year){
        if(year >= 1900){
            this.year = 2023 - year;
        }
    }
    public void setMonth(int month){
        this.month = month;
    }
    public void setDay(int day){
        this.day = day;
    }


    public double getTargetHeartRate() {
        double y = 0.85 * getMaximumHeartRate();
        return y;
    }


    public int  getMaximumHeartRate() {
        int x = 220 - year;
        return x;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }


    public int getMonth(){
        return month;
    }


    public int getYear(){
        return year;
    }

    public int getDay(){
        return day;
    }


   }
