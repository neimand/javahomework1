package homework6;

public class employee {

    int id;
    int age;
    String firstName;
    String secondName;
    double salary;

    public employee(int id, int age, String firstName, String secondName, double salary) {
        this.id = id;
        this.age = age;
        this.firstName = firstName;
        this.secondName = secondName;
        this.salary = salary;
    }

    public employee(int id, int age, String firstName, String secondName) {
        this.id = id;
        this.age = age;
        this.firstName = firstName;
        this.secondName = secondName;
        salary = 50;
    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public boolean equals(Object obj) {
        employee t = (employee) obj;
        return t.firstName == firstName && t.secondName == secondName;
    }

    @Override
    public String toString() {
        return String.format("%s %s, %d лет, зарплата - $%f", firstName, secondName, age, salary);
    }

    public String getFullName() {
        return String.format("%s %s", firstName, secondName);
    }

    public boolean olderThan(employee e) {
        return (age > e.age);
    }

    public void upgrade() {
        salary += 20;
    }

}
