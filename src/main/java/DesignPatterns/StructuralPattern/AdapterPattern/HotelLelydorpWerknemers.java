package DesignPatterns.StructuralPattern.AdapterPattern;

public class HotelLelydorpWerknemers {
    private Integer idn;
    private String fNaam;
    private String vNaam;
    private String adress;
    private Integer Tnummer;

    public HotelLelydorpWerknemers(Integer idn, String fNaam, String vNaam, String adress, Integer Tnummer)
    {
        this.idn = idn;
        this.fNaam = fNaam;
        this.vNaam = vNaam;
        this.adress = adress;
        this.Tnummer = Tnummer;
    }

    public Integer getIdn() {
        return idn;
    }

    public void setIdn(Integer idn) {
        this.idn = idn;
    }

    public String getfNaam() {
        return fNaam;
    }

    public void setfNaam(String fNaam) {
        this.fNaam = fNaam;
    }

    public String getvNaam() {
        return vNaam;
    }

    public void setvNaam(String vNaam) {
        this.vNaam = vNaam;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public Integer getTnummer() {
        return Tnummer;
    }

    public void setTnummer(Integer tnummer) {
        Tnummer = tnummer;
    }

    @Override
    public String toString()
    {
        return "HotelLelydorpWerknemers{" +
                "id=" + idn +
                ", familienaam='" + fNaam + '\'' +
                ", voornaam='" + vNaam + '\'' +
                ", adres='" + adress + '\'' +
                ", telefoonnummer='" + Tnummer + '\'' +
                '}';
    }
}

