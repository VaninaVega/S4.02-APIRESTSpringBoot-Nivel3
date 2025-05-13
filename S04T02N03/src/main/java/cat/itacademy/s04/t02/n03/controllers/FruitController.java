package cat.itacademy.s04.t02.n03.controllers;

import cat.itacademy.s04.t02.n03.model.Fruit;
import cat.itacademy.s04.t02.n03.services.FruitService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/fruits")
public class FruitController {

    private final FruitService service;

    public FruitController(FruitService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<Fruit> addFruit(@RequestBody Fruit fruit) {
        return ResponseEntity.ok(service.addFruit(fruit));
    }

    @PutMapping("/update")
    public ResponseEntity<Fruit> updateFruit(@RequestBody Fruit fruit) {
        return ResponseEntity.ok(service.updateFruit(fruit));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteFruit(@PathVariable String id) {
        service.deleteFruit(id);
        return ResponseEntity.ok("Deleted successfully");
    }

    @GetMapping("/{id}")
    public ResponseEntity<Fruit> getFruit(@PathVariable String id) {
        Fruit fruit = service.getFruitById(id);
        return ResponseEntity.ok(fruit);
    }

    @GetMapping
    public ResponseEntity<List<Fruit>> getAll() {
        return ResponseEntity.ok(service.getAllFruit());
    }
}

