package Lec3;

import java.time.LocalTime;

/*
This is not all trains, more to be added soon
This is real schedule from intercity.uz.gov.ua
 */

public class InterTrains {

    private static Station stations719_720[] = {
            new Station("Kharkiv",null,LocalTime.of(5,51),LocalTime.of(23,33),null),
            new Station("Poltava-Kyivska",LocalTime.of(7,36),LocalTime.of(7,41),LocalTime.of(21,58),LocalTime.of(22,0)),
            new Station("Myrhorod",LocalTime.of(8,32),LocalTime.of(8,34),LocalTime.of(21,7),LocalTime.of(21,9)),
            new Station("Romodan",LocalTime.of(8,53),LocalTime.of(8,55),LocalTime.of(20,47),LocalTime.of(20,49)),
            new Station("Lubny",LocalTime.of(9,13),LocalTime.of(9,15),LocalTime.of(20,24),LocalTime.of(20,27)),
            new Station("Hrebinka",LocalTime.of(9,38),LocalTime.of(9,41),LocalTime.of(19,59),LocalTime.of(20,1)),
            new Station("Boryspil",LocalTime.of(10,34),LocalTime.of(10,35),LocalTime.of(19,5),LocalTime.of(19,6)),
            new Station("Darnytsia",LocalTime.of(10,50),LocalTime.of(10,52),LocalTime.of(18,49),LocalTime.of(18,51)),
            new Station("Kyiv",LocalTime.of(11,7),null,null,LocalTime.of(18,33))
    };

    private static Station stations711_712[] = {
            new Station("Kostiantynivka",null,LocalTime.of(16,28),LocalTime.of(12,44),null),
            new Station("Druzhkivka",LocalTime.of(16,40),LocalTime.of(16,41),LocalTime.of(12,33),LocalTime.of(12,34)),
            new Station("Kramatorsk",LocalTime.of(16,48),LocalTime.of(16,50),LocalTime.of(12,24),LocalTime.of(12,26)),
            new Station("Sloviansk",LocalTime.of(16,59),LocalTime.of(17,1),LocalTime.of(12,14),LocalTime.of(12,16)),
            new Station("Lozova",LocalTime.of(17,58),LocalTime.of(18,0),LocalTime.of(11,15),LocalTime.of(11,17)),
            new Station("Poltava-Kyivska",LocalTime.of(19,48),LocalTime.of(19,50),LocalTime.of(9,23),LocalTime.of(9,25)),
            new Station("Myrhorod",LocalTime.of(20,46),LocalTime.of(20,47),LocalTime.of(8,33),LocalTime.of(8,34)),
            new Station("Darnytsia",LocalTime.of(22,42),LocalTime.of(22,44),LocalTime.of(6,37),LocalTime.of(6,39)),
            new Station("Kyiv",LocalTime.of(22,58),null,null,LocalTime.of(6,20))
    };

    private static Station stations705_706[] = {
            new Station("Kyiv",null,LocalTime.of(6,0),LocalTime.of(23,53),null),
            new Station("Sviatoshyn",LocalTime.of(6,14),LocalTime.of(6,15),LocalTime.of(23,41),LocalTime.of(23,42)),
            new Station("Korosten",LocalTime.of(7,34),LocalTime.of(7,35),LocalTime.of(22,21),LocalTime.of(22,22)),
            new Station("Pidzamche",LocalTime.of(10,56),LocalTime.of(10,57),LocalTime.of(18,55),LocalTime.of(18,56)),
            new Station("Lviv",LocalTime.of(11,6),LocalTime.of(11,18),LocalTime.of(18,36),LocalTime.of(18,47)),
            new Station("Pshemysl",LocalTime.of(12,25),null,null,LocalTime.of(15,45))
    };

    public static Train trains[] = {
            new Train(711,stations711_712,false),
            new Train(712,stations711_712,true),
            new Train(705,stations705_706,false),
            new Train(706,stations705_706,true),
            new Train(719,stations719_720,false),
            new Train(720,stations719_720,true)
    };


}
