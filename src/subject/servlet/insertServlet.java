package subject.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import subject.dao.SubjectDao;
import subject.vo.Student;

/**
 * Servlet implementation class insertServlet
 */
@WebServlet("/insertServlet")
public class insertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public insertServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		//获取数据
		int stuID = Integer.valueOf(request.getParameter("stuID"));
		String stuname = request.getParameter("stuname");
		String classname = request.getParameter("classname");
		int score = Integer.valueOf(request.getParameter("score"));
		System.out.println(stuID+" "+stuname+" "+classname+" "+score);
		Student stu = new Student(stuID, stuname, classname, score);
		//调用业务逻辑
		SubjectDao dao = new SubjectDao();
		dao.insert(stu);
		
		//显示页面
		response.sendRedirect("SubjectServlet");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
