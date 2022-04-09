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
        ListTrasa listTrasa = new ListTrasa();
        listTrasa.buildList(new Trasa("Bydgoszcz", new GregorianCalendar(2022, Calendar.FEBRUARY, 01,
                14, 30), "Wiskitki", new GregorianCalendar(2022, Calendar.FEBRUARY, 01,
                17, 30), 235));
        listTrasa.buildList(new Trasa("Wiskitki", new GregorianCalendar(2022, Calendar.FEBRUARY, 02,
                8, 30), "Łuków", new GregorianCalendar(2022, Calendar.FEBRUARY, 02,
                10, 40), 170));
        listTrasa.buildList(new Trasa("Łuków", new GregorianCalendar(2022, Calendar.FEBRUARY, 02,
                12, 00), "Bydgoszcz", new GregorianCalendar(2022, Calendar.FEBRUARY, 02,
                16, 50), 410));
        Customer customer = new Customer("PPO PP", "Dworcowa 25,47-100 Strzelce Opolskie");
        PolecenieWyjazdu polecenieWyjazdu = new PolecenieWyjazdu("03",
                new GregorianCalendar(2022, Calendar.MARCH, 20),
                "Vitalij", "Vasylius", "Dyrektor handlowy", customer,
                new GregorianCalendar(2022, Calendar.MARCH, 20),
                new GregorianCalendar(2022, 2, 21),
                "Samochód osobowy prywatny", new BigDecimal(142.04)
                        .setScale(2, RoundingMode.HALF_UP), listTrasa);

        new PDFpw(polecenieWyjazdu);
    }
}
