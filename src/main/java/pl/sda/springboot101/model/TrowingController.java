package pl.sda.springboot101.model;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

public class TrowingController {
    @GetMapping("/boom")
    public ResponseEntity<Message> shouldThrow() {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                .contentType(MediaType.APPLICATION_JSON)
                .body(new Message(  " UHUHUUUUU "));
    }
}