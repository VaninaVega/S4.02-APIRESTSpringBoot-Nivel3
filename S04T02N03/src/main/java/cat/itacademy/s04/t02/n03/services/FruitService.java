package cat.itacademy.s04.t02.n03.services;

import cat.itacademy.s04.t02.n03.exceptions.FruitDoesNotExistException;
import cat.itacademy.s04.t02.n03.exceptions.FruitNotFoundException;
import cat.itacademy.s04.t02.n03.model.Fruit;
import cat.itacademy.s04.t02.n03.repository.FruitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FruitService {
    @Autowired
    private final FruitRepository repository;

    public FruitService(FruitRepository repository) {
        this.repository = repository;
    }

    public Fruit addFruit(Fruit fruit) {
        return repository.save(fruit);
    }

    public Fruit updateFruit(Fruit fruit) {
        if (!repository.existsById(fruit.getId())) {
            throw new FruitDoesNotExistException("Fruit with ID " + fruit.getId() + " does not exist.");
        }
        return repository.save(fruit);
    }

    public void deleteFruit(String id) {
        if (!repository.existsById(id)) {
            throw new FruitDoesNotExistException("Cannot be removed: fruit with ID " + id + " does not exist.");
        }
        repository.deleteById(id);
    }

    public Fruit getFruitById(String id) {
        return repository.findById(id)
                .orElseThrow(() -> new FruitNotFoundException("Fruit with ID " + id + " not found."));
    }

    public List<Fruit> getAllFruit() {
        return repository.findAll();
    }
}

