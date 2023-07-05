package com.rest.controller;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.lowagie.text.DocumentException;
import com.rest.pdfservice.PdfService;
import com.rest.pojo.Person;
import com.rest.service.Serviceimpl;

@Controller
public class PdfController {

	@Autowired
	private Serviceimpl s;
	
	  @GetMapping("/pdf/persons")
		public void generatePdf(HttpServletResponse response) throws DocumentException, IOException {
			
			response.setContentType("application/pdf");
			DateFormat dateFormat = new SimpleDateFormat("YYYY-MM-DD:HH:MM:SS");
			String currentDateTime = dateFormat.format(new Date());
			String headerkey = "Content-Disposition";
			String headervalue = "attachment; filename=pdf_" + currentDateTime + ".pdf";
			response.setHeader(headerkey, headervalue);
			
			List<Person> personList = s.SgetAll();
			
			PdfService generator = new PdfService();
			generator.setPersonlist(personList);
			generator.generate(response);
			
		}
}
