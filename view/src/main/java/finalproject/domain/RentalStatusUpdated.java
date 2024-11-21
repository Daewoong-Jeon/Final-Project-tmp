package finalproject.domain;

import finalproject.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.Data;

@Data
public class RentalStatusUpdated extends AbstractEvent {

    private String memberId;
    private Integer cost;
    private String id;
    private String status;
    private Date rentalDate;
    private Date requiredReturnDate;
}
