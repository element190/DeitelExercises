package Chapter3;

public class ClockClass { // Exercise 3.14

    private int hour;

    private int minute;

    private int second;


    public ClockClass(int hour, int minute, int second){

        if(hour < 23)
            this.hour = hour;
        else
            this.hour = 0;


        if(minute < 59)
            this.minute = minute;
        else
            this.minute = 0;


        if(second < 59)
            this.second = second;
        else
            this.second = 0;
    }


    public int getHour(){
        return hour;
    }

    public int getMinute(){
        return minute;
    }

    public int getSecond(){
        return second;
    }
}
