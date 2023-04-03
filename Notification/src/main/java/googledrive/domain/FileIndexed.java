package googledrive.domain;

import googledrive.domain.*;
import googledrive.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class FileIndexed extends AbstractEvent {

    private Long id;
    private String field;
    private String keywords;
}
