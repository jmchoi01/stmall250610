package stmall.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import stmall.domain.*;
import stmall.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class SnippingReturn extends AbstractEvent {

    private Long id;
    private Long orderId;
    private String customerId;
    private String itemId;
    private Integer qty;
    private String address;

    public SnippingReturn(Delivery aggregate) {
        super(aggregate);
    }

    public SnippingReturn() {
        super();
    }
}
//>>> DDD / Domain Event
