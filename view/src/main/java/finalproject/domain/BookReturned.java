package finalproject.domain;

import finalproject.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.Data;

@Data
public class BookReturned extends AbstractEvent {

    private String bookId;
    private String memberId;
    private String overdueYn;
    private Date returnDate;
}
