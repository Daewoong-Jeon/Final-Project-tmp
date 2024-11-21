package finalproject.domain;

import finalproject.domain.*;
import finalproject.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class BookAdded extends AbstractEvent {

    private String id;
    private String status;
    private Integer cost;

    public BookAdded(Book aggregate) {
        super(aggregate);
    }

    public BookAdded() {
        super();
    }
}
//>>> DDD / Domain Event
