package lt.vistar.docs;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Calendar;

public class PDFpw {


    public PDFpw(PolecenieWyjazdu pw) throws IOException, DocumentException {

        BaseFont baseFont = BaseFont.createFont(BaseFont.TIMES_ROMAN, BaseFont.CP1250, BaseFont.EMBEDDED);
        Font font6 = new Font(baseFont, 6, Font.NORMAL, BaseColor.BLACK);
        Font font8 = new Font(baseFont, 8, Font.NORMAL, BaseColor.BLACK);
        Font font10 = new Font(baseFont, 10, Font.NORMAL, BaseColor.BLACK);
        Font font12Bold = new Font(baseFont, 12, Font.BOLD, BaseColor.BLACK);
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
        cell1 = new PdfPCell(new Paragraph("POLECENIE WYJAZDU SŁUŻBOWEGO Nr " + pw.getNumber(),
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
        cell1 = new PdfPCell(new Paragraph("z dnia " + pw.getDate(), font10));
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
        cell1 = new PdfPCell(new Paragraph("dla:", font10));
        cell1.disableBorderSide(Rectangle.BOTTOM);
        cell1.disableBorderSide(Rectangle.TOP);
        cell2 = new PdfPCell(new Paragraph(""));
        cell2.disableBorderSide(Rectangle.BOTTOM);
        cell2.disableBorderSide(Rectangle.TOP);
        table.addCell(cell1);
        table.addCell(cell2);
//-------------------------
        cell1 = new PdfPCell(new Paragraph(pw.getName() + " " + pw.getLastName(),
                font10));
        cell1.disableBorderSide(Rectangle.BOTTOM);
        cell1.disableBorderSide(Rectangle.TOP);
        cell2 = new PdfPCell(new Paragraph(""));
        cell2.disableBorderSide(Rectangle.BOTTOM);
        cell2.disableBorderSide(Rectangle.TOP);
        table.addCell(cell1);
        table.addCell(cell2);
//-------------------------
        cell1 = new PdfPCell(new Paragraph(pw.getPosition(), font10));
        cell1.disableBorderSide(Rectangle.BOTTOM);
        cell1.disableBorderSide(Rectangle.TOP);
        cell2 = new PdfPCell(new Paragraph(""));
        cell2.disableBorderSide(Rectangle.BOTTOM);
        cell2.disableBorderSide(Rectangle.TOP);
        table.addCell(cell1);
        table.addCell(cell2);
//--------------------------
        cell1 = new PdfPCell(new Paragraph(" ", font10));
        cell1.disableBorderSide(Rectangle.BOTTOM);
        cell1.disableBorderSide(Rectangle.TOP);
        cell2 = new PdfPCell(new Paragraph(""));
        cell2.disableBorderSide(Rectangle.BOTTOM);
        cell2.disableBorderSide(Rectangle.TOP);
        table.addCell(cell1);
        table.addCell(cell2);
//-------------------------
        cell1 = new PdfPCell(new Paragraph("do:", font10));
        cell1.disableBorderSide(Rectangle.BOTTOM);
        cell1.disableBorderSide(Rectangle.TOP);
        cell2 = new PdfPCell(new Paragraph(""));
        cell2.disableBorderSide(Rectangle.BOTTOM);
        cell2.disableBorderSide(Rectangle.TOP);
        table.addCell(cell1);
        table.addCell(cell2);
//-------------------------
        cell1 = new PdfPCell(new Paragraph(pw.getCustomer().getName(), font10));
        cell1.disableBorderSide(Rectangle.BOTTOM);
        cell1.disableBorderSide(Rectangle.TOP);
        cell2 = new PdfPCell(new Paragraph(""));
        cell2.disableBorderSide(Rectangle.BOTTOM);
        cell2.disableBorderSide(Rectangle.TOP);
        table.addCell(cell1);
        table.addCell(cell2);
//-------------------------
        cell1 = new PdfPCell(new Paragraph(pw.getCustomer().getAddress(), font10));
        cell1.disableBorderSide(Rectangle.BOTTOM);
        cell1.disableBorderSide(Rectangle.TOP);
        cell2 = new PdfPCell(new Paragraph(""));
        cell2.disableBorderSide(Rectangle.BOTTOM);
        cell2.disableBorderSide(Rectangle.TOP);
        table.addCell(cell1);
        table.addCell(cell2);
//-------------------------
        cell1 = new PdfPCell(new Paragraph(" ", font10));
        cell1.disableBorderSide(Rectangle.BOTTOM);
        cell1.disableBorderSide(Rectangle.TOP);
        cell2 = new PdfPCell(new Paragraph(""));
        cell2.disableBorderSide(Rectangle.BOTTOM);
        cell2.disableBorderSide(Rectangle.TOP);
        table.addCell(cell1);
        table.addCell(cell2);
//-------------------------
        cell1 = new PdfPCell(new Paragraph("Na czas od ", font10));
        cell1.disableBorderSide(Rectangle.BOTTOM);
        cell1.disableBorderSide(Rectangle.TOP);
        cell2 = new PdfPCell(new Paragraph(""));
        cell2.disableBorderSide(Rectangle.BOTTOM);
        cell2.disableBorderSide(Rectangle.TOP);
        table.addCell(cell1);
        table.addCell(cell2);
//-------------------------
        cell1 = new PdfPCell(new Paragraph(pw.getDateBegin(), font10));
        cell1.disableBorderSide(Rectangle.BOTTOM);
        cell1.disableBorderSide(Rectangle.TOP);
        cell2 = new PdfPCell(new Paragraph(""));
        cell2.disableBorderSide(Rectangle.BOTTOM);
        cell2.disableBorderSide(Rectangle.TOP);
        table.addCell(cell1);
        table.addCell(cell2);
//-------------------------
        cell1 = new PdfPCell(new Paragraph(" ", font10));
        cell1.disableBorderSide(Rectangle.BOTTOM);
        cell1.disableBorderSide(Rectangle.TOP);
        cell2 = new PdfPCell(new Paragraph(""));
        cell2.disableBorderSide(Rectangle.BOTTOM);
        cell2.disableBorderSide(Rectangle.TOP);
        table.addCell(cell1);
        table.addCell(cell2);
//-------------------------
        cell1 = new PdfPCell(new Paragraph("Do ", font10));
        cell1.disableBorderSide(Rectangle.BOTTOM);
        cell1.disableBorderSide(Rectangle.TOP);
        cell2 = new PdfPCell(new Paragraph(""));
        cell2.disableBorderSide(Rectangle.BOTTOM);
        cell2.disableBorderSide(Rectangle.TOP);
        table.addCell(cell1);
        table.addCell(cell2);
//-------------------------
        cell1 = new PdfPCell(new Paragraph(pw.getDateEnd(), font10));
        cell1.disableBorderSide(Rectangle.BOTTOM);
        cell1.disableBorderSide(Rectangle.TOP);
        cell2 = new PdfPCell(new Paragraph(""));
        cell2.disableBorderSide(Rectangle.BOTTOM);
        cell2.disableBorderSide(Rectangle.TOP);
        table.addCell(cell1);
        table.addCell(cell2);
//-------------------------
        cell1 = new PdfPCell(new Paragraph(" ", font10));
        cell1.disableBorderSide(Rectangle.BOTTOM);
        cell1.disableBorderSide(Rectangle.TOP);
        cell2 = new PdfPCell(new Paragraph(""));
        cell2.disableBorderSide(Rectangle.BOTTOM);
        cell2.disableBorderSide(Rectangle.TOP);
        table.addCell(cell1);
        table.addCell(cell2);
//-------------------------
        cell1 = new PdfPCell(new Paragraph("w celu", font10));
        cell1.disableBorderSide(Rectangle.BOTTOM);
        cell1.disableBorderSide(Rectangle.TOP);
        cell2 = new PdfPCell(new Paragraph(""));
        cell2.disableBorderSide(Rectangle.BOTTOM);
        cell2.disableBorderSide(Rectangle.TOP);
        table.addCell(cell1);
        table.addCell(cell2);
//-------------------------
        cell1 = new PdfPCell(new Paragraph(pw.getTarget(), font10));
        cell1.disableBorderSide(Rectangle.BOTTOM);
        cell1.disableBorderSide(Rectangle.TOP);
        cell2 = new PdfPCell(new Paragraph(""));
        cell2.disableBorderSide(Rectangle.BOTTOM);
        cell2.disableBorderSide(Rectangle.TOP);
        table.addCell(cell1);
        table.addCell(cell2);
//-------------------------
        cell1 = new PdfPCell(new Paragraph(" ", font10));
        cell1.disableBorderSide(Rectangle.TOP);
        cell2 = new PdfPCell(new Paragraph(""));
        cell2.disableBorderSide(Rectangle.BOTTOM);
        cell2.disableBorderSide(Rectangle.TOP);
        table.addCell(cell1);
        table.addCell(cell2);
//-------------------------
        cell1 = new PdfPCell(new Paragraph("środki lokomocji", font10));
        cell1.disableBorderSide(Rectangle.TOP);
        cell1.disableBorderSide(Rectangle.BOTTOM);
        cell2 = new PdfPCell(new Paragraph(""));
        cell2.disableBorderSide(Rectangle.BOTTOM);
        cell2.disableBorderSide(Rectangle.TOP);
        table.addCell(cell1);
        table.addCell(cell2);
//-------------------------
        cell1 = new PdfPCell(new Paragraph(pw.getCarType(), font10));
        cell1.disableBorderSide(Rectangle.TOP);
        cell1.disableBorderSide(Rectangle.BOTTOM);
        cell2 = new PdfPCell(new Paragraph(""));
        cell2.disableBorderSide(Rectangle.BOTTOM);
        cell2.disableBorderSide(Rectangle.TOP);
        table.addCell(cell1);
        table.addCell(cell2);
//---------------------------------------
        cell1 = new PdfPCell(new Paragraph(" ", font10));
        cell1.disableBorderSide(Rectangle.TOP);
        cell2 = new PdfPCell(new Paragraph(""));
        cell2.disableBorderSide(Rectangle.BOTTOM);
        cell2.disableBorderSide(Rectangle.TOP);
        table.addCell(cell1);
        table.addCell(cell2);
//----------------------------------------------------------
        cell1 = new PdfPCell(new Paragraph(" ", font10));
        cell1.disableBorderSide(Rectangle.TOP);
        cell1.disableBorderSide(Rectangle.BOTTOM);
        cell2 = new PdfPCell(new Paragraph(""));
        cell2.disableBorderSide(Rectangle.BOTTOM);
        cell2.disableBorderSide(Rectangle.TOP);
        table.addCell(cell1);
        table.addCell(cell2);
//----------------------------------------------------------
        cell1 = new PdfPCell(new Paragraph("   " + pw.getDate() +
                "        " + "__________________", font10));
        cell1.disableBorderSide(Rectangle.TOP);
        cell1.disableBorderSide(Rectangle.BOTTOM);
        cell2 = new PdfPCell(new Paragraph(""));
        cell2.disableBorderSide(Rectangle.BOTTOM);
        cell2.disableBorderSide(Rectangle.TOP);
        table.addCell(cell1);
        table.addCell(cell2);
//----------------------------------------------------------
        cell1 = new PdfPCell(new Paragraph("        data                     podpis wysyłającego", font8));
        cell1.disableBorderSide(Rectangle.TOP);
        cell1.disableBorderSide(Rectangle.BOTTOM);
        cell2 = new PdfPCell(new Paragraph(""));
        cell2.disableBorderSide(Rectangle.BOTTOM);
        cell2.disableBorderSide(Rectangle.TOP);
        table.addCell(cell1);
        table.addCell(cell2);
//-----------------------------------------------------------------------------
        cell1 = new PdfPCell(new Paragraph(" ", font10));
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
                , font10));
        paragraph1.add(new Chunk(".............................................................................." +
                "................................................................................................. \n"
                , font10));
        paragraph1.add(new Chunk("na pokrycie wydatków zgodnie z poleceniem wyjazdu służbowego nr.............\n"
                , font10));

        Paragraph paragraph2 = new Paragraph();
        paragraph2.setAlignment(Element.ALIGN_RIGHT);
        paragraph2.add(new Chunk("...........................                            \n"
                , font10));
        paragraph2.add(new Chunk(" ", font10));
        paragraph2.add(new Chunk("Podpis delegowanego                                 \n"
                , font8));

        Paragraph paragraph3 = new Paragraph();
        paragraph3.setAlignment(Element.ALIGN_LEFT);
        paragraph3.add(new Chunk("Zatwierdzono na zł ..................... słownie zł ............................." +
                "..............................................................\n"
                , font10));
        paragraph3.add(new Chunk("do wypłaty z sum .............................. \n \n", font10));
        //-----------------------------------------------------------------------------
        PdfPTable table2 = new PdfPTable(2);
        PdfPTable table2_1 = new PdfPTable(5);
        PdfPTable table2_2 = new PdfPTable(3);

        PdfPCell cell1_1 = new PdfPCell(new Paragraph("Część", font8));
        cell1_1.setHorizontalAlignment(Element.ALIGN_CENTER);
        PdfPCell cell1_2 = new PdfPCell(new Paragraph("Dział", font8));
        cell1_2.setHorizontalAlignment(Element.ALIGN_CENTER);
        PdfPCell cell1_3 = new PdfPCell(new Paragraph("Rozdiał", font8));
        cell1_3.setHorizontalAlignment(Element.ALIGN_CENTER);
        PdfPCell cell1_4 = new PdfPCell(new Paragraph("Pr.", font8));
        cell1_4.setHorizontalAlignment(Element.ALIGN_CENTER);
        PdfPCell cell1_5 = new PdfPCell(new Paragraph("Poz.", font8));
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

        PdfPCell cell2_1 = new PdfPCell(new Paragraph("Konto", font8));
        cell2_1.setColspan(2);
        cell2_1.setHorizontalAlignment(Element.ALIGN_CENTER);
        PdfPCell cell2_3 = new PdfPCell(new Paragraph("Nr dowodu", font8));
        cell2_3.setHorizontalAlignment(Element.ALIGN_CENTER);
        cell2_3.setRowspan(2);

        table2_2.addCell(cell2_1);
        table2_2.addCell(cell2_3);

        cell2_1 = new PdfPCell(new Paragraph("Wn", font8));
        cell2_1.setHorizontalAlignment(Element.ALIGN_CENTER);
        cell2_1.setFixedHeight(25f);
        PdfPCell cell2_2 = new PdfPCell(new Paragraph("Ma", font8));
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
                "     \n", font10));
        paragraph4.add(new Chunk("data                           podpisy sprawdzających        \n", font8));

