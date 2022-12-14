package servlet;

import java.io.IOException;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(
        urlPatterns = "/myController",
        loadOnStartup = 1,
        asyncSupported = true
)
public class StartupServlet extends HttpServlet {   
    public void init(ServletConfig config) {
        loggerObj.debug("My Servlet Has Been Initialized ….!");
    }
    
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.getWriter().println("My Servlet Has Been Initialized ….!");
    }
      
}