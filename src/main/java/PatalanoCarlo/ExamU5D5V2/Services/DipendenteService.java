package PatalanoCarlo.ExamU5D5V2.Services;

import PatalanoCarlo.ExamU5D5V2.DTO.NotFoundException;
import PatalanoCarlo.ExamU5D5V2.Entities.Dipendente;
import PatalanoCarlo.ExamU5D5V2.Repositorys.DipendenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DipendenteService {

    @Autowired
    private DipendenteRepository dipendenteRepository;

    public List<Dipendente> getAllDipendenti() {
        List<Dipendente> dipendenti = dipendenteRepository.findAll();
        return dipendenti;
    }

    public Dipendente getDipendenteById(Long id) {
        Dipendente dipendente = dipendenteRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Dipendente non trovato con id " + id));

        return dipendente;
    }

    public Dipendente createDipendente(Dipendente dipendente) {

        return dipendenteRepository.save(dipendente);
    }

    public Dipendente updateDipendente(Long id, Dipendente dipendenteDetails) {
        Dipendente dipendente = dipendenteRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Dipendente non trovato con id " + id));

        dipendente.setUsername(dipendenteDetails.getUsername());
        dipendente.setName(dipendenteDetails.getName());
        dipendente.setCognome(dipendenteDetails.getCognome());
        dipendente.setEmail(dipendenteDetails.getEmail());


        return dipendenteRepository.save(dipendente);
    }

    public void deleteDipendente(Long id) {
        Dipendente dipendente = dipendenteRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Dipendente non trovato con id " + id));

        dipendenteRepository.delete(dipendente);
    }
}
