package StudentManagementSystem;
import StudentManagementSystem.student;
import StudentManagementSystem.studentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@Controller
public class StudentWebController {

	@Autowired
	private studentService studentService;
	
@GetMapping("/students")
public String viewStudents(Model model) {
List<student> student = studentService.getAllStudent();
  
    model.addAttribute("students", student);
     return "students";
 }

@GetMapping("/students/add") 
public String showAddForm(Model model) {
  model.addAttribute("student", new student());
    return "studentForm";
 }	

@PostMapping("/students/save")    
public String saveStudent(@ModelAttribute("students") student student) {
   studentService.saveStudent(student);
     return "redirect:/students";
 }

@GetMapping("/students/edit/{id}") 
public String editStudent(@PathVariable Long id, Model model) {
	student student = studentService.getStudentById(id);
  
   model.addAttribute("student", student);
     return "studentForm";
 }

@GetMapping("/students/delete/{id}")
public String deleteStudent(@PathVariable Long id) {
  studentService.deleteStudent(id);
   return "redirect:/students";
 }

}

