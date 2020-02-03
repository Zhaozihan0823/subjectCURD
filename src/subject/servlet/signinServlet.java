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
		
		response.setContentType("text/html; charset = UTF-8");
		
		String stuID = request.getParameter("stuID");
		String password = request.getParameter("password");
		
		StuserDao dao=new StuserDao();
		//只查询有没有id
		Stuser stuser = dao.getUser(Integer.valueOf(stuID), password);
		if(dao.getstuID(Integer.valueOf(stuID))) {
			//判断密码是否正确
			if(password == stuser.getPassword()) {
				request.getSession().setAttribute("user",  stuser);
				//更改登陆次数和登陆时间
				dao.StuserLogin(stuser.getStuID());
				//页面跳转
				response.sendRedirect("SubjectServlet");
			}else {
				//提醒密码错误请重新输入
				PrintWriter pw = response.getWriter();
				pw.println("账号或密码错误请重新登录！");
				pw.flush();
				pw.close();
			}
//			RequestDispatcher rd=request.getRequestDispatcher("/subject/sign-up-in.jsp");
//			rd.forward(request, response);
		}else {
			PrintWriter pw = response.getWriter();
			pw.println("此账号未注册，请先注册");
			pw.flush();
			pw.close();
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
