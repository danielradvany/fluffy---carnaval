package pl.sda.springboot101;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class LibraryService {
    private final List<String> bookList = new ArrayList<>();

    public LibraryService() {

        bookList.add("Carte de teste");
        bookList.add("Cartea junglei");
        bookList.add("Robinson Crusoe");
        bookList.add("Arhitectura calculatoarelor");
        bookList.add("Programarea orientata pe obiecte");
        bookList.add("Teste de limba si literatura romana");
        bookList.add("Spring in action");
        bookList.add("Culegere de probleme de matematica");
        bookList.add("Texte alese");
    }

    public String findBookByIndex(int index) {
        if (index >= 0 && index < bookList.size()) {
            return bookList.get(index);
        } else {
            return "Index invalid. Nu corespunde unei carti in sistem";
        }
    }

    public List<String> getAllBooks() {
        return bookList;
    }
}
