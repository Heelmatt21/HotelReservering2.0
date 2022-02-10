package App;

import Config.JPAConfiguration;
import Dao.KlantenDao;
import DesignPatterns.BehavioralPattern.ChainOfResponsibility.*;
import DesignPatterns.CreationalPattern.BuilderPattern.*;
import DesignPatterns.StructuralPattern.AdapterPattern.*;
import Entities.Klanten;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {

        JPAConfiguration.getEntityManager();
        KlantenDao klantenDAO = new KlantenDao(JPAConfiguration.getEntityManager());

        //select All
        //List<Klanten> klantenList = klantenDAO.retrieveKlantenList();
        //klantenList.stream().forEach(System.out::println);
    /*for(Klanten klanten : klantenList){
      System.out.println(klanten);
    }*/

        //Insert
        /*Klanten klanten = Klanten.builder().familienaam("Stark").voornaam("Tony").adres("Javaweg 3").distrikt("Wanica").land("Suriname").telefoonnummer(8578987).build();
        Klanten savedKlanten = klantenDAO.insert(klanten);
        System.out.println(savedKlanten);

        //Update
         */
        /*Klanten foundKlanten = klantenDAO.findByKlandId(1);  //select where
        foundKlanten.setAdres("Domineestraat 21");
        int updatedRecords = klantenDAO.updateKlanten(foundKlanten);
        System.out.println(updatedRecords);
        System.out.println(foundKlanten);*/

        //Delete
        /*Klanten foundDeletedKlanten = klantenDAO.findByKlandId(18);
        int totalRecordsDeleted = klantenDAO.delete(18);
        System.out.println(totalRecordsDeleted);
        System.out.println(foundDeletedKlanten);

        JPAConfiguration.shutdown();*/

        //Builder
        /*HotelEmployee hotelEmployee = new HotelEmployee();
        System.out.println("Hotelmedewerker: Welke kamer zou u willen hebben?");

        KamerBuilder budgetKamer = new BudgetKamer();
        KamerBuilder economieKamer = new EcnonomyKamer();
        KamerBuilder deluxeKamer = new DeluxeKamer();

        System.out.println("Parker Peter: Budget kamer");
        System.out.println("Stark Tony: Economie kamer");
        System.out.println("Nick Fury: Deluxe kamer");

        hotelEmployee.setKamerBuilder(budgetKamer);
        hotelEmployee.constructKamer();
        Kamer kamer1 = hotelEmployee.getKamer();
        System.out.println("\n Hier is uw kamer meneer Parker: \n- Comfort:" + kamer1.getComfort() +
                "\n- Features: " + kamer1.getFeatures());

        hotelEmployee.setKamerBuilder(economieKamer);
        hotelEmployee.constructKamer();
        Kamer kamer2 = hotelEmployee.getKamer();
        System.out.println("\n Hier is uw kamer meneer Stark: \n- Comfort:" + kamer2.getComfort() +
                "\n- Features: " + kamer2.getFeatures());

        hotelEmployee.setKamerBuilder(deluxeKamer);
        hotelEmployee.constructKamer();
        Kamer kamer3 = hotelEmployee.getKamer();
        System.out.println("\n Hier is uw kamer mevrouw Romanoff: \n- Comfort:" + kamer3.getComfort() +
                "\n- Features: " + kamer3.getFeatures());*/

        //Facade
        /*AircoFacade aircoFacade = new AircoFacade();

        aircoFacade.turnOnAirco("On");
        aircoFacade.turnOffAirco();*/

        //ChainOfResponsibility

        /*Database database = new Database();
        Handler handler = new ReservationExistHandler(database)
                .setNextHandler(new ValidDateHandler(database))
                .setNextHandler((new ReservationCheckHandler()));
        AuthenticationServices service = new AuthenticationServices(handler);

        service.CheckReservation("Stark Tony", "01-03-2022");*/

        //Adapter
        /*List<Werknemers> werknemersList = getAllWerknemers();
        System.out.println(werknemersList);
    }
        private static List<Werknemers> getAllWerknemers()
        {
            List<Werknemers> allWerknemers = new ArrayList<>();
            DatabaseWerknemers databaseWerknemers = new DatabaseWerknemers(
                    12,
                    "Ventura",
                    "Ace",
                    "Tamansarieweg 101",
                    8755872);
            allWerknemers.add(databaseWerknemers);*/

            // creating HotelLelydorpWerknemers
            /*HotelLelydorpWerknemers hotelLelydorpWerknemers = new HotelLelydorpWerknemers(
                    14,
                    "Vader",
                    "Darth",
                    "Javaweg 344",
                    8274599);
            allWerknemers.add(new HotelLelydorpWerknemersAdapter(hotelLelydorpWerknemers));

            // creating HotelNoordWerknemers
            HotelNoordWerknemers hotelNoordWerknemers = new HotelNoordWerknemers(
                    1,
                    "Bond",
                    "James",
                    "Wilhelminastraat 7",
                    8678784);
            allWerknemers.add(new HotelNoordWerknemersAdapter(hotelNoordWerknemers));


            return allWerknemers;*/




        }
}
