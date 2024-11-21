package finalproject.domain;

import finalproject.domain.*;
import finalproject.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class NotAvailableBook extends AbstractEvent {

    private String id;
    private String memberId;
    private Integer rentalId;
    private String status;

    public NotAvailableBook(Book aggregate) {
        super(aggregate);
    }

    public NotAvailableBook() {
        super();
    }
}
//>>> DDD / Domain Event
