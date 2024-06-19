package pl.sda.springboot101.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import pl.sda.springboot101.model.Fruit;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
@Repository
public class FruitJdbc {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void addFruit(Fruit fruit) {
        String sql = "INSERT INTO fruits values (NULL, ?, ?)";
        jdbcTemplate.update(sql, fruit.getName(), fruit.getWeight());
    }

    public List<Fruit> getFruits() {
        String sql = "SELECT * from fruits";
        return jdbcTemplate.query(sql, new RowMapper<Fruit>() {
            @Override
            public Fruit mapRow(ResultSet rs, int rowNum) throws
                    SQLException {
                Fruit f = new Fruit();
                f.setName(rs.getString("name"));
                f.setWeight(rs.getDouble("weight"));
                return f;
            }
        });
    }
}
