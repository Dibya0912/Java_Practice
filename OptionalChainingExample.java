import java.util.*;

class Address {
    String city;
    Address(String city) { this.city = city; }
    String getCity() { return city; }
}

class User {
    Address address;
    User(Address address) { this.address = address; }
    Address getAddress() { return address; }
}

public class OptionalChainingExample {
    public static void main(String[] args) {
        User user = new User(new Address("Bangalore"));
        String city = Optional.ofNullable(user)
                .map(User::getAddress)
                .map(Address::getCity)
                .orElse("Unknown");
        System.out.println("City: " + city);
    }
}
