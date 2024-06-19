package pl.sda.springboot101;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class LibraryController {
    private final LibraryService libraryService;

    @Autowired
    public LibraryController(LibraryService libraryService) {
        this.libraryService = libraryService;
    }

    @GetMapping("/library/book/{index}")
    @ResponseBody
    public String getBookByIndex(@PathVariable int index) {
        return libraryService.findBookByIndex(index);
    }

    @GetMapping("/library/allbooks")
    @ResponseBody
    public List<String> getAllBooks() {
        return libraryService.getAllBooks();
    }
}
