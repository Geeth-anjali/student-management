package StudentManagementSystem;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.Table;
import java.time.LocalDate;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
@Table(name = "student")
public class student {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(name = "studentId")
    private Long studentId;

   @Column(name = "firstName")
    private String firstName;
   
   @Column(name = "lastName")
    private String lastName;
   
   @Column(name = "dateOfBirth")
    private LocalDate dateOfBirth;
   
   @Column(length = 15 , name = "phone")
    private String phone;
   
   @Column(unique = true, nullable = false, name = "email")
    private String email;
   
   @Column(name = "address")
    private String address;
   
   @Column(name = "course")
    private String course;
    
public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
public Long getStudentId() {
	return studentId;
}
public void setStudentId(Long studentId) {
	this.studentId = studentId;
}
public String getFirstName() {
	return firstName;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
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
public LocalDate getDateOfBirth() {
	return dateOfBirth;
}
public void setDateOfBirth(LocalDate dateOfBirth) {
	this.dateOfBirth = dateOfBirth;
}
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
 
}
