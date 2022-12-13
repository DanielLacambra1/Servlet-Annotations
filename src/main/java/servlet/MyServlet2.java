package servlet;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;

@WebServlet(urlPatterns = {"/foo", "/bar", "/cool"})
public class MyServlet2 extends HttpServlet {
    // Servlet Code Here
}