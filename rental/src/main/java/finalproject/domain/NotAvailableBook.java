package finalproject.domain;

import finalproject.domain.*;
import finalproject.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class NotAvailableBook extends AbstractEvent {

    private String id;
    private String memberId;
    private Integer rentalId;
    private String status;
}
