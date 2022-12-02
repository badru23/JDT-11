package id.co.indivara.jdt11.demoauth.controller;

import id.co.indivara.jdt11.demoauth.entity.Book;
import id.co.indivara.jdt11.demoauth.exception.BookNotFoundException;
import id.co.indivara.jdt11.demoauth.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Validated
@RequestMapping("/book/api/v1/")
public class BookController {
    @Autowired
    private BookRepository repository;

    // Get All Data
    @GetMapping("/books")
    List<Book> findAll(){
        return repository.findAll();
    }

    //Insert New Data
    @PostMapping("/books")
    Book insertNewBook(@RequestBody Book newBook){
        return repository.save(newBook);
    }

    //Search Data By Id
    @GetMapping("/books/{id}")
    Book searchBookById(@PathVariable Long id){
        return repository.findById(id) .orElseThrow(() -> new BookNotFoundException(id));
    }

    //Update Data
    @PutMapping("books/{id}")
    Book updateBookData(@RequestBody Book newBook, @PathVariable Long id){
        return repository.findById(id) .map(x->{
            x.setNama(newBook.getNama());
            x.setAuthor(newBook.getAuthor());
            x.setPrice(newBook.getPrice());
            return  repository.save(x);
        })
        .orElseGet(()->{
            newBook.setId(id);
            return repository.save(newBook);
        });
    }

    //Delete Book Data
    @DeleteMapping("/books/{id}")
    void DeleteBookData(@PathVariable Long id){
        repository.deleteById(id);
    }
}
