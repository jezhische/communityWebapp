package com.google.jezhische.trials.servlets;
import javax.servlet.http.*;
import java.io.IOException;

public class HelloServlet {
    public void doGet(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) {
        try {
            httpServletResponse.getWriter().print("Hello from HelloServlet");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
