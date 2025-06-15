package allynn.templates.restfulapitemplate.repository;


import allynn.templates.restfulapitemplate.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
