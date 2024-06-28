package PatalanoCarlo.ExamU5D5V2.Repositorys;

import PatalanoCarlo.ExamU5D5V2.Entities.Dipendente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DipendenteRepository extends JpaRepository<Dipendente, Long> {
}
