package finalproject.domain;

import finalproject.domain.*;
import finalproject.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class AvailableStatusUpdated extends AbstractEvent {

    private String memberId;
    private Integer cost;
    private String id;
    private String status;

    public AvailableStatusUpdated(Book aggregate) {
        super(aggregate);
    }

    public AvailableStatusUpdated() {
        super();
    }
}
//>>> DDD / Domain Event
