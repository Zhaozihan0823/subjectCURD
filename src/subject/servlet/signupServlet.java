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
import subject.vo.Stuser;

/**
 * Servlet implementation class signupServlet
 */
@WebServlet("/signupServlet")
public class signupServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public signupServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//��ȡ����
		String stuID = request.getParameter("stuID");
		String password = request.getParameter("password");
		
		//����ҵ���߼�
		StuserDao dao = new StuserDao();
		if(dao.getUser(Integer.valueOf(stuID), password)!=null) {
			response.setContentType("text/html; charset = UTF-8");
			PrintWriter pw = response.getWriter();
			pw.println("���˺���ע�ᣬ��ֱ�ӵ�½");
			pw.flush();
			pw.close();
			
//			RequestDispatcher rd=request.getRequestDispatcher("/subject/sign-up-in.jsp");
//			rd.forward(request, response);
		}else {
			dao.insertlogup(Integer.valueOf(stuID), password);
			response.sendRedirect("SubjectServlet");
		}
		
		//��ʾҳ��
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
