package repository;

import edu.sena.alejademo.model.Revista;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RevistaRepository extends JpaRepository<Revista, Long> {
    List<Revista> findByCategoriaContaining(String categoria);
    List<Revista> findByEditorialContaining(String editorial);
}
