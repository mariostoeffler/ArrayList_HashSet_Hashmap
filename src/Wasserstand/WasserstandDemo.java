package Wasserstand;

import java.util.ArrayList;

public class WasserstandDemo {

    public static void main(String[] args) {

        Wasserstand wasserstand1 = new Wasserstand(1, "Mur", 23, 14, 894551);
        Wasserstand wasserstand5 = new Wasserstand(2, "Mur", 23, 14, 8945561);
        Wasserstand wasserstand2 = new Wasserstand(3, "Donau", 24, 14, 394551);
        Wasserstand wasserstand3 = new Wasserstand(4, "Mur", 52, 14, 194551);
        Wasserstand wasserstand4 = new Wasserstand(5, "Mur", 76, 14, 89451);

        ArrayList<Wasserstand> wasserstandArrayList = new ArrayList<Wasserstand>();

        WasserstandManager wasserstandManager1 = new WasserstandManager(wasserstandArrayList);

        wasserstandArrayList.add(wasserstand1);
        wasserstandArrayList.add(wasserstand2);
        wasserstandArrayList.add(wasserstand3);
        wasserstandArrayList.add(wasserstand4);
        wasserstandArrayList.add(wasserstand5);

        System.out.println(wasserstandManager1.findLastWasserstand("Mur"));

    }

}
