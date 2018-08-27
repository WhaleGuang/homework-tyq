package com.daqi.control;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns= {"/login","/update","/insert","/delete"})
public class PerfumeServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
        response.setContentType("text/html;charset=utf-8");
        request.setCharacterEncoding("utf-8");

        switch ((request.getServletPath())) {
            case "/insert":Insert(request, response);break;
            case "/update":Update(request, response);break;
            case "/delete":Delete(request, response);break;
        }
    }

    //添加
    public static void Insert(HttpServletRequest request, HttpServletResponse response) {
        String id=request.getParameter("bid");
        String name=request.getParameter("bName");
        String =request.getParameter("bDesc");
        String bprice=request.getParameter("bprice");
        String btid=request.getParameter("bTid");
        int insert=BooksBO.insert(bid2,bname,bdesc,Float.parseFloat(bprice),Integer.parseInt(btid));
        if(insert>0) {
            try {
                response.sendRedirect("Bookdates.jsp");
            } catch (IOException e) {
                // TODO 自动生成的 catch 块
                e.printStackTrace();
            }
        }else {
            System.out.println("添加失败！请重新尝试！");

        }

    //删除
    public static void Delete(HttpServletRequest request, HttpServletResponse response) {

    }
    //修改
    public static void Update(HttpServletRequest request, HttpServletResponse response){

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
    }
}
