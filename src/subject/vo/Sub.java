package subject.vo;

import java.util.Date;

public class Sub {

		Integer classno;
		String classname;
		Date begaindate;
		String teacher;
		
		public Sub(Integer classno, String classname, Date begindate, String teacher) {
			super();
			this.classno = classno;
			this.classname = classname;
			this.begaindate = begindate;
			this.teacher = teacher;
		}

		public Sub() {
			super();
		}

		public Integer getClassno() {
			return classno;
		}

		public void setClassno(Integer classno) {
			this.classno = classno;
		}

		public String getClassname() {
			return classname;
		}

		public void setClassname(String classname) {
			this.classname = classname;
		}

		public Date getBegaindate() {
			return begaindate;
		}

		public void setBegaindate(Date begindate) {
			this.begaindate = begindate;
		}

		public String getTeacher() {
			return teacher;
		}

		public void setTeacher(String teacher) {
			this.teacher = teacher;
		}

		@Override
		public String toString() {
			return "Class [classno=" + classno + ", classname=" + classname + ", begaindate=" + begaindate + ", teacher="
					+ teacher + "]";
		}
		
		
}
