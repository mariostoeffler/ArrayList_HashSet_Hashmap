package Wasserstand;

import java.util.ArrayList;

public class WasserstandManager {

    private ArrayList<Wasserstand> liste;

    public WasserstandManager(ArrayList<Wasserstand> liste) {
        this.liste = liste;
    }

    public void add(Wasserstand Wasserstandadd) {
        liste.add(Wasserstandadd);
    }

    public Wasserstand findById(int id) {
        for (Wasserstand w : liste) {
            if (w.getId() == id)
                return w;
        }
        return null;
    }

    public ArrayList<Wasserstand> findAllByGewaesser(String gewaesserName) {
        ArrayList<Wasserstand> result = new ArrayList<Wasserstand>();
        for (Wasserstand w : liste) {
            if (w.getGewaesserName().equals(gewaesserName))
                result.add(w);
        }
        return result;
    }

    public Wasserstand findLastWasserstand(String gewaesserName) {
        int maxZeitpunkt = 0;
        for (Wasserstand w : liste) {
            if (w.getGewaesserName().equals(gewaesserName)) {
                if (w.getZeitpunkt() > maxZeitpunkt) {
                    maxZeitpunkt = w.getZeitpunkt();
                }
            }

        }

    }
}
