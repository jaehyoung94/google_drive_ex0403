package googledrive.domain;

import googledrive.domain.*;
import googledrive.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class UserNotificated extends AbstractEvent {

    private Long id;

    public UserNotificated() {
        super();
    }
}
