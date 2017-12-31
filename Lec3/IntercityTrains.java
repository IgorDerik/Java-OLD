package Trains;

import java.util.ArrayList;

public class IntercityTrains {

    /*
        Experimental version, to be redone
        This is real schedule, more trains to be added
    */

    public static ArrayList<Train> trains = new ArrayList<>();

    //
    public static void main(String...arg) {
        for (int i=0; i<9; i++) {
            for (int j=0; j<2; j++) {
                System.out.print(train711[j][i] + " ");
            }
            System.out.println();
        }
    }
    //

    static String[][] train711 = {
            {
                    "Kostiantynivka",
                    "Druzhkivka",
                    "Kramatorsk",
                    "Sloviansk",
                    "Lozova",
                    "Poltava-Kyivska",
                    "Myrhorod",
                    "Darnytsia",
                    "Kyiv"
            },
            {
                    "16:28",
                    "16:40-16:41",
                    "16:48-16:50",
                    "16:59-17:01",
                    "17:58-18:00",
                    "19:48-19:50",
                    "20:46-20:47",
                    "22:42-22:44",
                    "22:58",
            }
    };

    String[][] stations705 = {

            {
                    "Kyiv",
                    "Sviatoshyn",
                    "Korosten",
                    "Pidzamche",
                    "Lviv",
                    "Pshemysl"
            },

            {
                    "06:00",
                    "06:14-06:15",
                    "07:34-07:35",
                    "10:56-10:57",
                    "11:06-11:18",
                    "12:25"
            }
    };


}
