package finalproject.domain;

import finalproject.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.Data;

@Data
public class BookRent extends AbstractEvent {

    private String memberId;
    private String bookId;
    private Date rentalDate;
    private Date requiredReturnDate;
    private Long id;
}
