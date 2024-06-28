package PatalanoCarlo.ExamU5D5V2.Repositorys;


import PatalanoCarlo.ExamU5D5V2.Entities.Dispositivo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DispositivoRepository extends JpaRepository<Dispositivo, Long> {
}
