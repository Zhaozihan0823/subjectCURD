package subject.dao;

import java.util.Arrays;
import java.util.List;

import com.oracle.jdbc.util.Dao;

import subject.vo.Student;
import subject.vo.Sub;

public class SubjectDao {
	
	//²éÑ¯
	public List<Object[]> getAll(){
		return Dao.query("select stuID,stuname,classno,sub.classname,score,clabegain,teacher from sub,student where sub.classname=student.classname order by stuID");
	}
	
	public List<Sub> getAllClass() {
		return Dao.query("select * from sub order by classno", Sub.class);
	}
	
	public List<Student> getAllStudent(){
		return Dao.query("select * from student", Student.class);
	}
	
	public Sub getSubbyclassno(Integer classno) {
		return Dao.queryOne("select * from sub where classno=?", Sub.class, classno);
	}
	
	//É¾³ý
	public void delete(String[] stuID) {
		String str=Arrays.toString(stuID);
			
		str=str.replace("[", "(");
		str=str.replace("]", ")");
		
		Dao.executeSql("delete from student where stuID in"+ str);
		}
	//Ôö¼Ó
	public Student insert(Student stu) {
		return Dao.queryOne("insert into student values(?,?,?,?)", Student.class, stu.getStuID(), stu.getStuname(), stu.getClassname(), stu.getScore());
	}
}
