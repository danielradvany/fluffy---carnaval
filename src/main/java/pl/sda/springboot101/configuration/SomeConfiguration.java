package pl.sda.springboot101.configuration;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;


@Validated
@EnableConfigurationProperties(SomeConfiguration.class)
@Component
@ConfigurationProperties(prefix = "sda.validation.example")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SomeConfiguration {

    @Min(3)
    @NotNull(message = "iterations is a mandatory config field")
    private Integer iterations;
}