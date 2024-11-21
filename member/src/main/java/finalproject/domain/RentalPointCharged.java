package finalproject.domain;

import finalproject.domain.*;
import finalproject.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class RentalPointCharged extends AbstractEvent {

    private String id;
    private Integer rentalPoint;

    public RentalPointCharged(Member aggregate) {
        super(aggregate);
    }

    public RentalPointCharged() {
        super();
    }
}
//>>> DDD / Domain Event
