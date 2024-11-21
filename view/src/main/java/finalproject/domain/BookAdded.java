package finalproject.domain;

import finalproject.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.Data;

@Data
public class BookAdded extends AbstractEvent {

    private String id;
    private String status;
    private Integer cost;
}
