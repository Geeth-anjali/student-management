package StudentManagementSystem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface studentRepository extends JpaRepository<student, Long> {

}
