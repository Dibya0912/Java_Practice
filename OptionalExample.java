import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        String name = null;
        Optional<String> optName = Optional.ofNullable(name);

        System.out.println("Name: " + optName.orElse("Unknown"));
        optName.ifPresent(n -> System.out.println("Value exists: " + n));
    }
}
