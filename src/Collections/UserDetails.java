package Collections;

public class UserDetails {
    String name ;
    int age;
    String location;

    public UserDetails(String name, int age, String location) {

        this.name = name;
        this.age = age;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getLocation() {
        return location;
    }
}
