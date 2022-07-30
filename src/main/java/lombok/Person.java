package lombok;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.Set;

@Builder
@Getter
@ToString
public class Person {
    private String name;

    @Singular
    private List<String> interests;

    @Singular
    private final Set<String> skills;

    @Singular
    private final Map<String, LocalDate> awards;
}
