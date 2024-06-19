package pl.sda.springboot101.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "fruits")
public class Fruit {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private Double weight;

    public Fruit(final String name, final Double weight) {
        this.name = name;
        this.weight = weight;
    }
}