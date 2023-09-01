package com;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/write")
public class DiaryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
//    public DiaryServlet() {
//        super();
//    }


	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.getWriter().append("Served at: ").append(req.getContextPath());
	}


	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		String title = req.getParameter("title");
		String content = req.getParameter("content");
		System.out.println(title);
		System.out.println(content);		
		
		// 날짜로 파일명 만들기
		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter formatter = 
					DateTimeFormatter.ofPattern("yyyyMMddHHmm"); //분까지
		String nowstr = now.format(formatter);
		System.out.println(nowstr);
		
		// 최초 요청시 폴더가 없으면 생성
		String dir = "/myfile";
		// 실행 파일 위치
		String realPath = getServletContext().getRealPath(dir);
		File file = new File(realPath);
		if(!file.exists()) { // 경로가 있는지 없는지
			file.mkdir(); // 폴더 생성
		}
		File textFile = new File(realPath, nowstr + ".txt");
		try (PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(textFile)))){
			out.println("제목:" + title);
			out.println("내용:");
			out.println(content);
		}
		res.setContentType("text/html; charset=UTF-8");
		PrintWriter writer = res.getWriter();
		writer.println("<html><body>다이어리가 성공적으로 저장됨.<br>");
		File[] listFiles = file.listFiles();
		writer.println("<h1>저장된 다이어리 목록:</h1>");
		for(File f: listFiles) {
			if(f.isFile()) {
				String filePath = f.getName();
				writer.println("<a href='myfile?filename=" + filePath +"'>" + f.getName() + "</a><br>");
			}
		}
		writer.println("</body></html>");
		
	}

}
