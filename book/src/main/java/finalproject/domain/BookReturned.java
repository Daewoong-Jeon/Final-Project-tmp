package finalproject.domain;

import finalproject.domain.*;
import finalproject.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class BookReturned extends AbstractEvent {

    private String bookId;
    private String memberId;
    private String overdueYn;
}
