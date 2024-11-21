package finalproject.domain;

import finalproject.BookApplication;
import finalproject.domain.AvailableStatusUpdated;
import finalproject.domain.BookAdded;
import finalproject.domain.BookRollbacked;
import finalproject.domain.NotAvailableBook;
import finalproject.domain.RentalStatusUpdated;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Book_table")
@Data
//<<< DDD / Aggregate Root
public class Book {

    @Id
    private String id;

    private String memberId;

    private String status;

    private Integer cost;

    private Integer rentalId;

    @PostPersist
    public void onPostPersist() {
        RentalStatusUpdated rentalStatusUpdated = new RentalStatusUpdated(this);
        rentalStatusUpdated.publishAfterCommit();

        AvailableStatusUpdated availableStatusUpdated = new AvailableStatusUpdated(
            this
        );
        availableStatusUpdated.publishAfterCommit();

        BookAdded bookAdded = new BookAdded(this);
        bookAdded.publishAfterCommit();

        NotAvailableBook notAvailableBook = new NotAvailableBook(this);
        notAvailableBook.publishAfterCommit();

        BookRollbacked bookRollbacked = new BookRollbacked(this);
        bookRollbacked.publishAfterCommit();
    }

    public static BookRepository repository() {
        BookRepository bookRepository = BookApplication.applicationContext.getBean(
            BookRepository.class
        );
        return bookRepository;
    }

    //<<< Clean Arch / Port Method
    public static void updateRentalStatus(BookRent bookRent) {
        //implement business logic here:

        /** Example 1:  new item 
        Book book = new Book();
        repository().save(book);

        RentalStatusUpdated rentalStatusUpdated = new RentalStatusUpdated(book);
        rentalStatusUpdated.publishAfterCommit();
        NotAvailableBook notAvailableBook = new NotAvailableBook(book);
        notAvailableBook.publishAfterCommit();
        */

        /** Example 2:  finding and process
        
        repository().findById(bookRent.get???()).ifPresent(book->{
            
            book // do something
            repository().save(book);

            RentalStatusUpdated rentalStatusUpdated = new RentalStatusUpdated(book);
            rentalStatusUpdated.publishAfterCommit();
            NotAvailableBook notAvailableBook = new NotAvailableBook(book);
            notAvailableBook.publishAfterCommit();

         });
        */

    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public static void updateAvailableStatus(BookReturned bookReturned) {
        //implement business logic here:

        /** Example 1:  new item 
        Book book = new Book();
        repository().save(book);

        AvailableStatusUpdated availableStatusUpdated = new AvailableStatusUpdated(book);
        availableStatusUpdated.publishAfterCommit();
        */

        /** Example 2:  finding and process
        
        repository().findById(bookReturned.get???()).ifPresent(book->{
            
            book // do something
            repository().save(book);

            AvailableStatusUpdated availableStatusUpdated = new AvailableStatusUpdated(book);
            availableStatusUpdated.publishAfterCommit();

         });
        */

    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public static void rollbackBook(LackOfPoints lackOfPoints) {
        //implement business logic here:

        /** Example 1:  new item 
        Book book = new Book();
        repository().save(book);

        BookRollbacked bookRollbacked = new BookRollbacked(book);
        bookRollbacked.publishAfterCommit();
        */

        /** Example 2:  finding and process
        
        repository().findById(lackOfPoints.get???()).ifPresent(book->{
            
            book // do something
            repository().save(book);

            BookRollbacked bookRollbacked = new BookRollbacked(book);
            bookRollbacked.publishAfterCommit();

         });
        */

    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
