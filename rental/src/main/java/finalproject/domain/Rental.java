package finalproject.domain;

import finalproject.RentalApplication;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Rental_table")
@Data
//<<< DDD / Aggregate Root
public class Rental {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String bookId;

    private String memberId;

    private Date rentalDate;

    private Date requiredReturnDate;

    private Date returnDate;

    private String overdueYn;

    private String result;

    @PostPersist
    public void onPostPersist() {}

    public static RentalRepository repository() {
        RentalRepository rentalRepository = RentalApplication.applicationContext.getBean(
            RentalRepository.class
        );
        return rentalRepository;
    }

    //<<< Clean Arch / Port Method
    public void rentBook(RentBookCommand rentBookCommand) {
        //implement business logic here:

        BookRent bookRent = new BookRent(this);
        bookRent.publishAfterCommit();
    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public void returnBook(ReturnBookCommand returnBookCommand) {
        //implement business logic here:

        BookReturned bookReturned = new BookReturned(this);
        bookReturned.publishAfterCommit();
    }

    //>>> Clean Arch / Port Method

    //<<< Clean Arch / Port Method
    public static void updateNotAvailable(
        NotAvailableReturned notAvailableReturned
    ) {
        //implement business logic here:

        /** Example 1:  new item 
        Rental rental = new Rental();
        repository().save(rental);

        */

        /** Example 2:  finding and process
        
        repository().findById(notAvailableReturned.get???()).ifPresent(rental->{
            
            rental // do something
            repository().save(rental);


         });
        */

    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public static void updateLackOfPoints(BookRollbacked bookRollbacked) {
        //implement business logic here:

        /** Example 1:  new item 
        Rental rental = new Rental();
        repository().save(rental);

        */

        /** Example 2:  finding and process
        
        repository().findById(bookRollbacked.get???()).ifPresent(rental->{
            
            rental // do something
            repository().save(rental);


         });
        */

    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
