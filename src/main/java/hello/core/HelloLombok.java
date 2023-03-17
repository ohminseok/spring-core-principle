package hello.core;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class HelloLombok {

    private String name;
    private int age;

    public static void moain(String[] args) {
        HelloLombok helloLombok = new HelloLombok();
        helloLombok.setName("sdasads");

        String name = helloLombok.getName();
    }
}
