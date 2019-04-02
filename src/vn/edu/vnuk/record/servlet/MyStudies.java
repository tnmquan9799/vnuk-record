package vn.edu.vnuk.record.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class MyStudies extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setCharacterEncoding ("UTF-8");
		response.setContentType ("text / html; charset = UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<meta charset=\"UTF-8\">");
		out.println("<title>My Studies</title>");
		out.println("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/MyStudies.css\">");
		out.println("</head>");
		out.println("<body>");
		out.println("<table>");
		out.println("<thread>");
		out.println("<tr>");
		out.println("<th>Year</th>");
		out.println("<th>School</th>");
		out.println("<th>Town</th>");
		out.println("<th>Country</th>");
		out.println("</thread>");
		out.println("<tobdy>");
		out.println("<tr>");
		out.println("<td>2007 - now</td>");
		out.println("<td>Viện Nghiên cứu và Đào tạo Việt Anh</td>");
		out.println("<td rowspan=\"5\">Đà Nẵng</td>");
		out.println("<td rowspan=\"5\">Việt Nam</td>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<td>2014 - 2017</td>");
		out.println("<td>Phan Châu Trinh Highschool</td>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<td>2010 - 2014</td>");
		out.println("<td>Nguyễn Khuyến Secondary School</td>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<td>2005 - 2010</td>");
		out.println("<td>Trần Văn Ơn Elementary School</td>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<td>2007 - 2010</td>");
		out.println("<td>Hoa Phượng Đỏ Kindergarten</td>");
		out.println("</tr>");
		out.println("</tbody>");
		out.println("</table>");
		out.println("</body>");

	}
}
