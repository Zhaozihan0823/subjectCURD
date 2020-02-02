package subject.dao;

import java.util.Arrays;
import java.util.List;

import com.oracle.jdbc.util.Dao;

import subject.vo.Student;
import subject.vo.Sub;

public class SubjectDao {
	
	//查询
	public List<Object[]> getAll(){
		return Dao.query("select stuID,stuname,classno,sub.classname,score,begaindate,teacher from sub,student where sub.classname=student.classname order by stuID");
	}
	
	public List<Sub> getAllClass() {
		return Dao.query("select * from sub order by classno", Sub.class);
	}
	
	public List<Student> getAllStudent(){
		return Dao.query("select * from student", Student.class);
	}
	
	public Student getStudentbyID(int stuID) {
		return Dao.queryOne("select * from student where stuID=?", Student.class, stuID);
	}
	
	public Sub getSubbyclassno(Integer classno) {
		return Dao.queryOne("select * from sub where classno=?", Sub.class, classno);
	}
	
	//删除
	public void delete(String[] stuID) {
		String str=Arrays.toString(stuID);
			
		str=str.replace("[", "(");
		str=str.replace("]", ")");
		
		Dao.executeSql("delete from student where stuID in"+ str);
	}
	
	//增加
	public void insert(Student stu) {
		Dao.executeSql("insert into student values(?,?,?,?)", stu.getStuID(), stu.getStuname(), stu.getClassname(), stu.getScore());
	}
	
	//修改
	public void update(int stuID, int score) {
		Dao.executeSql("update student set score=? where stuID=?", score, stuID);
	}
}
