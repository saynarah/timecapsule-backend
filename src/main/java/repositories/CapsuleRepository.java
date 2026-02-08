package repositories;

import domain.Capsule;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CapsuleRepository extends JpaRepository<Capsule,Long> {
}
