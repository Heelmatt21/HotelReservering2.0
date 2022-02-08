package DesignPatterns.StructuralPattern.AdapterPattern;

public class DatabaseWerknemers extends Werknemers{
    private Integer id;
    private String familienaam;
    private String voornaam;
    private String adres;
    private Integer telefoonnummer;

    public DatabaseWerknemers(Integer id, String familienaam, String voornaam, String adres, Integer telefoonnummer)
    {
        this.id = id;
        this.familienaam = familienaam;
        this.voornaam = voornaam;
        this.adres = adres;
        this.telefoonnummer = telefoonnummer;
    }

    @Override
    public Integer getId() {
        return this.id;
    }

    @Override
    public String getFamilienaam() {
        return this.familienaam;
    }

    @Override
    public String getVoornaam() {
        return this.voornaam;
    }

    @Override
    public String getAdres() {
        return this.adres;
    }
    @Override
    public Integer getTelefoonnummer() {
        return this.telefoonnummer;
    }

    @Override
    public String toString()
    {
        return "DatabaseWerknemers{" +
                "id=" + id +
                ", familienaam='" + familienaam + '\'' +
                ", voornaam='" + voornaam + '\'' +
                ", adres='" + adres + '\'' +
                ", telefoonnummer=' "+ telefoonnummer + '\'' +
                '}';
    }
}