package lombok;

import java.util.List;

@Getter
@Builder
@ToString
public class Sea {
    @Singular
    private final List<String> grasses;

    @Singular("oneFish")
    private final List<String> fish;
}
