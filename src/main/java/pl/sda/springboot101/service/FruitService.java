package pl.sda.springboot101.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import pl.sda.springboot101.model.Fruit;
import pl.sda.springboot101.model.Message;
import pl.sda.springboot101.repository.FruitJdbc;


@Service
public class FruitService {

    @Autowired
    private FruitJdbc fruitJdbc;

    public ResponseEntity addFruit(Fruit fruit) {
        fruitJdbc.addFruit(fruit);
        return ResponseEntity.status(HttpStatus.CREATED)
                .contentType(MediaType.APPLICATION_JSON)
                .body(new Message("Fruit " + fruit.getName() + " has been added. "));
    }
}

//    @Override
//    public Optional<Fruit> findByWeight(Double weight) {
//        return Optional.empty();
//    }
//
//    @Override
//    public Optional<Fruit> findByName(String name) {
//        return Optional.empty();
//    }
//
//    @Override
//    public Optional<Fruit> findByWeightAndName(Double weight, String name) {
//        return Optional.empty();
//    }
//
//    @Override
//    public Optional<Fruit> findByNameOrWeight(String name, Double weight) {
//        return Optional.empty();
//    }
//
//    @Override
//    public <S extends Fruit> S save(S entity) {
//        return null;
//    }
//
//    @Override
//    public <S extends Fruit> Iterable<S> saveAll(Iterable<S> entities) {
//        return null;
//    }
//
//    @Override
//    public Optional<Fruit> findById(Long aLong) {
//        return Optional.empty();
//    }
//
//    @Override
//    public boolean existsById(Long aLong) {
//        return false;
//    }
//
//    @Override
//    public Iterable<Fruit> findAll() {
//        return null;
//    }
//
//    @Override
//    public Iterable<Fruit> findAllById(Iterable<Long> longs) {
//        return null;
//    }
//
//    @Override
//    public long count() {
//        return 0;
//    }
//
//    @Override
//    public void deleteById(Long aLong) {
//
//    }
//
//    @Override
//    public void delete(Fruit entity) {
//
//    }
//
//    @Override
//    public void deleteAllById(Iterable<? extends Long> longs) {
//
//    }
//
//    @Override
//    public void deleteAll(Iterable<? extends Fruit> entities) {
//
//    }
//
//    @Override
//    public void deleteAll() {
//
//    }
//}
