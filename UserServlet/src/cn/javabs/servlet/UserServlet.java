package cn.javabs.servlet;

import cn.javabs.entity.User;
import cn.javabs.service.UserService;
import cn.javabs.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/userServlet")
public class UserServlet extends HttpServlet {


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
                request.setCharacterEncoding("utf-8");
                response.setCharacterEncoding("utf-8");
                response.setContentType("application/json,charset=utf-8");
        System.out.println("ok");
                String username = request.getParameter("username");
                String password = request.getParameter("password");
                String sex = request.getParameter("sex");
                System.out.println(username+":"+password+":"+sex);
                User user = new User();

                user.setUsername(username);
                user.setPassword(password);
                user.setSex(sex);

                UserService service=new UserServiceImpl();
                int rows = service.addUser(user);

        System.out.println(rows);
                if (rows>0){
                    response.getWriter().write("添加用户成功");
                }else{
                    response.getWriter().write("添加用户失败！");
                }

    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
                this.doPost(request,response);
    }
}
