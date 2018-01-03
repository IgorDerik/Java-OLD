package Lec3;

import java.time.LocalTime;

/*
This is not final version
 */

public class Station {

    private String name;

    private LocalTime arrivalTime;
    private LocalTime departureTime;

    private LocalTime arrivalTimeBack;
    private LocalTime departureTimeBack;

    public String getName() {
        return name;
    }

    public LocalTime getDepartureTime() {
        return departureTime;
    }

    public LocalTime getArrivalTime() {
        return arrivalTime;
    }

    public LocalTime getArrivalTimeBack() {
        return arrivalTimeBack;
    }

    public LocalTime getDepartureTimeBack() {
        return departureTimeBack;
    }

    public void setArrivalTimeBack(LocalTime arrivalTimeBack) {
        this.arrivalTimeBack = arrivalTimeBack;
    }

    public void setDepartureTimeBack(LocalTime departureTimeBack) {
        this.departureTimeBack = departureTimeBack;
    }

    public Station(String name, LocalTime arrivalTime, LocalTime departureTime) {
        this.name = name;
        this.arrivalTime = arrivalTime;
        this.departureTime = departureTime;
    }

    public Station(String name, LocalTime arrivalTime, LocalTime departureTime, LocalTime arrivalTimeBack, LocalTime departureTimeBack) {
        this.name = name;
        this.arrivalTime = arrivalTime;
        this.departureTime = departureTime;
        this.arrivalTimeBack = arrivalTimeBack;
        this.departureTimeBack = departureTimeBack;
    }

    @Override
    public String toString() {
        return "\nStation{" +
                "name='" + name + '\'' +
                ", arrivalTime=" + arrivalTime +
                ", departureTime=" + departureTime +
                ", arrivalTimeBack=" + arrivalTimeBack +
                ", departureTimeBack=" + departureTimeBack +
                '}';
    }
}
