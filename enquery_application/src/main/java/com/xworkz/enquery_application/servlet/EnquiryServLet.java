package com.xworkz.enquery_application.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.enquery_application.dto.EnquiryDto;

import com.xworkz.enquery_application.file.EnquiryFile;
@WebServlet (urlPatterns = "/enquiry")
public class EnquiryServLet extends HttpServlet {

	@Override
	public  void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		EnquiryDto dto = new EnquiryDto();

		dto.setName(req.getParameter("name"));
		dto.setConNumber(Long.getLong( req.getParameter("cNumber")));
		dto.setEmail(req.getParameter("email"));
		dto.setDescription(req.getParameter("description"));

		String name = dto.getName();
		Long cNumber = dto.getConNumber();
		String email = dto.getEmail();
		String description = dto.getDescription();

		EnquiryFile file = new EnquiryFile();
		file.enquiry(dto);

		req.setAttribute("name", name);
		req.setAttribute("cNumber", cNumber);
		req.setAttribute("email", email);
		req.setAttribute("description", description);
		RequestDispatcher enquiry = req.getRequestDispatcher("success.jsp");
		enquiry.forward(req, resp);

	}

}
