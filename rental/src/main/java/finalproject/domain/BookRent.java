package finalproject.domain;

import finalproject.domain.*;
import finalproject.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class BookRent extends AbstractEvent {

    private String memberId;
    private String bookId;
    private Date rentalDate;
    private Date requiredReturnDate;

    public BookRent(Rental aggregate) {
        super(aggregate);
    }

    public BookRent() {
        super();
    }
}
//>>> DDD / Domain Event
