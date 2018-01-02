package Lec3;

import java.time.LocalTime;
import java.util.Random;

/*
This is not final version
 */

public class Train {

    public Train(int id, Station[] stations) {
        this.id = id;
        this.stations = stations;

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

    public boolean isNearestFromNow (String location) {

        boolean result = false;

        for (Station station : stations) {

            if(location.equals(station.getName())) {

                if(station.getDepartureTime().isAfter(LocalTime.now())) {
                    result = true;

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
}
