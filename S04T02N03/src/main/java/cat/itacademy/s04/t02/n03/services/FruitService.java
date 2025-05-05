package cat.itacademy.s04.t02.n03.services;

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
        return repository.save(fruit);
    }

    public void deleteFruit(String id) {
        repository.deleteById(id);
    }

    public Optional<Fruit> getFruitById(String id) {
        return repository.findById(id);
    }

    public List<Fruit> getAllFruit() {
        return repository.findAll();
    }
}