//=============================================================================
        document.add(table);
        document.add(paragraph1);
        document.add(paragraph2);
        document.add(paragraph3);
        document.add(table2);
        document.add(paragraph4);
//=============================================================================
        document.newPage();

        Paragraph title = new Paragraph("RACHUNEK KOSZTÓW PODRÓŻY \n \n", font12Bold);
        title.setAlignment(Element.ALIGN_CENTER);

        PdfPTable tableBackside = new PdfPTable(8);
        tableBackside.setWidths(new int[]{10, 10, 5, 10, 10, 5, 12, 12});

        PdfPCell cell_1Row_1 = new PdfPCell(new Paragraph("W Y J A Z D", font10));
        cell_1Row_1.setColspan(3);
        cell_1Row_1.setHorizontalAlignment(Element.ALIGN_CENTER);

        PdfPCell cell_2Row_1 = new PdfPCell(new Paragraph("P R Z Y J A Z D", font10));
        cell_2Row_1.setColspan(3);
        cell_2Row_1.setHorizontalAlignment(Element.ALIGN_CENTER);

        PdfPCell cell_3Row_1 = new PdfPCell(new Paragraph("Środki lokomacji", font8));
        cell_3Row_1.setRowspan(2);
        cell_3Row_1.setHorizontalAlignment(Element.ALIGN_CENTER);

        PdfPCell cell_4Row_1 = new PdfPCell(new Paragraph("Koszty przejazdu", font8));
        cell_4Row_1.setHorizontalAlignment(Element.ALIGN_CENTER);

        PdfPCell cell_1Row_2 = new PdfPCell(new Paragraph("miejscowość", font8));
        cell_1Row_2.setHorizontalAlignment(Element.ALIGN_CENTER);

        PdfPCell cell_2Row_2 = new PdfPCell(new Paragraph("data", font8));
        cell_2Row_2.setHorizontalAlignment(Element.ALIGN_CENTER);

        PdfPCell cell_3Row_2 = new PdfPCell(new Paragraph("godz.", font8));
        cell_3Row_2.setHorizontalAlignment(Element.ALIGN_CENTER);

        PdfPCell cell_8Row_2 = new PdfPCell(new Paragraph("zł i gr", font8));
        cell_8Row_2.setHorizontalAlignment(Element.ALIGN_CENTER);

        tableBackside.addCell(cell_1Row_1);
        tableBackside.addCell(cell_2Row_1);
        tableBackside.addCell(cell_3Row_1);
        tableBackside.addCell(cell_4Row_1);

        tableBackside.addCell(cell_1Row_2);
        tableBackside.addCell(cell_2Row_2);
        tableBackside.addCell(cell_3Row_2);
        tableBackside.addCell(cell_1Row_2);
        tableBackside.addCell(cell_2Row_2);
        tableBackside.addCell(cell_3Row_2);
        tableBackside.addCell(cell_8Row_2);

        for (Trasa t : pw.getListTrasa().getList()) {
            PdfPCell cell_1R = new PdfPCell(new Paragraph(t.getCityBegin(), font8));
            tableBackside.addCell(cell_1R);
            cell_1R = new PdfPCell(new Paragraph(t.getDateBegin(), font8));
            tableBackside.addCell(cell_1R);
            cell_1R = new PdfPCell(new Paragraph(t.getTimeBegin(), font8));
            tableBackside.addCell(cell_1R);
            cell_1R = new PdfPCell(new Paragraph(t.getCityEnd(), font8));
            tableBackside.addCell(cell_1R);
            cell_1R = new PdfPCell(new Paragraph(t.getDateEnd(), font8));
            tableBackside.addCell(cell_1R);
            cell_1R = new PdfPCell(new Paragraph(t.getTimeEnd(), font8));
            tableBackside.addCell(cell_1R);
            cell_1R = new PdfPCell(new Paragraph(pw.getCarType(), font8));
            tableBackside.addCell(cell_1R);
            cell_1R = new PdfPCell(new Paragraph(t.getCost() + "zł / " + t.getKm()
                    + "km", font8));
            tableBackside.addCell(cell_1R);
        }

        PdfPCell cell_1Row_4 = new PdfPCell(new Paragraph("Rachunek sprawdzono pod względem", font8));
        cell_1Row_4.setRowspan(2);
        cell_1Row_4.setColspan(4);
        cell_1Row_4.setHorizontalAlignment(Element.ALIGN_CENTER);

        PdfPCell cell_2Row_4 = new PdfPCell(new Paragraph("Ryczałty za dojazdy", font8));
        cell_2Row_4.setColspan(3);
        PdfPCell cell_3Row_4 = new PdfPCell(new Paragraph(" ", font8));

        PdfPCell cell_1Row_5 = new PdfPCell(new Paragraph("Dojazdy udokumentowane", font8));
        cell_1Row_5.setColspan(3);
        PdfPCell cell_2Row_5 = new PdfPCell(new Paragraph(" ", font8));

        PdfPCell cell_1Row_6 = new PdfPCell(new Paragraph("Merytorycznym", font8));
        cell_1Row_6.setRowspan(3);
        cell_1Row_6.setColspan(2);
        cell_1Row_6.setHorizontalAlignment(Element.ALIGN_CENTER);

        PdfPCell cell_2Row_6 = new PdfPCell(new Paragraph("Formalnym i rachunkowym", font8));
        cell_2Row_6.setRowspan(3);
        cell_2Row_6.setColspan(2);
        cell_2Row_6.setHorizontalAlignment(Element.ALIGN_CENTER);

        PdfPCell cell_3Row_6 = new PdfPCell(new Paragraph("Razem przejazdy, dojazdy", font8));
        cell_3Row_6.setColspan(3);
        PdfPCell cell_4Row_6 = new PdfPCell(new Paragraph(" ", font8));

        PdfPCell cell_1Row_7 = new PdfPCell(new Paragraph("Diety", font8));
        cell_1Row_7.setColspan(3);
        PdfPCell cell_2Row_7 = new PdfPCell(new Paragraph(" ", font8));

        PdfPCell cell_1Row_8 = new PdfPCell(new Paragraph("Noclegi wg rachunków", font8));
        cell_1Row_8.setColspan(3);
        PdfPCell cell_2Row_8 = new PdfPCell(new Paragraph(pw.getHotel() + "zł", font8));
        //------------
        PdfPCell cell_1Row_9 = new PdfPCell(new Paragraph("data            podpis", font6));
        cell_1Row_9.setRowspan(3);
        cell_1Row_9.setColspan(2);
        cell_1Row_9.setHorizontalAlignment(Element.ALIGN_CENTER);
        cell_1Row_9.setVerticalAlignment(Element.ALIGN_BOTTOM);

        PdfPCell cell_2Row_9 = new PdfPCell(new Paragraph("data            podpis", font6));
        cell_2Row_9.setRowspan(3);
        cell_2Row_9.setColspan(2);
        cell_2Row_9.setHorizontalAlignment(Element.ALIGN_CENTER);
        cell_2Row_9.setVerticalAlignment(Element.ALIGN_BOTTOM);

        PdfPCell cell_3Row_9 = new PdfPCell(new Paragraph("Noclegi - ryczałt", font8));
        cell_3Row_9.setColspan(3);
        PdfPCell cell_4Row_9 = new PdfPCell(new Paragraph(" ", font8));

        PdfPCell cell_1Row_10 = new PdfPCell(new Paragraph("Inne wydatki wg załączników", font8));
        cell_1Row_10.setColspan(3);
        PdfPCell cell_2Row_10 = new PdfPCell(new Paragraph(" ", font8));

        PdfPCell cell_1Row_11 = new PdfPCell(new Paragraph(" ", font8));
        cell_1Row_11.setColspan(3);
        cell_1Row_11.disableBorderSide(Rectangle.BOTTOM);
        PdfPCell cell_2Row_11 = new PdfPCell(new Paragraph(" ", font8));
        cell_2Row_11.disableBorderSide(Rectangle.BOTTOM);

        tableBackside.addCell(cell_1Row_4);
        tableBackside.addCell(cell_2Row_4);
        tableBackside.addCell(cell_3Row_4);
        tableBackside.addCell(cell_1Row_5);
        tableBackside.addCell(cell_2Row_5);
        tableBackside.addCell(cell_1Row_6);
        tableBackside.addCell(cell_2Row_6);
        tableBackside.addCell(cell_3Row_6);
        tableBackside.addCell(cell_4Row_6);
        tableBackside.addCell(cell_1Row_7);
        tableBackside.addCell(cell_2Row_7);
        tableBackside.addCell(cell_1Row_8);
        tableBackside.addCell(cell_2Row_8);
        tableBackside.addCell(cell_1Row_9);
        tableBackside.addCell(cell_2Row_9);
        tableBackside.addCell(cell_3Row_9);
        tableBackside.addCell(cell_4Row_9);
        tableBackside.addCell(cell_1Row_10);
        tableBackside.addCell(cell_2Row_10);
        tableBackside.addCell(cell_1Row_11);
        tableBackside.addCell(cell_2Row_11);

        PdfPCell cell_1Row_12 = new PdfPCell(new Paragraph("Zatwierdzono na zł ", font8));
        cell_1Row_12.setColspan(4);
        cell_1Row_12.setHorizontalAlignment(Element.ALIGN_CENTER);
        cell_1Row_12.disableBorderSide(Rectangle.BOTTOM);

        PdfPCell cell_2Row_12 = new PdfPCell(new Paragraph("Ogółem ", font8));
        cell_2Row_12.setColspan(3);
        cell_2Row_12.setHorizontalAlignment(Element.ALIGN_RIGHT);
        cell_2Row_12.disableBorderSide(Rectangle.TOP);
        cell_2Row_12.disableBorderSide(Rectangle.BOTTOM);

        String peopleArray = pw.getListTrasa().getCost().add(pw.getHotel())
                .toString();
        int beginStr = Integer.parseInt(peopleArray.substring(0, peopleArray.indexOf(".")));
        String endStr = peopleArray.substring(peopleArray.indexOf(".") + 1) + "/100";

        PdfPCell cell_3Row_12 = new PdfPCell(new Paragraph(peopleArray, font8));
        cell_3Row_12.setHorizontalAlignment(Element.ALIGN_CENTER);
        cell_3Row_12.disableBorderSide(Rectangle.TOP);
        cell_3Row_12.disableBorderSide(Rectangle.BOTTOM);

        PdfPCell cell_1Row_13 = new PdfPCell(new Paragraph("słownie", font8));
        cell_1Row_13.setColspan(4);
        cell_1Row_13.disableBorderSide(Rectangle.BOTTOM);
        cell_1Row_13.disableBorderSide(Rectangle.TOP);

        PdfPCell cell_2Row_13 = new PdfPCell(new Paragraph("Słownie złotych:", font8));
        cell_2Row_13.setColspan(3);
        cell_2Row_13.disableBorderSide(Rectangle.TOP);
        cell_2Row_13.disableBorderSide(Rectangle.BOTTOM);

        PdfPCell cell_3Row_13 = new PdfPCell(new Paragraph(" ", font8));
        cell_3Row_13.setHorizontalAlignment(Element.ALIGN_CENTER);
        cell_3Row_13.disableBorderSide(Rectangle.TOP);
        cell_3Row_13.disableBorderSide(Rectangle.BOTTOM);

        PdfPCell cell_1Row_14 = new PdfPCell(new Paragraph(new LiczbaNaSlowa(beginStr).getRezult() + " " + endStr, font8));
        cell_1Row_14.setColspan(4);
        cell_1Row_14.disableBorderSide(Rectangle.BOTTOM);
        cell_1Row_14.disableBorderSide(Rectangle.TOP);

        PdfPCell cell_2Row_14 = new PdfPCell(new Paragraph(new LiczbaNaSlowa(beginStr).getRezult() + " " + endStr, font8));
        cell_2Row_14.setColspan(3);
        cell_2Row_14.disableBorderSide(Rectangle.TOP);
        cell_2Row_14.disableBorderSide(Rectangle.BOTTOM);

        PdfPCell cell_3Row_14 = new PdfPCell(new Paragraph(" ", font8));
        cell_3Row_14.disableBorderSide(Rectangle.TOP);
        cell_3Row_14.disableBorderSide(Rectangle.BOTTOM);

        PdfPCell cell_1Row_15 = new PdfPCell(new Paragraph(" ", font8));
        cell_1Row_15.setColspan(4);
        cell_1Row_15.disableBorderSide(Rectangle.BOTTOM);
        cell_1Row_15.disableBorderSide(Rectangle.TOP);
        cell_1Row_15.setMinimumHeight(50f);

        PdfPCell cell_2Row_15 = new PdfPCell(new Paragraph(" ", font8));
        cell_2Row_15.setColspan(3);
        cell_2Row_15.disableBorderSide(Rectangle.TOP);
        cell_2Row_15.disableBorderSide(Rectangle.BOTTOM);

        PdfPCell cell_3Row_15 = new PdfPCell(new Paragraph(" ", font8));
        cell_3Row_15.disableBorderSide(Rectangle.TOP);
        cell_3Row_15.disableBorderSide(Rectangle.BOTTOM);

        PdfPCell cell_1Row_16 = new PdfPCell(new Paragraph("data                             podpisy zatwierdzających", font6));
        cell_1Row_16.setColspan(4);
        cell_1Row_16.disableBorderSide(Rectangle.BOTTOM);
        cell_1Row_16.disableBorderSide(Rectangle.TOP);
        cell_1Row_16.setHorizontalAlignment(Element.ALIGN_CENTER);

        PdfPCell cell_2Row_16 = new PdfPCell(new Paragraph(" ", font8));
        cell_2Row_16.setColspan(3);
        cell_2Row_16.disableBorderSide(Rectangle.TOP);

        PdfPCell cell_3Row_16 = new PdfPCell(new Paragraph(" ", font8));
        cell_3Row_16.disableBorderSide(Rectangle.TOP);
        //--
        PdfPCell cell_1Row_17 = new PdfPCell(new Paragraph("Kwituję odbiór zł - " +
                pw.getListTrasa().getCost().add(pw.getHotel()) + " zł - przelew", font8));
        cell_1Row_17.setColspan(4);
        cell_1Row_17.disableBorderSide(Rectangle.BOTTOM);
        cell_1Row_17.disableBorderSide(Rectangle.TOP);

        PdfPCell cell_2Row_17 = new PdfPCell(new Paragraph("Załączam", font8));
        cell_2Row_17.disableBorderSide(Rectangle.BOTTOM);

        PdfPCell cell_3Row_17 = new PdfPCell(new Paragraph("Pobrano zaliczkę", font8));
        cell_3Row_17.setColspan(2);

        PdfPCell cell_4Row_17 = new PdfPCell(new Paragraph("-------", font8));

        PdfPCell cell_1Row_18 = new PdfPCell(new Paragraph("Słownie zł: ", font8));
        cell_1Row_18.setColspan(4);
        cell_1Row_18.disableBorderSide(Rectangle.BOTTOM);
        cell_1Row_18.disableBorderSide(Rectangle.TOP);

        PdfPCell cell_2Row_18 = new PdfPCell(new Paragraph("dowodów", font6));
        cell_2Row_18.disableBorderSide(Rectangle.TOP);
        cell_2Row_18.setHorizontalAlignment(Element.ALIGN_CENTER);

        PdfPCell cell_3Row_18 = new PdfPCell(new Paragraph("Do wypłaty", font8));
        cell_3Row_18.setColspan(2);

        PdfPCell cell_4Row_18 = new PdfPCell(new Paragraph(pw.getListTrasa().getCost().add(pw.getHotel())
                + "zł", font8));

        PdfPCell cell_1Row_19 = new PdfPCell(new Paragraph(new LiczbaNaSlowa(beginStr).getRezult() + " " + endStr, font8));
        cell_1Row_19.setColspan(4);
        cell_1Row_19.disableBorderSide(Rectangle.BOTTOM);
        cell_1Row_19.disableBorderSide(Rectangle.TOP);

        PdfPCell cell_2Row_19 = new PdfPCell(new Paragraph("Ninejszy rachunek przedkładam", font8));
        cell_2Row_19.disableBorderSide(Rectangle.BOTTOM);
        cell_2Row_19.setColspan(4);

        PdfPCell cell_1Row_20 = new PdfPCell(new Paragraph("data                                      podpis", font6));
        cell_1Row_20.setColspan(4);
        cell_1Row_20.setMinimumHeight(35f);
        cell_1Row_20.setVerticalAlignment(Element.ALIGN_BOTTOM);
        cell_1Row_20.disableBorderSide(Rectangle.TOP);
        cell_1Row_20.setHorizontalAlignment(Element.ALIGN_CENTER);


        PdfPCell cell_2Row_20 = new PdfPCell(new Paragraph("data                                      podpis", font6));
        cell_2Row_20.disableBorderSide(Rectangle.TOP);
        cell_2Row_20.setColspan(4);
        cell_2Row_20.setVerticalAlignment(Element.ALIGN_BOTTOM);
        cell_2Row_20.setHorizontalAlignment(Element.ALIGN_CENTER);


        tableBackside.addCell(cell_1Row_12);
        tableBackside.addCell(cell_2Row_12);
        tableBackside.addCell(cell_3Row_12);
        tableBackside.addCell(cell_1Row_13);
        tableBackside.addCell(cell_2Row_13);
        tableBackside.addCell(cell_3Row_13);
        tableBackside.addCell(cell_1Row_14);
        tableBackside.addCell(cell_2Row_14);
        tableBackside.addCell(cell_3Row_14);
        tableBackside.addCell(cell_1Row_15);
        tableBackside.addCell(cell_2Row_15);
        tableBackside.addCell(cell_3Row_15);
        tableBackside.addCell(cell_1Row_16);
        tableBackside.addCell(cell_2Row_16);
        tableBackside.addCell(cell_3Row_16);
        tableBackside.addCell(cell_1Row_17);
        tableBackside.addCell(cell_2Row_17);
        tableBackside.addCell(cell_3Row_17);
        tableBackside.addCell(cell_4Row_17);
        tableBackside.addCell(cell_1Row_18);
        tableBackside.addCell(cell_2Row_18);
        tableBackside.addCell(cell_3Row_18);
        tableBackside.addCell(cell_4Row_18);
        tableBackside.addCell(cell_1Row_19);
        tableBackside.addCell(cell_2Row_19);
        tableBackside.addCell(cell_1Row_20);
        tableBackside.addCell(cell_2Row_20);

        document.add(title);
        document.add(tableBackside);

//=============================================================================
        document.close();
    }
}

