package zholud.homeworks.OOP;


public class Application {
    public static void main(String[] args) {
        Person person = new Person("Alex", 50, 1000);
        Person person1 = new Person("Bob", 40, 5000);
        Company company = new Company("Apple");
        person.setCompanyName("Apple");
        person1.setCompanyName("Samsung");
        System.out.println(person.getCompanyName());

        company.recruitPerson(person);
        company.recruitPerson(person);

        company.print();
        company.dismissPerson(person1);
        company.print();

        person.setAge(70);
        person.setSalary(70);

    }
}