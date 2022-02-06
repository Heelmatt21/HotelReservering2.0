package App;

import Config.JPAConfiguration;
import Dao.KlantenDao;
import DesignPatterns.BuilderPattern.*;
import DesignPatterns.StructuralPattern.Facade.AircoFacade;
import Entities.Klanten;

import java.util.List;

public class Application {
    public static void main(String[] args) {

        JPAConfiguration.getEntityManager();
        KlantenDao klantenDAO = new KlantenDao(JPAConfiguration.getEntityManager());

        //select All
        //List<Klanten> klantenList = klantenDAO.retrieveKlantenList();
        //klantenList.stream().forEach(System.out::println);
 /*   for(klanten klanten : klantenList){
      System.out.println(klanten);
    }*/

        //Insert
        /*Klanten klanten = Klanten.builder().familienaam("Stark").voornaam("Tony").adres("Javaweg 3").distrikt("Wanica").land("Suriname").telefoonnummer(8578987).build();
        Klanten savedKlanten = klantenDAO.insert(klanten);
        System.out.println(savedKlanten);*/

        //Update
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
        System.out.println("\n Hier is uw kamer meneer Fury: \n- Comfort:" + kamer3.getComfort() +
                "\n- Features: " + kamer3.getFeatures());*/

        //Facade
        AircoFacade aircoFacade = new AircoFacade();

        aircoFacade.turnOnAirco("On");
        aircoFacade.turnOffAirco();



    }
}
