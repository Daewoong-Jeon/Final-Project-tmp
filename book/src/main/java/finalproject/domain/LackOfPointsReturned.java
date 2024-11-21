package finalproject.domain;

import finalproject.domain.*;
import finalproject.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class LackOfPointsReturned extends AbstractEvent {

    private String id;
    private Integer rentalPoint;
    private String bookId;
}