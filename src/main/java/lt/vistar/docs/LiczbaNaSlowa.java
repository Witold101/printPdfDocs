package lt.vistar.docs;

import java.io.Console;

/**
 * Zamiana liczby na slowa
 * www.algorytm.org
 * (c)2005 Tomasz Lubinski
 */

public class LiczbaNaSlowa {

    private static String jednosci[] = {"", " jeden", " dwa", " trzy", " cztery", " piec", " szesc", " siedem", " osiem", " dziewiec"};
    private static String nascie[] = {"dziesiec", " jedenascie", " dwanascie", " trzynascie", " czternascie", " pietnascie", " szesnascie", " siedemnascie", " osiemnascie", " dziewietnascie"};
    private static String dziesiatki[] ={"", " dziesiec", " dwadziescia", " trzydziesci", " czterdziesci", " piecdziesiat", " szescdziesiat", " siedemdziesiat", " osiemdziesiat", " dziewiecdziesiat"};
    private static String setki[] = {"", " sto", " dwiescie", " trzysta", " czterysta", " piecset", " szescset", " siedemset", " osiemset", " dziewiecset"};
    private static String x[] = {"", " tys.", " mln.", " mld.", " bln.", " bld."};

    private int liczba;
    private String rezult;

    public LiczbaNaSlowa(int liczba) {
        this.liczba = liczba;
        this.rezult = convert(liczba);
    }

    public String getRezult() {
        return rezult;
    }

    private String convert(int liczba) {
        String slownie = " ";
        int koncowka;
        int rzad = 0;
        int j = 0;
        int minus = 0;

        if (liczba<0)
        {
            minus=1;
            liczba=-liczba;
        }

        if (liczba==0) slownie="zero";

        while (liczba>0)
        {
            koncowka=(liczba%10);
            liczba/=10;
            if ((j==0)&&(liczba%100!=0 || koncowka !=0)) slownie = x[rzad] + slownie;
            if ((j==0)&&(liczba%10!=1)) slownie = jednosci[koncowka] + slownie;
            if ((j==0)&&(liczba%10==1))
            {
                slownie = nascie[koncowka] + slownie;
                liczba/=10;
                j+=2;
                continue;
            }
            if (j==1) slownie = dziesiatki[koncowka] + slownie;
            if (j==2)
            {
                slownie = setki[koncowka] + slownie;
                j=-1;
                rzad++;
            }
            j++;
        }
        if (minus==1) slownie = "minus" + slownie;
        return slownie;
    }
}

