package StudentManagementSystem;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

@Service
public class studentService {
	
	@Autowired
	private studentRepository repository;
	
	 public List<student> getAllStudent() {
		 return repository.findAll();
	 }
	 
	 public student saveStudent(student students) {
		 return repository.save(students);
     }
	 
	 public void deleteStudent(Long id) {
		 repository.deleteById(id);
	 }
	 
	 public student getStudentById(Long id) {
		 return repository.findById(id).orElseThrow(() -> new 
      IllegalArgumentException("Invalid Student ID: " + id));	 
	 }

}
