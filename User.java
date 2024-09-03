public class User {
    private final String name;
    private final int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String toJson() {
        return String.format("{\"name\":\"%s\", \"age\":%d}", name, age);
    }
}
