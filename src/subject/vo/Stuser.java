package subject.vo;

import java.sql.Timestamp;

public class Stuser {

	int stuID;
	String password;
	int loginCount;
	Timestamp lastDate;
	
	
	public Stuser() {
		super();
	}
	public Stuser(int stuID, String password, int loginCount, Timestamp lastDate) {
		super();
		this.stuID = stuID;
		this.password = password;
		this.loginCount = loginCount;
		this.lastDate = lastDate;
	}
	public int getStuID() {
		return stuID;
	}
	public void setStuID(int stuID) {
		this.stuID = stuID;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getLoginCount() {
		return loginCount;
	}
	public void setLoginCount(int loginCount) {
		this.loginCount = loginCount;
	}
	public Timestamp getLastDate() {
		return lastDate;
	}
	public void setLastDate(Timestamp lastDate) {
		this.lastDate = lastDate;
	}
	@Override
	public String toString() {
		return "Stuser [stuID=" + stuID + ", password=" + password + ", loginCount=" + loginCount + ", lastDate="
				+ lastDate + "]";
	}
	
}
