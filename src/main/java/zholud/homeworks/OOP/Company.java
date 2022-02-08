package zholud.homeworks.OOP;

import java.util.ArrayList;

public class Company {
    private String name;
    private ArrayList<Person> persons = new ArrayList<>();

    public Company(String companyName) {
        this.name = companyName;
    }

    //region getter/setter
    public ArrayList<Person> getPersons() {
        return persons;
    }

    public void setPersons(ArrayList<Person> persons) {
        this.persons = persons;
    }

    //endregion

    public void recruitPerson(Person name) {
        for (Person person : persons) {
            if (person.equals(name)) {
                System.out.println("Такой работник уже есть в компании");
                return;
            }
        }
        persons.add(name);
    }

    public void print() {
        for (Person s : persons) {
            System.out.println("Name:" + s.getName() + " age:" + s.getAge() + " salary:" + s.getSalary());
        }
    }

    public void dismissLastPerson() {
        if (persons.size() == 0) {
            return;
        }
        persons.remove(persons.size() - 1);
    }

    public void dismissFirstPerson() {
        if (persons.size() == 0) {
            return;
        }
        persons.remove(0);
    }

    public void dismissPerson(Person name) {
        for (Person person : persons) {
            if (person.equals(name)) {
                persons.remove(person);
                return;
            }
        }
        System.out.println("Такого работника нет в компании");

    }

    public Person employeeByName(Person name) {
        for (Person person : persons) {
            if (person.equals(name)) {
                return person;
            }
        }
        return null;
    }

}