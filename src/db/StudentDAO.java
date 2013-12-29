package db;

public class StudentDAO extends BaseHibernateDAO {

	 public boolean save(Student transientInstance) {
	      
	        try {
	            getSession().save(transientInstance);
	        
	            return true;
	        } catch (RuntimeException re) {
	         
	            throw re;
	        }
	    }
}
