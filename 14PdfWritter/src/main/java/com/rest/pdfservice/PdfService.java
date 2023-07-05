package com.rest.pdfservice;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.Font;
import com.lowagie.text.FontFactory;
import com.lowagie.text.PageSize;
import com.lowagie.text.Paragraph;
import com.lowagie.text.Phrase;
import com.lowagie.text.pdf.CMYKColor;
import com.lowagie.text.pdf.PdfPCell;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;
import com.rest.pojo.Person;

public class PdfService {

	
		private List<Person> personlist;
		
		
		public List<Person> getPersonlist() {
			return personlist;
		}



		public void setPersonlist(List<Person> personlist) {
			this.personlist = personlist;
		}



		public void generate(HttpServletResponse response) throws DocumentException, IOException {

			Document document = new Document(PageSize.A4);

			PdfWriter.getInstance(document, response.getOutputStream());

			document.open();

			Font fontTiltle = FontFactory.getFont(FontFactory.TIMES_ROMAN);
			fontTiltle.setSize(20);

			Paragraph paragraph = new Paragraph("List Of Students", fontTiltle);

			paragraph.setAlignment(Paragraph.ALIGN_CENTER);

			document.add(paragraph);

			PdfPTable table = new PdfPTable(3);

			table.setWidthPercentage(100f);
			table.setWidths(new int[] { 3, 3, 3 });
			table.setSpacingBefore(5);

			PdfPCell cell = new PdfPCell();

			// Setting the background color and padding
			cell.setBackgroundColor(CMYKColor.MAGENTA);
			cell.setPadding(5);

			// Creating font
			// Setting font style and size
			Font font = FontFactory.getFont(FontFactory.TIMES_ROMAN);
			font.setColor(CMYKColor.WHITE);

			// Adding headings in the created table cell/ header
			// Adding Cell to table
			cell.setPhrase(new Phrase("ID", font));
			table.addCell(cell);
			cell.setPhrase(new Phrase("Student Name", font));
			table.addCell(cell);
			cell.setPhrase(new Phrase("Salary", font));
			table.addCell(cell);

			for (Person p : personlist) {
				table.addCell(String.valueOf(p.getId()));
				table.addCell(p.getName());
				table.addCell(String.valueOf(p.getSalary()));
			}
			document.add(table);

			document.close();

		}
	
	
	
}
