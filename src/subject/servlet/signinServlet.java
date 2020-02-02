package subject.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import subject.dao.StuserDao;

/**
 * Servlet implementation class signinServlet
 */
@WebServlet("/signinServlet")
public class signinServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public signinServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int stuID = Integer.valueOf(request.getParameter("stuID"));
		String password = request.getParameter("password");
		
		StuserDao dao=new StuserDao();
		if(dao.getUser(stuID, password)!=null) {
			response.sendRedirect("SubjectServlet");
		}else {
			response.setContentType("text/html; charset = UTF-8");
			PrintWriter pw = response.getWriter();
			pw.println("´ËÕËºÅÎ´×¢²á£¬ÇëÏÈ×¢²á");
			pw.flush();
			pw.close();
//			RequestDispatcher rd=request.getRequestDispatcher("/subject/sign-up-in.jsp");
//			rd.forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
