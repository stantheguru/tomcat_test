import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.*;

@WebServlet("/post_data")
public class PostData extends HttpServlet {
  
 

  public void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
    String username = request.getParameter("username");
    String password = request.getParameter("password");
	System.out.println(username);


		request.setAttribute("username", username);
    request.setAttribute("password", password);

    request.getRequestDispatcher("home.jsp").forward(request, response);
	
  

  }

}
