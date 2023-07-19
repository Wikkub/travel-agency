package pl.kubik.itaka.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import pl.kubik.itaka.dto.CreateContinentDto;
import pl.kubik.itaka.entity.Continent;
import pl.kubik.itaka.repository.ContinentRepository;

import java.util.List;
import java.util.Optional;


@Service
public class ContinentService {

    @Autowired
    private ContinentRepository continentRepository;

    public Continent create(CreateContinentDto dto) {
        Continent continent = new Continent(dto);
        continentRepository.save(continent);
        return continent;
    }


    public List<Continent> getAll() {
        return continentRepository.findAll();
    }

    public Continent getById(long continentId) {
        Optional<Continent> optionalContinent= continentRepository.findById(continentId);
        if(optionalContinent.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Continent not found");
        }
        Continent continent = optionalContinent.get();
        return continent;
    }

    public Continent removeById(long continentId) {
        Optional<Continent> optionalContinent= continentRepository.findById(continentId);
        Continent continent = optionalContinent.get();
        continentRepository.deleteById(continentId);
        return continent;
    }
}
