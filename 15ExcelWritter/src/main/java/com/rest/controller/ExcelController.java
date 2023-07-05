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
import com.rest.excelService.ExcelService;
import com.rest.pojo.Person;
import com.rest.service.Serviceimpl;

@Controller
public class ExcelController {

	@Autowired
	private Serviceimpl s;
	
	@GetMapping("/records/export/excel")
	public void exportIntoExcel(HttpServletResponse response) throws IOException {
		response.setContentType("application/octet-stream");
		DateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd_HH:mm:ss");
		String currentDateTime = dateFormatter.format(new Date());

		String headerKey = "Content-Disposition";
		String headerValue = "attachment; filename=records_" + currentDateTime + ".xlsx";
		response.setHeader(headerKey, headerValue);

		List<Person> listOfRecords = s.SgetAll();

		ExcelService generator = new ExcelService(listOfRecords);

		generator.generate(response);
	}

}
