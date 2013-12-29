package db;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class StudentUtil {

	
	public static boolean saveStudent(Student stu)
	{
		StudentDAO studentDao = new StudentDAO();
		Session sessObj = studentDao.getSession();
		Transaction tx =null;
		boolean flag = false;
		try
		{
			tx = sessObj.beginTransaction();
			studentDao.save(stu);
			tx.commit();
			flag=true;
		}
		catch(RuntimeException re)
		{
			re.printStackTrace();
			
			try{
			if(tx!=null)
				tx.rollback();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			
		}
		return flag;
	}
	
	public static void main(String... ag)
	{
		saveStudent(new Student("ShyamLal", 55));
		
	}
}
