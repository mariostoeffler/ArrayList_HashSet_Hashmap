package Wasserstand;

public class Wasserstand {

    private int Id;
    private String GewaesserName;
    private double messWert;
    private double messWertFuerAlamierung;
    private int Zeitpunkt;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getGewaesserName() {
        return GewaesserName;
    }

    public void setGewaesserName(String gewaesserName) {
        GewaesserName = gewaesserName;
    }

    public double getMessWert() {
        return messWert;
    }

    public void setMessWert(double messWert) {
        this.messWert = messWert;
    }

    public double getMessWertFuerAlamierung() {
        return messWertFuerAlamierung;
    }

    public void setMessWertFuerAlamierung(double messWertFuerAlamierung) {
        this.messWertFuerAlamierung = messWertFuerAlamierung;
    }

    public int getZeitpunkt() {
        return Zeitpunkt;
    }

    public void setZeitpunkt(int zeitpunkt) {
        Zeitpunkt = zeitpunkt;
    }

    @Override
    public String toString() {
        return "Wasserstand{" +
                "Id=" + Id +
                ", GewaesserName='" + GewaesserName + '\'' +
                ", messWert=" + messWert +
                ", messWertFuerAlamierung=" + messWertFuerAlamierung +
                ", Zeitpunkt=" + Zeitpunkt +
                '}';
    }

    public Wasserstand(int id, String gewaesserName, double messWert, double messWertFuerAlamierung, int zeitpunkt) {
        Id = id;
        GewaesserName = gewaesserName;
        this.messWert = messWert;
        this.messWertFuerAlamierung = messWertFuerAlamierung;
        Zeitpunkt = zeitpunkt;
    }

    public Wasserstand() {
    }
}
