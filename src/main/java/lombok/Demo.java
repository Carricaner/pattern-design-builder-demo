package lombok;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;

public class Demo {
    public static void main(String[] args) {
        Person person = Person.builder()
                .name("Darren")
                .interests(List.of("Baseball","Reading"))
                .interest("Java")
                .interest("Music")
                .skills(List.of("Java","Node.js","AWS"))
                .skill("Docker")
                .skill("AWS")
                .awards(Map.of(
                        "Best Singer", LocalDate.now().minusYears(2),
                        "Best Dancer", LocalDate.now().minusYears(1)
                ))
                .award("Most K Pitcher", LocalDate.now().minusYears(3))
                .award("Best Dancer", LocalDate.now().minusYears(1))
                .build();

        System.out.println(person);

        Sea sea = Sea.builder()
                .grasses(List.of("Sea grass 1", "Sea grass 2"))
                .grass("Sea grass 3")
                .fish(List.of("Cat Fish", "Tuna"))
                .oneFish("Shark")
                .build();

        System.out.println(sea);

        List<Person> people = new ArrayList<>();
        System.out.println(people.stream().allMatch(man -> man != null && !man.equals("")));

        Set<String> duplicateLocationCodeSet = new HashSet<>();
        System.out.println(people.stream().map(Person::getName).allMatch(duplicateLocationCodeSet::add));

        int idx = Arrays.asList("","","").size() / 2;
        System.out.println(idx);

        PriorityQueue<Integer> numbers = new PriorityQueue<>(Collections.reverseOrder());

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);

        int poll = numbers.poll();

        System.out.println(poll);
        System.out.println(numbers.size());
        System.out.println(numbers.peek());

    }
}
