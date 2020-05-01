package service;

import javax.naming.InvalidNameException;

import bean.TraineeBean;
import dao.TraineeDao;
import exception.InvalidTraineeDetailsException;

public class TraineeService {
	public void addTrainee(TraineeBean obj) throws Exception {
		try {
			
			validName(obj.getName());
			validPhone(obj.getContactNumber());
			validStream(obj.getStream());
			TraineeDao td = new TraineeDao();
			td.addTrainee(obj);
		}catch (Exception e) {
			throw e;
		}
		
	}
	public void updateTraineeDetails(Integer a, String b)  {
		
	}
	public void deleteTrainee(Integer a) throws Exception {
		try {
			TraineeDao d = new TraineeDao();
			d.deleteTrainee(a);
		}catch (Exception e) {
			throw e;
		}
	}
	public void retrieveTraineeDetails(Integer a)  {
		TraineeBean output = null;
		try {
			TraineeDao d = new TraineeDao();
			d.retrieveTraineeDetails(a);
		}catch (Exception e) {
			throw e;
		}
	}
	public void validName(String a) throws InvalidNameException{
		Boolean result=a.matches("[a-zA-z\\s]+");
		if(!result) {
			throw new InvalidNameException("invalid name");
		}
	}
	public void validPhone(Long a) throws InvalidTraineeDetailsException {
		String pNumber=a.toString();
		Boolean result=pNumber.matches("(7|8|9)[0-9]{9}");
		//Boolean result = pNumber.length()==10 && (pNumber.startsWith("7") | pNumber.startsWith("8")|pNumber.startsWith("9");
		if(!result) {
			throw new InvalidTraineeDetailsException("invalid phone number");
		}
	}
	public void validStream(String a) throws InvalidTraineeDetailsException {
		Boolean result =a.matches("(IVA|IMS|JEE)");
		if (!result) {
			throw new InvalidTraineeDetailsException("invalid stream");
		}
	}
}
