package vn.edu.vnuk.record.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import vn.edu.vnuk.record.dao.ContactDao;
import vn.edu.vnuk.record.model.Contact;

@WebServlet("/addContact")
@SuppressWarnings("serial")
public class AddContactServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    request.setCharacterEncoding("UTF-8");
	    response.setCharacterEncoding("UTF-8");
	    response.setContentType("text/html; charset=UTF-8");
	 
		PrintWriter out = response.getWriter();
		
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String address = request.getParameter("address");
		String dateInStringFormat = request.getParameter("date_of_birth"); 
		
		Calendar dateOfBirth = null;
		try {
			Date date = new SimpleDateFormat("dd/MM/yyy").parse(dateInStringFormat);
			dateOfBirth = Calendar.getInstance();
			dateOfBirth.setTime(date);
		}
		
		catch(ParseException e) {
			out.println("error while converting date!");
			return;
		}
		
		Contact contact = new Contact();
		ContactDao contactDao = new ContactDao();
		
		contact.setName(name);
		contact.setEmail(email);
		contact.setAddress(address);
		contact.setDateOfBirth(dateOfBirth);
		
		try {
			contactDao.create(contact);
		}
		
		catch(SQLException e) {
			e.printStackTrace();
		}
		
		out.println("<html>");
		out.println("<body>");
		out.println("Contact " + contact.getName() + " successfully added!");
		out.println("</body>");
		out.println("</html>");
		
	}
}
