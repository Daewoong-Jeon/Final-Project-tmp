package finalproject.domain;

import finalproject.domain.*;
import finalproject.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class AvailableStatusUpdated extends AbstractEvent {

    private String memberId;
    private Integer cost;
    private String id;
    private String status;
    private Date rentalDate;
    private Date requiredReturnDate;
}
