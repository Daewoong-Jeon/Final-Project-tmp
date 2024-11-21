package finalproject.domain;

import finalproject.domain.*;
import finalproject.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class RentalPointDecreased extends AbstractEvent {

    private String id;
    private Integer rentalPoint;

    public RentalPointDecreased(Member aggregate) {
        super(aggregate);
    }

    public RentalPointDecreased() {
        super();
    }
}
//>>> DDD / Domain Event
