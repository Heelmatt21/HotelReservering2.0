package DesignPatterns.StructuralPattern.AdapterPattern;


public class HotelLelydorpWerknemersAdapter extends Werknemers {

    private HotelLelydorpWerknemers hotelLelydorpWerknemers ;

    public HotelLelydorpWerknemersAdapter(HotelLelydorpWerknemers hotelLelydorpWerknemers) {
        this.hotelLelydorpWerknemers = hotelLelydorpWerknemers;
    }

    @Override
    public Integer getId() {
        return hotelLelydorpWerknemers.getIdn();
    }

    @Override
    public String getFamilienaam() {
        return hotelLelydorpWerknemers.getfNaam();
    }

    @Override
    public String getVoornaam() {
        return hotelLelydorpWerknemers.getvNaam();
    }

    @Override
    public String getAdres() {
        return hotelLelydorpWerknemers.getAdress();
    }
    @Override
    public Integer getTelefoonnummer() {
        return hotelLelydorpWerknemers.getTnummer();
    }

    @Override
    public String toString()
    {
        return "HotelLelydorpWerknemersAdapter{" +
                "hotelLelydorpWerknemeres=" + hotelLelydorpWerknemers +
                '}';
    }

}
