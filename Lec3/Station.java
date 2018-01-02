package Lec3;

import java.time.LocalTime;

/*
This is not final version
 */

public class Station {

    private String name;

    private LocalTime arrivalTime;
    private LocalTime departureTime;

    public String getName() {
        return name;
    }

    public LocalTime getDepartureTime() {
        return departureTime;
    }

    public LocalTime getArrivalTime() {
        return arrivalTime;
    }

    public Station(String name, LocalTime arrivalTime, LocalTime departureTime) {
        this.name = name;
        this.arrivalTime = arrivalTime;
        this.departureTime = departureTime;
    }

}
