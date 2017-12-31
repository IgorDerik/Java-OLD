package Lec3;

/*
TO BE DONE SOON
*/

public class Station {

    private String name;

    private int arrivalTime;
    private int departureTime;

    private String timeFull; //experimental

    public Station(String name, String timeFull) {
        this.name = name;
        this.timeFull = timeFull;
    }

    public Station(String name, int arrivalTime, int departureTime) {
        this.name = name;
        this.arrivalTime = arrivalTime;
        this.departureTime = departureTime;
    }
}
