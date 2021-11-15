package ro.mycodeschool.bookcrud.web;

import com.sun.source.tree.LambdaExpressionTree;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import ro.mycodeschool.bookcrud.Data.BookRepository;
import ro.mycodeschool.bookcrud.Model.Book;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/api/books")
@CrossOrigin
public class BookController {



    private BookRepository bookRepository;


  public BookController(BookRepository books){
      this.bookRepository=books;
  }

  @GetMapping
   public ResponseEntity<List<Book>> getAllBooks(){


       return  new ResponseEntity<>(bookRepository.findAll(), HttpStatus.OK);
  }

  @PostMapping
    public ResponseEntity<Book> createBook(@RequestBody Book book){

      Book book1 = bookRepository.save(new Book(book.getTitle(),book.getAuthor(),book.getYear()));


      System.out.println(book);
      return  new ResponseEntity<>(book1,HttpStatus.OK);
  }


}

