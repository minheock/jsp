package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/myfile")
public class ReadServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String filename = req.getParameter("filename");
		String realPath = getServletContext().getRealPath("/myfile");
		File file = new File(realPath, filename);		
		res.setContentType("text/html; charset=UTF-8");
		PrintWriter writer = res.getWriter();		
		writer.println("<html><body>");
		writer.println("<h1>다이어리 내용:</h1>");
		if(file.exists() && file.isFile()) {
			try(BufferedReader br = new BufferedReader(new FileReader(file))){
				String line;
				while((line = br.readLine())!= null) {
					writer.println(line + "<br>");
				}
			}
		}else {
			writer.println("해당 파일이 존재하지 않습니다.");
		}		
		writer.println("</body></html>");
	}

}
