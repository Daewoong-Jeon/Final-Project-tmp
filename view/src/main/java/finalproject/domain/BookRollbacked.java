package finalproject.domain;

import finalproject.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.Data;

@Data
public class BookRollbacked extends AbstractEvent {

    private String id;
    private String memberId;
    private String status;
}
