package bean;

public class TraineeBean {
	private Integer empId;
	private String name;
	private String stream;
	private Long ContactNumber;
	private String city;
	public TraineeBean(Integer empId, String name, String stream, Long contactNumber, String city) {
		super();
		this.empId = empId;
		this.name = name;
		this.stream = stream;
		ContactNumber = contactNumber;
		this.city = city;
	}
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStream() {
		return stream;
	}
	public void setStream(String stream) {
		this.stream = stream;
	}
	public Long getContactNumber() {
		return ContactNumber;
	}
	public void setContactNumber(Long contactNumber) {
		ContactNumber = contactNumber;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
}


