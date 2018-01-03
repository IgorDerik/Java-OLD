package Lec3;

import java.time.LocalTime;
import java.util.Arrays;
import java.util.Random;

/*
This is not final version
 */

public class Train {

    public Train(int id, Station[] stations, boolean isBack) {

        this.id = id;

        if(isBack) {
            this.stations = reverseStations(stations);
        }
        else {
            this.stations = stations;
        }

        Random random = new Random();
        availableSeats = 1+random.nextInt(100);
    }

    private int id;

    private Station[] stations;

    private int availableSeats;

    public int getId() {
        return id;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }

    public Station[] getStations() {
        return stations;
    }

    public int isNearestFromNow (String location) {

//        boolean result = false;
        int result = -1;
//        Station result = null;

//        for (Station station : stations) {
        for (int i=0; i<stations.length; i++) {

            if(location.equals(stations[i].getName())) {
//            if(location.equals(station.getName())) {

                if(stations[i].getDepartureTime().isAfter(LocalTime.now())) {
//                if(station.getDepartureTime().isAfter(LocalTime.now())) {
//                    result = true;
                    result = i;
//                    result = station;

//                    System.out.print(station.getName()+" ");
//                    System.out.print(station.getArrivalTime() + " ");
//                    System.out.println(station.getDepartureTime());
                }

            }

        }

        return result;
    }

    public boolean isAfterTime (LocalTime time) {
//        boolean result = false;

        return stations[0].getDepartureTime().isAfter(time);
/*
        for (Station station : stations) {
            if (station.getDepartureTime().isAfter(time)) {
                result = true;
                System.out.print(station.getName()+" ");
                System.out.println(station.getDepartureTime());
            }
        }
        return result;
*/
    }

    public boolean checkDestination (String from, String to) {

//        boolean isFrom=false, isTo=false, result = false;
        boolean result = false;
        int indexFrom=-1, indexTo=-1;

        for (int i=0; i<stations.length; i++) {

            if (stations[i].getName().equals(from)) {
//                isFrom = true;
                indexFrom = i;
            }

            if (stations[i].getName().equals(to)) {
//                isTo = true;
                indexTo = i;
            }

        }

//        if(isFrom && isTo) {
        if(indexFrom>-1 && indexTo>-1) {
            if (indexFrom<indexTo) {
                result = true;
            }
        }

        return result;
    }

    private Station[] reverseStations(Station[] stations) {

        Station[] reverse = new Station[stations.length];

        for (int i=0; i<reverse.length; i++) {
            Station station = stations[stations.length-1-i];
            reverse[i] = new Station(station.getName(), station.getArrivalTimeBack(), station.getDepartureTimeBack());
            station.setArrivalTimeBack(null);
            station.setDepartureTimeBack(null);
        }

        return reverse;
    }

    @Override
    public String toString() {
        return "Train{" +
                "id=" + id +
                ", stations=" + Arrays.toString(stations) +
                "\navailableSeats=" + availableSeats +
                '}'+"\n";
    }
}
