package DesignPatterns.StructuralPattern.AdapterPattern;

public class HotelNoordWerknemersAdapter extends Werknemers{

    private HotelNoordWerknemers hotelNoordWerknemers;

    public HotelNoordWerknemersAdapter(HotelNoordWerknemers hotelNoordWerknemers) {
        this.hotelNoordWerknemers = hotelNoordWerknemers;
    }

    @Override
    public Integer getId() {
        return hotelNoordWerknemers.getIds();
    }

    @Override
    public String getFamilienaam() {
        return hotelNoordWerknemers.getFamnaam();
    }

    @Override
    public String getVoornaam() {
        return hotelNoordWerknemers.getVonaam();
    }

    @Override
    public String getAdres() {
        return hotelNoordWerknemers.getStraat();
    }

    @Override
    public Integer getTelefoonnummer() {
        return hotelNoordWerknemers.getTelenummer();
    }

    @Override
    public String toString()
    {
        return "HotelNoordWerknemersAdapter{" +
                "hotelNoordWerknemers=" + hotelNoordWerknemers +
                '}';
    }


}
