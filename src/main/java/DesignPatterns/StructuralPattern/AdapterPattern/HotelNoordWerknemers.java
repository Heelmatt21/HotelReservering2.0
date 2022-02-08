package DesignPatterns.StructuralPattern.AdapterPattern;

public class HotelNoordWerknemers {

    private Integer ids;
    private String famnaam;
    private String vonaam;
    private String straat;
    private Integer telenummer;

    public HotelNoordWerknemers(Integer ids, String famnaam, String vonaam, String straat, Integer telenummer)
    {
        this.ids = ids;
        this.famnaam = famnaam;
        this.vonaam = vonaam;
        this.straat = straat;
        this.telenummer = telenummer;
    }

    public Integer getIds() {
        return ids;
    }

    public void setIds(Integer ids) {
        this.ids = ids;
    }

    public String getFamnaam() {
        return famnaam;
    }

    public void setFamnaam(String famnaam) {
        this.famnaam = famnaam;
    }

    public String getVonaam() {
        return vonaam;
    }

    public void setVonaam(String vonaam) {
        this.vonaam = vonaam;
    }

    public String getStraat() {
        return straat;
    }

    public void setStraat(String straat) {
        this.straat = straat;
    }

    public Integer getTelenummer() {
        return telenummer;
    }

    public void setTelenummer(Integer telenummer) {
        this.telenummer = telenummer;
    }

    @Override
    public String toString()
    {
        return "HotelNoordWerknemers{" +
                "id=" + ids +
                ", familienaam='" + famnaam + '\'' +
                ", voornaam='" + vonaam + '\'' +
                ", adres='" + straat + '\'' +
                ", telefoonnummer='" + telenummer + '\'' +
                '}';
    }
}
