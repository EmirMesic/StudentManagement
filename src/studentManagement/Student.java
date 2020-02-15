package studentManagement;


public class Student {
	private String studentId;
	private String firstName;
	private String lastName;
	private String dob;
	private String indexNumber;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	public Student(String studentId, String firstName, String lastName, String dob, String indexNumber ) {
		this.studentId = studentId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dob = dob;
		this.indexNumber = indexNumber;
	}

	
	public Student(String studentId, String firstName, String lastName, String indexNumber ) {
		// TODO Auto-generated constructor stub
	}
	
	public String getStudentId() {
		return studentId;
	}
	
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getIndexNumber() {
		return indexNumber;
	}
	public void setIndexNumber(String indexNumber) {
		this.indexNumber = indexNumber;
	}
	
//	@Override
//	public boolean equals(Object arg0) {
//		// TODO Auto-generated method stub
//		return super.equals(arg0);
//	}
	
//	@Override
//	public int hashCode() {
//		// TODO Auto-generated method stub
//		return super.hashCode();
//	}
	
	@Override
	public String toString() {
		return "\nId: " + studentId + " Name: " + firstName + " " + lastName + "\nDate of Birth: " + dob + "\nIndex Number " + indexNumber;
	}
	

}
