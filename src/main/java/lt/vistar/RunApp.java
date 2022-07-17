package lt.vistar;

import com.itextpdf.text.*;
import lt.vistar.docs.*;
import lt.vistar.ewidencja.Car;
import lt.vistar.ewidencja.PDFepp;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

public class RunApp {

    public static BigDecimal FACTOR = new BigDecimal(0.8358);

    public static void main(String[] args) throws IOException, DocumentException {
        //------------------------------------
        Car car = new Car(
                "Samochód osobowy prywatny",
                "Subaru Forester",
                "81-08PX-7",
                "2498 cm3");

        //     String TARGET ="Do biura i ksęgową";
        //     String TARGET = "W sprawie dostaw materiałów na buty";
        //     String TARGET = "Rozmowy o warunkach sprzedaży podnosków";
        //     String TARGET = "Razmowy o składie celnym, dowóz dokumentów";
        //     String TARGET = "Kontrola towaru na składie celnym";
        //     String TARGET = "Międzynarodowe Targi Poznańskie SAWO";
             String TARGET = "Szkolienie";


        // ------------------------------------------------------------------------------------------------------

        ListTrasa listTrasa = new ListTrasa();

        listTrasa.buildList(new Trasa("Bydgoszcz", new GregorianCalendar(2022, Calendar.JUNE, 7,
                15, 30), "Łódź", new GregorianCalendar(2022, Calendar.JUNE, 7,
                18, 20), 220));
        listTrasa.buildList(new Trasa("Łódź", new GregorianCalendar(2022, Calendar.JUNE, 8,
                8, 00), "Łask", new GregorianCalendar(2022, Calendar.JUNE, 8,
                8, 30), 30));
        listTrasa.buildList(new Trasa("Łask", new GregorianCalendar(2022, Calendar.JUNE, 8,
                17, 00), "Łódź", new GregorianCalendar(2022, Calendar.JUNE, 8,
                17, 30), 30));
        listTrasa.buildList(new Trasa("Łódź", new GregorianCalendar(2022, Calendar.JUNE, 9,
                8, 00), "Łask", new GregorianCalendar(2022, Calendar.JUNE, 9,
                8, 30), 30));
        listTrasa.buildList(new Trasa("Łask", new GregorianCalendar(2022, Calendar.JUNE, 9,
                16, 00), "Bydgoszcz", new GregorianCalendar(2022, Calendar.JUNE, 9,
                19, 10), 260));


//        listTrasa.buildList(new Trasa("Bydgoszcz", new GregorianCalendar(2022, Calendar.APRIL, 26,
//                10, 00), "Poznań", new GregorianCalendar(2022, Calendar.APRIL, 26,
//                12, 00), 140));
//        listTrasa.buildList(new Trasa("Poznań", new GregorianCalendar(2022, Calendar.APRIL, 26,
//                16, 00), "Bydgoszcz", new GregorianCalendar(2022, Calendar.APRIL, 26,
//                17, 50), 140));

//        listTrasa.buildList(new Trasa("Bydgoszcz", new GregorianCalendar(2022, Calendar.APRIL, 18,
//                9, 00), "Gdynia", new GregorianCalendar(2022, Calendar.APRIL, 18,
//                12, 00), 210));
//        listTrasa.buildList(new Trasa("Gdynia", new GregorianCalendar(2022, Calendar.APRIL, 18,
//                14, 00), "Bydgoszcz", new GregorianCalendar(2022, Calendar.APRIL, 18,
//                17, 00), 210));

//        listTrasa.buildList(new Trasa("Bydgoszcz", new GregorianCalendar(2022, Calendar.APRIL, 06,
//                7, 00), "Lublin", new GregorianCalendar(2022, Calendar.APRIL, 06,
//                13, 20), 490));
//        listTrasa.buildList(new Trasa("Lublin", new GregorianCalendar(2022, Calendar.APRIL, 06,
//                15, 00), "Bydgoszcz", new GregorianCalendar(2022, Calendar.APRIL, 06,
//                20, 30), 490));

//        listTrasa.buildList(new Trasa("Bydgoszcz", new GregorianCalendar(2022, Calendar.MARCH, 8,
//                10, 30), "Pionki", new GregorianCalendar(2022, Calendar.MARCH, 15,
//                14, 50), 374));
//        listTrasa.buildList(new Trasa("Pionki", new GregorianCalendar(2022, Calendar.MARCH, 16,
//                12, 30), "Bydgoszcz", new GregorianCalendar(2022, Calendar.MARCH, 16,
//                16, 40), 374));
//        listTrasa.buildList(new Trasa(
//        "Bydgoszcz", new GregorianCalendar(2022, Calendar.FEBRUARY, 01, 14, 30),
//        "Wiskitki", new GregorianCalendar(2022, Calendar.FEBRUARY, 01, 17, 30), 235));
//        listTrasa.buildList(new Trasa(
//        "Wiskitki", new GregorianCalendar(2022, Calendar.FEBRUARY, 02, 8, 30),
//        "Łuków", new GregorianCalendar(2022, Calendar.FEBRUARY, 02, 10, 40), 170));
//        listTrasa.buildList(new Trasa(
//        "Łuków", new GregorianCalendar(2022, Calendar.FEBRUARY, 02, 12, 00),
//        "Bydgoszcz", new GregorianCalendar(2022, Calendar.FEBRUARY, 02, 16, 50), 410));

//----------------------------------------------------------------------------------------------------------------
//        Customer customer = new Customer(
//                "PROTEKTOR S.A.",
//                "ul. Vetterw 24a-24b " +
//                        "Lublin"
//        );

//        Customer customer = new Customer(
//                "Międzynarodowe Targi Poznańskie",
//                "ul. Glogowska 14 " +
//                        "Poznań"
//        );


        Customer customer = new Customer(
                "Eco Fire Salon Techniki Grzewczej i OZE",
                "Leśników Polskich 48, 98-100 Łask"
        );

//        Customer customer = new Customer(
//                "C.Hartwig Gdynia S.A.",
//                "ul. Handliowa 29 " +
//                        "Gdynia"
//        );
//        Customer customer = new Customer(
//                "SPOŁEM PSS",
//                "Pl.Konstytucji 3-go Maja 8," +
//                        "26-670 Pionki"
//        );

        PolecenieWyjazdu polecenieWyjazdu = new PolecenieWyjazdu(
                "08",
                new GregorianCalendar(
                        2022,
                        Calendar.JUNE,
                        7),
                "Vitalij",
                "Vasylius",
                "Dyrektor handlowy", customer,
                // Ot - Do
                new GregorianCalendar(
                        2022, Calendar.JUNE, 7),
                new GregorianCalendar(
                        2022, Calendar.JUNE, 9),
                car.getType() + " " + car.getBrand() + " " + car.getNumber(), TARGET,
                new BigDecimal(0.0).setScale(2, RoundingMode.HALF_UP), listTrasa);


        //-------------------------------------------------------------------------------------
        String name = "Vitalij Vasylius";
        String address = "ul.Jana Pestalozziego 2/32,\n 85-095, Bydgoszcz";
        String month = "Czerwiec";
        String rock = "2022";
        List<PolecenieWyjazdu> list = new ArrayList<>();
        list.add(polecenieWyjazdu);
        //-------------------------------------------------------------------------------------

        new PDFpw(polecenieWyjazdu);
        new PDFepp(name, address, month, rock, car, list);

    }
}
