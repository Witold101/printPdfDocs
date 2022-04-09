package lt.vistar;

import com.itextpdf.text.*;
import lt.vistar.docs.*;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class RunApp {

    public static BigDecimal FACTOR = new BigDecimal(0.8358);

    public static void main(String[] args) throws IOException, DocumentException {
        //------------------------------------
        String TARGET = "Do biura i ksęgową";
   //     String TARGET = "W sprawie dostaw materiałów na buty";
   //     String TARGET = "Rozmowy o warunkach sprzedaży";
   //     String TARGET = "";

        //-------------------------------------

        ListTrasa listTrasa = new ListTrasa();
        listTrasa.buildList(new Trasa("Bydgoszcz", new GregorianCalendar(2022, Calendar.MARCH, 15,
                10, 30), "Pionki", new GregorianCalendar(2022, Calendar.MARCH, 15,
                14, 50), 374));
        listTrasa.buildList(new Trasa("Pionki", new GregorianCalendar(2022, Calendar.MARCH, 16,
                12, 30), "Bydgoszcz", new GregorianCalendar(2022, Calendar.MARCH, 16,
                16, 40), 374));
//        listTrasa.buildList(new Trasa("Bydgoszcz", new GregorianCalendar(2022, Calendar.FEBRUARY, 01,
//                14, 30), "Wiskitki", new GregorianCalendar(2022, Calendar.FEBRUARY, 01,
//                17, 30), 235));
//        listTrasa.buildList(new Trasa("Wiskitki", new GregorianCalendar(2022, Calendar.FEBRUARY, 02,
//                8, 30), "Łuków", new GregorianCalendar(2022, Calendar.FEBRUARY, 02,
//                10, 40), 170));
//        listTrasa.buildList(new Trasa("Łuków", new GregorianCalendar(2022, Calendar.FEBRUARY, 02,
//                12, 00), "Bydgoszcz", new GregorianCalendar(2022, Calendar.FEBRUARY, 02,
//                16, 50), 410));
        Customer customer = new Customer("SPOŁEM PSS", "Pl.Konstytucji 3-go Maja 8,26-670 Pionki");
        PolecenieWyjazdu polecenieWyjazdu = new PolecenieWyjazdu("04",
                new GregorianCalendar(2022, Calendar.MARCH, 15),
                "Vitalij", "Vasylius", "Dyrektor handlowy", customer,
                new GregorianCalendar(2022, Calendar.MARCH, 15),
                new GregorianCalendar(2022, Calendar.MARCH, 16),
                "Samochód osobowy prywatny Subaru Forester 81-08PX-7",TARGET,
                new BigDecimal(0.0).setScale(2, RoundingMode.HALF_UP), listTrasa);

        new PDFpw(polecenieWyjazdu);
    }
}
