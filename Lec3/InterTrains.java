package Lec3;

import java.time.LocalTime;

/*
This is not final version
 */

public class InterTrains {

    private static Station stations711[] = {
            new Station("Kostiantynivka",LocalTime.of(0,0),LocalTime.of(16,28)),
            new Station("Druzhkivka",LocalTime.of(16,40),LocalTime.of(16,41)),
            new Station("Kramatorsk",LocalTime.of(16,48),LocalTime.of(16,50)),
            new Station("Sloviansk",LocalTime.of(16,59),LocalTime.of(17,1)),
            new Station("Lozova",LocalTime.of(17,58),LocalTime.of(18,0)),
            new Station("Poltava-Kyivska",LocalTime.of(19,48),LocalTime.of(19,50)),
            new Station("Myrhorod",LocalTime.of(20,46),LocalTime.of(20,47)),
            new Station("Darnytsia",LocalTime.of(22,42),LocalTime.of(22,44)),
            new Station("Kyiv",LocalTime.of(22,58),LocalTime.of(0,0))
    };

    private static Station stations705[] = {
            new Station("Kyiv",LocalTime.of(0,0),LocalTime.of(6,0)),
            new Station("Sviatoshyn",LocalTime.of(6,14),LocalTime.of(6,15)),
            new Station("Korosten",LocalTime.of(7,34),LocalTime.of(7,35)),
            new Station("Pidzamche",LocalTime.of(10,56),LocalTime.of(10,57)),
            new Station("Lviv",LocalTime.of(11,6),LocalTime.of(11,18)),
            new Station("Pshemysl",LocalTime.of(12,25),LocalTime.of(0,0))
    };

    public static Train trains[] = {
            new Train(711,stations711),
            new Train(705,stations705),
    };


}
