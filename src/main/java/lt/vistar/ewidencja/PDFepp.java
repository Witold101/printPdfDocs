package lt.vistar.ewidencja;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.*;
import lt.vistar.docs.PolecenieWyjazdu;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PDFepp {

    Car car = new Car("Samochód osobowy prywatny","Subaru Forester",
            "81-08PX-7","2498 cm3");
    String name = "Vitalij Vasylius";
    String address = "ul.Jana Pestalozziego 2/32,\n 85-095, Bydgoszcz";
    String month = "Marzec";
    String rock = "2022";
    List<PolecenieWyjazdu> list = new ArrayList<>();

    public PDFepp(
            //String name, String address,String month, String rock, Car car, List<PolecenieWyjazdu> list
    ) throws IOException, DocumentException {

        BaseFont baseFont = BaseFont.createFont(BaseFont.TIMES_ROMAN, BaseFont.CP1250, BaseFont.EMBEDDED);
        Font font6 = new Font(baseFont, 6, Font.NORMAL, BaseColor.BLACK);
        Font font8 = new Font(baseFont, 8, Font.NORMAL, BaseColor.BLACK);
        Font font10 = new Font(baseFont, 10, Font.NORMAL, BaseColor.BLACK);
        Font font12Bold = new Font(baseFont, 12, Font.BOLD, BaseColor.BLACK);
//---------------------------------------------------------------------------------------------
        Document document = new Document(PageSize.A4,30,20,20,20);
        PdfWriter.getInstance(document, new FileOutputStream("d:/epp.pdf"));
        document.open();
        document.getPageSize();


        Element blanc = new Paragraph(" ");
        Element mumerRejestrac = new Paragraph("Numer rejestracyjny pojazdu: "+car.getNumber(),font10);
        Element poemnosc = new Paragraph("Pojemność silnika: "+car.getEngine(),font10);
        Anchor stamp = new Anchor("Dane podatnika (lub pieczątka)",font6);
        Element employ = new Paragraph(name+"\n"+address, font10);
        Paragraph title = new Paragraph("EWEDENCJA PRZEBIEGU POJAZDU",font12Bold);
        Paragraph monthText = new Paragraph("za miesiąc "+month+" "+rock,font10);

        PdfPCell cell1_1 = new PdfPCell(new Paragraph("Nr\nkolejny\nwpisu",font6));
        cell1_1.setHorizontalAlignment(Element.ALIGN_CENTER);
        cell1_1.setVerticalAlignment(Element.ALIGN_MIDDLE);

        PdfPCell cell2_1 = new PdfPCell(new Paragraph("Data\nwyjazdu",font6));
        cell2_1.setHorizontalAlignment(Element.ALIGN_CENTER);
        cell2_1.setVerticalAlignment(Element.ALIGN_MIDDLE);

        PdfPCell cell3_1 = new PdfPCell(new Paragraph("Opis trasy\nwyjazdu\n(skąd-dokąd)",font6));
        cell3_1.setHorizontalAlignment(Element.ALIGN_CENTER);
        cell3_1.setVerticalAlignment(Element.ALIGN_MIDDLE);

        PdfPCell cell4_1 = new PdfPCell(new Paragraph("Cel wyjazdu",font6));
        cell4_1.setHorizontalAlignment(Element.ALIGN_CENTER);
        cell4_1.setVerticalAlignment(Element.ALIGN_MIDDLE);

        PdfPCell cell5_1 = new PdfPCell(new Paragraph("liszba\nfaktycznie\nprzejechanych\nkilometrów",font6));
        cell5_1.setHorizontalAlignment(Element.ALIGN_CENTER);
        cell5_1.setVerticalAlignment(Element.ALIGN_MIDDLE);

        PdfPCell cell6_1 = new PdfPCell(new Paragraph("Stawka za\n1 km\nprzebiegu",font6));
        cell6_1.setHorizontalAlignment(Element.ALIGN_CENTER);
        cell6_1.setVerticalAlignment(Element.ALIGN_MIDDLE);

        PdfPCell cell7_1 = new PdfPCell(new Paragraph("Wartość",font6));
        cell7_1.setHorizontalAlignment(Element.ALIGN_CENTER);
        cell7_1.setVerticalAlignment(Element.ALIGN_MIDDLE);

        PdfPCell cell8_1 = new PdfPCell(new Paragraph("Podpis\npodatnika",font6));
        cell8_1.setHorizontalAlignment(Element.ALIGN_CENTER);
        cell8_1.setVerticalAlignment(Element.ALIGN_MIDDLE);

        PdfPCell cell9_1 = new PdfPCell(new Paragraph("Uwagi",font6));
        cell9_1.setHorizontalAlignment(Element.ALIGN_CENTER);
        cell9_1.setVerticalAlignment(Element.ALIGN_MIDDLE);

        document.add(blanc);

        PdfDiv div = new PdfDiv();
        div.setPaddingLeft(300f);
        div.addElement(mumerRejestrac);
        document.add(div);

        document.add(stamp);

        div = new PdfDiv();
        div.setPaddingLeft(300f);
        div.addElement(poemnosc);
        document.add(div);

        document.add(employ);

        title.setAlignment(Element.ALIGN_CENTER);
        document.add(title);

        monthText.setAlignment(Element.ALIGN_CENTER);
        document.add(monthText);

        document.add(blanc);

        PdfPTable table = new PdfPTable(9);
        table.setTotalWidth(550);
        table.setWidths(new int[]{30, 60, 90, 90, 60, 50, 50, 60, 60});
        table.setLockedWidth(true);

        table.addCell(cell1_1);
        table.addCell(cell2_1);
        table.addCell(cell3_1);
        table.addCell(cell4_1);
        table.addCell(cell5_1);
        table.addCell(cell6_1);
        table.addCell(cell7_1);
        table.addCell(cell8_1);
        table.addCell(cell9_1);
        document.add(table);

//=============================================================================
        document.close();

    }
}
