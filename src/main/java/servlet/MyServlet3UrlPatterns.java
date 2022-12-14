package servlet;

import java.io.IOException;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/foo", "/bar", "/cool"})
public class MyServlet3UrlPatterns extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.getWriter().println("Prueba Servlet con 3 UrlPatterns");
    }
}