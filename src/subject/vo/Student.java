package subject.vo;

public class Student {
	
	Integer stuID;
	String stuname;
	String classname;
	Integer score;
	
	public Student(Integer stuID, String stuname, String classname, Integer score) {
		super();
		this.stuID = stuID;
		this.stuname = stuname;
		this.classname = classname;
		this.score = score;
	}

	public Student() {
		super();
	}

	public Integer getStuID() {
		return stuID;
	}

	public void setStuID(Integer stuID) {
		this.stuID = stuID;
	}

	public String getStuname() {
		return stuname;
	}

	public void setStuname(String stuname) {
		this.stuname = stuname;
	}

	public String getClassname() {
		return classname;
	}

	public void setClassname(String classname) {
		this.classname = classname;
	}

	public Integer getScore() {
		return score;
	}

	public void setScore(Integer score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "Student [stuID=" + stuID + ", stuname=" + stuname + ", classname=" + classname + ", score=" + score
				+ "]";
	}
	
	
}
