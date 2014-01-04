package db;

public class StudentAccount {

		private int id;
		private String subjects;
		private Student studentObj = null;
		
		public StudentAccount(){
			
		}
		
		public StudentAccount(int id, String subjects, Student studentObj)
		{
			this.id = id;
			this.subjects = subjects;
			this.studentObj = studentObj;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getSubjects() {
			return subjects;
		}

		public void setSubjects(String subjects) {
			this.subjects = subjects;
		}

		public Student getStudentObj() {
			return studentObj;
		}

		public void setStudentObj(Student studentObj) {
			this.studentObj = studentObj;
		}
		
		
		
}
