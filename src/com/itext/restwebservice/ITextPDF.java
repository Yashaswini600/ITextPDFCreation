package com.itext.restwebservice;
import java.io.FileOutputStream;
import java.io.IOException;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.GrayColor;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

public class ITextPDF {
	
public boolean pdfCreate(String dest) throws DocumentException, IOException{
	 Document document = new Document();
	 //PDF creation
     PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(dest));
     writer.setPdfVersion(PdfWriter.VERSION_1_7);
     //Open Document
     document.open();
     // Adding Table 1 to the Document
     PdfPTable table1 = new PdfPTable(3);
     table1.setSpacingBefore(5f);
     table1.setSpacingAfter(30f);
     table1.getDefaultCell().setBackgroundColor(new GrayColor(0.75f));
     table1.addCell("NAME");
     table1.getDefaultCell().setBackgroundColor(new GrayColor(0.75f));
     table1.addCell("PHONE NUMBER");
     table1.getDefaultCell().setBackgroundColor(new GrayColor(0.75f));
     table1.addCell("EMAIL ID");
     table1.getDefaultCell().setBackgroundColor(GrayColor.GRAYWHITE);
     table1.addCell("Yashaswini");
     table1.getDefaultCell().setBackgroundColor(GrayColor.GRAYWHITE);
     table1.addCell("0123456789");
     table1.getDefaultCell().setBackgroundColor(GrayColor.GRAYWHITE);
     table1.addCell("Xyz@gmail.com");
     document.add(table1);
     //Adding Table 2 to the Document 
     PdfPTable table2 = new PdfPTable(1);
     table2.setSpacingBefore(5f);
     table2.setSpacingAfter(30f);
     table2.getDefaultCell().setBackgroundColor(new GrayColor(0.75f));
     table2.addCell("ADDRESS");
     table2.getDefaultCell().setBackgroundColor(GrayColor.GRAYWHITE);
     table2.addCell("000 St, ZipCode, State, Country");
     document.add(table2);
     // Closing Document
     document.close();
	return true;
	
}
}
