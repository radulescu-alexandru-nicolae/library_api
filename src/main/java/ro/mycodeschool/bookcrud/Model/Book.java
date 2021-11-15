package ro.mycodeschool.bookcrud.Model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

import java.util.Locale;

import static javax.persistence.GenerationType.SEQUENCE;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name="Book")
@Table(name="book")
public class Book {
    @Id
    @SequenceGenerator(
            name = "book_sequence",
            sequenceName = "book_sequence",
            allocationSize = 1
    )

    @GeneratedValue(
            strategy = SEQUENCE,
            generator = "book_sequence"

            )

            @Column(
                    name = "id",
                    updatable = false,
                    columnDefinition = "INTEGER"
            )
        private Long id;


    @Column(
            name = "title",
            columnDefinition = "text"
    )

    private String title;

    @Column(
            name="author",
            columnDefinition = "text"
    )
    private String author;
    @Column(
            name="year",
            columnDefinition = "INTEGER"
    )
    private int year;


    public Book(String title, String author, int year) {
        this.title=title;
        this.author=author;
        this.year=year;
    }
}
