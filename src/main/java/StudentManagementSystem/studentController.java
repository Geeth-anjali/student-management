/* 
package StudentManagementSystem;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

@RestController
@RequestMapping("/student")
public class studentController {

@Autowired 
private studentService studentService;

@GetMapping
public List<student> getAllStudents() {
	return studentService.getAllStudent();
  }

@PostMapping
public student addStudent(@RequestBody student student) {
	return studentService.saveStudent(student);
  }

@DeleteMapping("/{id}")
public void deleteStudent(@PathVariable Long id) {
	studentService.deleteStudent(id);
  }

}
*/