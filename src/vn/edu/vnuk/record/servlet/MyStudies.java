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
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<meta charset=\"UTF-8\">");
		out.println("<title>My Studies</title>");
		out.println("<style>");
		out.println("th, td {border: 2px solid #999;");
		out.println("text-align: left;");
		out.println("padding: 8px;}");
		out.println("table {font-family: arial, sans-serif;");
		out.println("border-collapse: collapse;");
		out.println("width: 100%;}");
		out.println("tr:nth-child(even) {background-color: #fff;}");
		out.println("tr:nth-child(odd) {background-color: #ffe6e6;}");
		out.println("</style>");
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
