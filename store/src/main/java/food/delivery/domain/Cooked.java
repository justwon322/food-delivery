package food.delivery.domain;

import food.delivery.domain.*;
import food.delivery.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class Cooked extends AbstractEvent {

    private Long id;
    private Long orderId;
    private String options;

    public Cooked(Cooking aggregate){
        super(aggregate);
    }
    public Cooked(){
        super();
    }
}
