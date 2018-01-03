package Lec3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/*
Not final
 */

public class Main {

    public static void main(String...arg) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a departure city:");
        String cityFrom = reader.readLine();
        System.out.println("Enter an arrival city:");
        String cityTo = reader.readLine();
        System.out.println("Enter a time in HH:MM to get a list of trains go after that time:");
        String timeAfter = reader.readLine();
        DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_TIME;
        LocalTime time = LocalTime.parse(timeAfter,formatter);
        System.out.println("Enter a location you want to escape from:");
        String escapeLocation = reader.readLine();
        System.out.println("Ok, working for you...");

        for (Train train : InterTrains.trains) {
//            System.out.println(train.toString());
            if(train.checkDestination(cityFrom,cityTo)) {
                System.out.println(train.getId()+" Is good to get from "+cityFrom+" to "+cityTo);
            }

            if(train.isAfterTime(time)) {
                System.out.println(train.getId()+" goes after "+time);
            }

//            int eStationIndex = train.isNearestFromNow(escapeLocation);
            if(train.isNearestFromNow(escapeLocation)>-1) {
                System.out.println("We found a train "+train.getId());
                System.out.println("Available seats: "+train.getAvailableSeats());

//                Station eStation = train.getStations()[eStationIndex];
//                System.out.print(eStation.getName()+" ");
//                System.out.print(eStation.getArrivalTime() + " ");
//                System.out.println(eStation.getDepartureTime());
            }
        }




    }

}
