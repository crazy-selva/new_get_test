package dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import bean.TraineeBean;
import entity.TraineeEntity;
import resources.HibernateUtility;

public class TraineeDao {
	SessionFactory sessionFactory=HibernateUtility.createSessionFactory();
	Session session=null;
	public void addTrainee(TraineeBean obj) {
		
		TraineeEntity te = new TraineeEntity();
		te.setEmpId(obj.getEmpId());
		te.setName(obj.getName());
		te.setContactNumber(obj.getContactNumber());
		te.setStream(obj.getStream());
		te.setCity(obj.getCity());
		try {
			session=sessionFactory.openSession();
			session.persist(te);
			session.beginTransaction().commit();
		} finally {
			session.close();
		}
	}
	public void updateTraineeDetails(Integer a) {
		
	}
	public void deleteTrainee(Integer a){
		try {
			session=sessionFactory.openSession();
			TraineeEntity result=(TraineeEntity) session.get(TraineeEntity.class, a);
			if (result!=null) {
				session.delete(result);
			}
		} finally {
			// TODO: handle finally clause
		}
	}
	public void retrieveTraineeDetails(Integer a)  {
		
	}
	
}
