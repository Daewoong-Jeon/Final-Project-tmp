package finalproject.domain;

import finalproject.domain.*;
import finalproject.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class BookRent extends AbstractEvent {

    private String memberId;
    private String bookId;
}
