package finalproject.domain;

import finalproject.domain.*;
import finalproject.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class BookRollbacked extends AbstractEvent {

    private String id;
    private String memberId;
    private String status;
}
