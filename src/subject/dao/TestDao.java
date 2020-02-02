package subject.dao;

public class TestDao {

	public static void main(String[] args) {
		SubjectDao sub = new SubjectDao();
		System.out.println(sub.getAllClass());

		//System.out.println(sub.getSubbyclassno(202001));
		
		System.out.println(sub.getAllStudent());
		
		System.out.println(sub.getAll());
	}

}
