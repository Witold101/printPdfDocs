package lt.vistar;

import com.itextpdf.text.*;
import com.itextpdf.text.Font;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.*;
import lt.vistar.docs.Customer;
import lt.vistar.docs.PolecenieWyjazdu;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class RunApp {

    private static Customer getCustomer (String name, String address){
        return new Customer(name,address);
    }

    private static PolecenieWyjazdu getPolecenieWyjazdu(String number,Calendar date, String name, String lastName,
                                                        String position, Customer customer,
                                                 Calendar dateBegin, Calendar dateEnd, String carType){
        return new PolecenieWyjazdu(number, date,name,lastName, position, customer,dateBegin,dateEnd,carType);
    }

    public static void main(String[] args) throws IOException, DocumentException {

        Customer customer = getCustomer("PPO PP", "Dworcowa 25,47-100 Strzelce Opolskie");
        PolecenieWyjazdu polecenieWyjazdu = getPolecenieWyjazdu("03",
                        new GregorianCalendar(2022,2,20),
                        "Vitalij", "Vasylius","Dyrektor handlowy", customer,
                        new GregorianCalendar(2022,2,20),
                        new GregorianCalendar(2022,2,21),
                        "Samochód osobowy prywatny");
        BaseFont baseFont = BaseFont.createFont(BaseFont.TIMES_ROMAN,BaseFont.CP1250, BaseFont.EMBEDDED);
        Font font8 = new Font(baseFont,8,Font.NORMAL,BaseColor.BLACK);
        Font font10 = new Font(baseFont,10,Font.NORMAL,BaseColor.BLACK);
        Font font12Bold = new Font(baseFont,12,Font.BOLD,BaseColor.BLACK);
//---------------------------------------------------------------
        PdfPTable table = new PdfPTable(2);

        PdfPCell cell1 = new PdfPCell(new Paragraph(""));
        cell1.setFixedHeight(18f);
        cell1.setBorder(0);

        PdfPCell cell2 = new PdfPCell(new Paragraph("STWIERDZENIE POBYTU SŁUŻBOWEGO", font10));
        cell2.setHorizontalAlignment(Element.ALIGN_CENTER);
        cell2.setVerticalAlignment(Element.ALIGN_CENTER);
        table.addCell(cell1);
        table.addCell(cell2);
//-------------------------------------------------------------------
        cell1 = new PdfPCell(new Paragraph("Pieszątka wysyłającego", font8));
        cell1.setFixedHeight(35f);
        cell1.setBorder(0);
        cell1.setHorizontalAlignment(Element.ALIGN_CENTER);
        cell1.setVerticalAlignment(Element.ALIGN_BOTTOM);

        cell2 = new PdfPCell(new Paragraph(""));
        cell2.setHorizontalAlignment(Element.ALIGN_CENTER);
        cell2.setVerticalAlignment(Element.ALIGN_CENTER);
        cell2.disableBorderSide(Rectangle.BOTTOM);
        table.addCell(cell1);
        table.addCell(cell2);
//---------------------
        cell1 = new PdfPCell(new Paragraph("POLECENIE WYJAZDU SŁUŻBOWEGO Nr "+polecenieWyjazdu.getNumber(),
                                            font12Bold));
        cell1.setHorizontalAlignment(Element.ALIGN_CENTER);
        cell1.setFixedHeight(45f);
        cell1.disableBorderSide(Rectangle.BOTTOM);

        cell2 = new PdfPCell(new Paragraph(""));
        cell2.disableBorderSide(Rectangle.BOTTOM);
        cell2.disableBorderSide(Rectangle.TOP);
        table.addCell(cell1);
        table.addCell(cell2);
//---------------------
        cell1 = new PdfPCell(new Paragraph("z dnia "+polecenieWyjazdu.getDate().get(Calendar.DATE)
                + "/"+ polecenieWyjazdu.getDate().get(Calendar.MONTH)+"/"+
                polecenieWyjazdu.getDate().get(Calendar.YEAR),font10));
        cell1.setHorizontalAlignment(Element.ALIGN_CENTER);
        cell1.setFixedHeight(45f);
        cell1.disableBorderSide(Rectangle.BOTTOM);
        cell1.disableBorderSide(Rectangle.TOP);

        cell2 = new PdfPCell(new Paragraph(""));
        cell2.disableBorderSide(Rectangle.BOTTOM);
        cell2.disableBorderSide(Rectangle.TOP);
        table.addCell(cell1);
        table.addCell(cell2);
//---------------------
        cell1 = new PdfPCell(new Paragraph("dla:",font10));
        cell1.disableBorderSide(Rectangle.BOTTOM);
        cell1.disableBorderSide(Rectangle.TOP);
        cell2 = new PdfPCell(new Paragraph(""));
        cell2.disableBorderSide(Rectangle.BOTTOM);
        cell2.disableBorderSide(Rectangle.TOP);
        table.addCell(cell1);
        table.addCell(cell2);
//-------------------------
        cell1 = new PdfPCell(new Paragraph(polecenieWyjazdu.getName()+" "+polecenieWyjazdu.getLastName(),
                font10));
        cell1.disableBorderSide(Rectangle.BOTTOM);
        cell1.disableBorderSide(Rectangle.TOP);
        cell2 = new PdfPCell(new Paragraph(""));
        cell2.disableBorderSide(Rectangle.BOTTOM);
        cell2.disableBorderSide(Rectangle.TOP);
        table.addCell(cell1);
        table.addCell(cell2);
//-------------------------
        cell1 = new PdfPCell(new Paragraph(polecenieWyjazdu.getPosition(),font10));
        cell1.disableBorderSide(Rectangle.BOTTOM);
        cell1.disableBorderSide(Rectangle.TOP);
        cell2 = new PdfPCell(new Paragraph(""));
        cell2.disableBorderSide(Rectangle.BOTTOM);
        cell2.disableBorderSide(Rectangle.TOP);
        table.addCell(cell1);
        table.addCell(cell2);
//--------------------------
        cell1 = new PdfPCell(new Paragraph(" ",font10));
        cell1.disableBorderSide(Rectangle.BOTTOM);
        cell1.disableBorderSide(Rectangle.TOP);
        cell2 = new PdfPCell(new Paragraph(""));
        cell2.disableBorderSide(Rectangle.BOTTOM);
        cell2.disableBorderSide(Rectangle.TOP);
        table.addCell(cell1);
        table.addCell(cell2);
//-------------------------
        cell1 = new PdfPCell(new Paragraph("do:",font10));
        cell1.disableBorderSide(Rectangle.BOTTOM);
        cell1.disableBorderSide(Rectangle.TOP);
        cell2 = new PdfPCell(new Paragraph(""));
        cell2.disableBorderSide(Rectangle.BOTTOM);
        cell2.disableBorderSide(Rectangle.TOP);
        table.addCell(cell1);
        table.addCell(cell2);
//-------------------------
        cell1 = new PdfPCell(new Paragraph(polecenieWyjazdu.getCustomer().getName(),font10));
        cell1.disableBorderSide(Rectangle.BOTTOM);
        cell1.disableBorderSide(Rectangle.TOP);
        cell2 = new PdfPCell(new Paragraph(""));
        cell2.disableBorderSide(Rectangle.BOTTOM);
        cell2.disableBorderSide(Rectangle.TOP);
        table.addCell(cell1);
        table.addCell(cell2);
//-------------------------
        cell1 = new PdfPCell(new Paragraph(polecenieWyjazdu.getCustomer().getAddress(),font10));
        cell1.disableBorderSide(Rectangle.BOTTOM);
        cell1.disableBorderSide(Rectangle.TOP);
        cell2 = new PdfPCell(new Paragraph(""));
        cell2.disableBorderSide(Rectangle.BOTTOM);
        cell2.disableBorderSide(Rectangle.TOP);
        table.addCell(cell1);
        table.addCell(cell2);
//-------------------------
        cell1 = new PdfPCell(new Paragraph(" ",font10));
        cell1.disableBorderSide(Rectangle.BOTTOM);
        cell1.disableBorderSide(Rectangle.TOP);
        cell2 = new PdfPCell(new Paragraph(""));
        cell2.disableBorderSide(Rectangle.BOTTOM);
        cell2.disableBorderSide(Rectangle.TOP);
        table.addCell(cell1);
        table.addCell(cell2);
//-------------------------
        cell1 = new PdfPCell(new Paragraph("Na czas od ",font10));
        cell1.disableBorderSide(Rectangle.BOTTOM);
        cell1.disableBorderSide(Rectangle.TOP);
        cell2 = new PdfPCell(new Paragraph(""));
        cell2.disableBorderSide(Rectangle.BOTTOM);
        cell2.disableBorderSide(Rectangle.TOP);
        table.addCell(cell1);
        table.addCell(cell2);
//-------------------------
        cell1 = new PdfPCell(new Paragraph(polecenieWyjazdu.getDateBegin().get(Calendar.DATE)
                + "/"+ polecenieWyjazdu.getDateBegin().get(Calendar.MONTH)+"/"+
                polecenieWyjazdu.getDateBegin().get(Calendar.YEAR),font10));
        cell1.disableBorderSide(Rectangle.BOTTOM);
        cell1.disableBorderSide(Rectangle.TOP);
        cell2 = new PdfPCell(new Paragraph(""));
        cell2.disableBorderSide(Rectangle.BOTTOM);
        cell2.disableBorderSide(Rectangle.TOP);
        table.addCell(cell1);
        table.addCell(cell2);
//-------------------------
        cell1 = new PdfPCell(new Paragraph(" ",font10));
        cell1.disableBorderSide(Rectangle.BOTTOM);
        cell1.disableBorderSide(Rectangle.TOP);
        cell2 = new PdfPCell(new Paragraph(""));
        cell2.disableBorderSide(Rectangle.BOTTOM);
        cell2.disableBorderSide(Rectangle.TOP);
        table.addCell(cell1);
        table.addCell(cell2);
//-------------------------
        cell1 = new PdfPCell(new Paragraph("Do ",font10));
        cell1.disableBorderSide(Rectangle.BOTTOM);
        cell1.disableBorderSide(Rectangle.TOP);
        cell2 = new PdfPCell(new Paragraph(""));
        cell2.disableBorderSide(Rectangle.BOTTOM);
        cell2.disableBorderSide(Rectangle.TOP);
        table.addCell(cell1);
        table.addCell(cell2);
//-------------------------
        cell1 = new PdfPCell(new Paragraph(polecenieWyjazdu.getDateEnd().get(Calendar.DATE)
                + "/"+ polecenieWyjazdu.getDateEnd().get(Calendar.MONTH)+"/"+
                polecenieWyjazdu.getDateEnd().get(Calendar.YEAR),font10));
        cell1.disableBorderSide(Rectangle.BOTTOM);
        cell1.disableBorderSide(Rectangle.TOP);
        cell2 = new PdfPCell(new Paragraph(""));
        cell2.disableBorderSide(Rectangle.BOTTOM);
        cell2.disableBorderSide(Rectangle.TOP);
        table.addCell(cell1);
        table.addCell(cell2);
//-------------------------
        cell1 = new PdfPCell(new Paragraph(  " ",font10));
        cell1.disableBorderSide(Rectangle.BOTTOM);
        cell1.disableBorderSide(Rectangle.TOP);
        cell2 = new PdfPCell(new Paragraph(""));
        cell2.disableBorderSide(Rectangle.BOTTOM);
        cell2.disableBorderSide(Rectangle.TOP);
        table.addCell(cell1);
        table.addCell(cell2);
//-------------------------
        cell1 = new PdfPCell(new Paragraph("w celu",font10));
        cell1.disableBorderSide(Rectangle.BOTTOM);
        cell1.disableBorderSide(Rectangle.TOP);
        cell2 = new PdfPCell(new Paragraph(""));
        cell2.disableBorderSide(Rectangle.BOTTOM);
        cell2.disableBorderSide(Rectangle.TOP);
        table.addCell(cell1);
        table.addCell(cell2);
//-------------------------
        cell1 = new PdfPCell(new Paragraph("W sprawie dostaw materiałów na buty",font10));
        cell1.disableBorderSide(Rectangle.BOTTOM);
        cell1.disableBorderSide(Rectangle.TOP);
        cell2 = new PdfPCell(new Paragraph(""));
        cell2.disableBorderSide(Rectangle.BOTTOM);
        cell2.disableBorderSide(Rectangle.TOP);
        table.addCell(cell1);
        table.addCell(cell2);
//-------------------------
        cell1 = new PdfPCell(new Paragraph(" ",font10));
        cell1.disableBorderSide(Rectangle.TOP);
        cell2 = new PdfPCell(new Paragraph(""));
        cell2.disableBorderSide(Rectangle.BOTTOM);
        cell2.disableBorderSide(Rectangle.TOP);
        table.addCell(cell1);
        table.addCell(cell2);
//-------------------------
        cell1 = new PdfPCell(new Paragraph("środki lokomocji",font10));
        cell1.disableBorderSide(Rectangle.TOP);
        cell1.disableBorderSide(Rectangle.BOTTOM);
        cell2 = new PdfPCell(new Paragraph(""));
        cell2.disableBorderSide(Rectangle.BOTTOM);
        cell2.disableBorderSide(Rectangle.TOP);
        table.addCell(cell1);
        table.addCell(cell2);
//-------------------------
        cell1 = new PdfPCell(new Paragraph(polecenieWyjazdu.getCarType(),font10));
        cell1.disableBorderSide(Rectangle.TOP);
        cell1.disableBorderSide(Rectangle.BOTTOM);
        cell2 = new PdfPCell(new Paragraph(""));
        cell2.disableBorderSide(Rectangle.BOTTOM);
        cell2.disableBorderSide(Rectangle.TOP);
        table.addCell(cell1);
        table.addCell(cell2);
//---------------------------------------
        cell1 = new PdfPCell(new Paragraph(" ",font10));
        cell1.disableBorderSide(Rectangle.TOP);
        cell2 = new PdfPCell(new Paragraph(""));
        cell2.disableBorderSide(Rectangle.BOTTOM);
        cell2.disableBorderSide(Rectangle.TOP);
        table.addCell(cell1);
        table.addCell(cell2);
//----------------------------------------------------------
        cell1 = new PdfPCell(new Paragraph(" ",font10));
        cell1.disableBorderSide(Rectangle.TOP);
        cell1.disableBorderSide(Rectangle.BOTTOM);
        cell2 = new PdfPCell(new Paragraph(""));
        cell2.disableBorderSide(Rectangle.BOTTOM);
        cell2.disableBorderSide(Rectangle.TOP);
        table.addCell(cell1);
        table.addCell(cell2);
//----------------------------------------------------------
        cell1 = new PdfPCell(new Paragraph("   "+polecenieWyjazdu.getDate().get(Calendar.DATE)+"/"+
                polecenieWyjazdu.getDate().get(Calendar.MONTH)+"/"+polecenieWyjazdu.getDate().get(Calendar.YEAR)+
                "        "+"__________________" ,font10));
        cell1.disableBorderSide(Rectangle.TOP);
        cell1.disableBorderSide(Rectangle.BOTTOM);
        cell2 = new PdfPCell(new Paragraph(""));
        cell2.disableBorderSide(Rectangle.BOTTOM);
        cell2.disableBorderSide(Rectangle.TOP);
        table.addCell(cell1);
        table.addCell(cell2);
//----------------------------------------------------------
        cell1 = new PdfPCell(new Paragraph("        data                     podpis wysyłającego",font8));
        cell1.disableBorderSide(Rectangle.TOP);
        cell1.disableBorderSide(Rectangle.BOTTOM);
        cell2 = new PdfPCell(new Paragraph(""));
        cell2.disableBorderSide(Rectangle.BOTTOM);
        cell2.disableBorderSide(Rectangle.TOP);
        table.addCell(cell1);
        table.addCell(cell2);
//-----------------------------------------------------------------------------
        cell1 = new PdfPCell(new Paragraph(" ",font10));
        cell1.disableBorderSide(Rectangle.TOP);
        cell2 = new PdfPCell(new Paragraph(""));
        cell2.disableBorderSide(Rectangle.TOP);
        table.addCell(cell1);
        table.addCell(cell2);
//-----------------------------------------------------------------------------
        Document document = new Document();
        PdfWriter.getInstance(document, new FileOutputStream("d:/iTextHelloWorld.pdf"));
        document.open();

        Paragraph paragraph1 = new Paragraph();
        paragraph1.add(new Chunk("Proszę o wypłacenie zaliczki w kwocie zł .................śłownie............." +
                ".................................................................. \n"
                ,font10));
        paragraph1.add(new Chunk(".............................................................................." +
                "................................................................................................. \n"
                ,font10));
        paragraph1.add(new Chunk("na pokrycie wydatków zgodnie z poleceniem wyjazdu służbowego nr.............\n"
                ,font10));

        Paragraph paragraph2 = new Paragraph();
        paragraph2.setAlignment(Element.ALIGN_RIGHT);
        paragraph2.add(new Chunk("...........................                            \n"
                ,font10));
        paragraph2.add(new Chunk(" ",font10));
        paragraph2.add(new Chunk("Podpis delegowanego                                 \n"
                ,font8));

        Paragraph paragraph3 = new Paragraph();
        paragraph3.setAlignment(Element.ALIGN_LEFT);
        paragraph3.add(new Chunk("Zatwierdzono na zł ..................... słownie zł ............................." +
                "..............................................................\n"
                ,font10));
        paragraph3.add(new Chunk("do wypłaty z sum .............................. \n \n \n",font10));
//-----------------------------------------------------------------------------
        PdfPTable table2 = new PdfPTable(2);
        PdfPTable table2_1 = new PdfPTable(5);
        PdfPTable table2_2 = new PdfPTable(3);

        PdfPCell cell1_1 = new PdfPCell(new Paragraph("Część",font8));
        cell1_1.setHorizontalAlignment(Element.ALIGN_CENTER);
        PdfPCell cell1_2 = new PdfPCell(new Paragraph("Dział",font8));
        cell1_2.setHorizontalAlignment(Element.ALIGN_CENTER);
        PdfPCell cell1_3 = new PdfPCell(new Paragraph("Rozdiał",font8));
        cell1_3.setHorizontalAlignment(Element.ALIGN_CENTER);
        PdfPCell cell1_4 = new PdfPCell(new Paragraph("Pr.",font8));
        cell1_4.setHorizontalAlignment(Element.ALIGN_CENTER);
        PdfPCell cell1_5 = new PdfPCell(new Paragraph("Poz.",font8));
        cell1_5.setHorizontalAlignment(Element.ALIGN_CENTER);

        table2_1.addCell(cell1_1);
        table2_1.addCell(cell1_2);
        table2_1.addCell(cell1_3);
        table2_1.addCell(cell1_4);
        table2_1.addCell(cell1_5);

        cell1_1 = new PdfPCell(new Paragraph(" "));
        cell1_1.setFixedHeight(25f);
        cell1_2 = new PdfPCell(new Paragraph(" "));
        cell1_3 = new PdfPCell(new Paragraph(" "));
        cell1_4 = new PdfPCell(new Paragraph(" "));
        cell1_5 = new PdfPCell(new Paragraph(" "));

        table2_1.addCell(cell1_1);
        table2_1.addCell(cell1_2);
        table2_1.addCell(cell1_3);
        table2_1.addCell(cell1_4);
        table2_1.addCell(cell1_5);

        PdfPCell cell2_1 = new PdfPCell(new Paragraph("Konto",font8));
        cell2_1.setColspan(2);
        cell2_1.setHorizontalAlignment(Element.ALIGN_CENTER);
        PdfPCell cell2_3 = new PdfPCell(new Paragraph("Nr dowodu",font8));
        cell2_3.setHorizontalAlignment(Element.ALIGN_CENTER);
        cell2_3.setRowspan(2);

        table2_2.addCell(cell2_1);
        table2_2.addCell(cell2_3);

        cell2_1 = new PdfPCell(new Paragraph("Wn",font8));
        cell2_1.setHorizontalAlignment(Element.ALIGN_CENTER);
        cell2_1.setFixedHeight(25f);
        PdfPCell cell2_2 = new PdfPCell(new Paragraph("Ma",font8));
        cell2_2.setHorizontalAlignment(Element.ALIGN_CENTER);
        cell2_2.setFixedHeight(25f);

        table2_2.addCell(cell2_1);
        table2_2.addCell(cell2_2);

        cell2_1 = new PdfPCell(new Paragraph(" "));
        cell2_1.setFixedHeight(25f);
        cell2_2 = new PdfPCell(new Paragraph(" "));
        cell2_2.setFixedHeight(25f);
        cell2_3 = new PdfPCell(new Paragraph(" "));
        cell2_3.setFixedHeight(25f);

        table2_2.addCell(cell2_1);
        table2_2.addCell(cell2_2);
        table2_2.addCell(cell2_3);

        PdfPCell cellTable2 = new PdfPCell(table2_1);
        cellTable2.setBorder(0);
        cellTable2.setPadding(3);
        table2.addCell(cellTable2);

        PdfPCell cellTable1 = new PdfPCell(table2_2);
        cellTable1.setBorder(0);
        cellTable1.setPadding(3);
        table2.addCell(cellTable1);

        cell2.setHorizontalAlignment(Element.ALIGN_CENTER);
        cell2.setVerticalAlignment(Element.ALIGN_CENTER);
        table.addCell(cell1);
        table.addCell(cell2);

        Paragraph paragraph4 = new Paragraph();
        paragraph4.setAlignment(Element.ALIGN_RIGHT);
        paragraph4.add(new Chunk("\n \n ........................          ................................." +
                "     \n",font10));
        paragraph4.add(new Chunk("data                           podpisy sprawdzających        \n",font8));

//=============================================================================
        document.add(table);
        document.add(paragraph1);
        document.add(paragraph2);
        document.add(paragraph3);
        document.add(table2);
        document.add(paragraph4);
//=============================================================================
        document.close();
    }
}
