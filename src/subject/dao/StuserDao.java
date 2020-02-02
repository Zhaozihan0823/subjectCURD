package subject.dao;

import com.oracle.jdbc.util.Dao;

import subject.vo.Stuser;

public class StuserDao {
	
	public Stuser getUser(int stuID, String password) {
		return Dao.queryOne("select * from stuser where stuID = ? and password = ?", Stuser.class, stuID, password);
	}
	
	public void insertlogup(int stuID, String password) {
		Dao.executeSql("insert into stuser values(?,?,0,null)", stuID, password);
	}
	
	public void StuserLogin(int stuID) {
		Dao.executeSql("update stuser set logincount = logincount+1, lastDate=now() where stuID=?", stuID);
	}
}
