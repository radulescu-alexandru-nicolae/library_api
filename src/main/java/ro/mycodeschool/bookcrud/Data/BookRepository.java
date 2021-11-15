package ro.mycodeschool.bookcrud.Data;

import ro.mycodeschool.bookcrud.Model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book,Long> {

}
