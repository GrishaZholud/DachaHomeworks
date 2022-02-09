package zholud.homeworks.ArrayList;

import org.junit.jupiter.api.Test;
import zholud.homeworks.OOP.Person;

import static org.assertj.core.api.Assertions.*;

class ArrayListTest {

    private Person alex = new Person("Alex", 20, 1500);
    private Person bob = new Person("Bob", 20, 5800);
    private Person den = new Person("Den", 25, 3000);
    private Person jack = new Person("Jack", 24, 5000);
    private Person mike = new Person("Mike",33,2000);
    private ArrayList<Person> arrayListWithPersons = new ArrayList<>();

    @Test
    void add() {
        arrayListWithPersons.add(alex);
        arrayListWithPersons.add(bob);
        assertThat(arrayListWithPersons.get(0)).isEqualTo(alex);
        assertThat(arrayListWithPersons.get(1)).isEqualTo(bob);
        assertThat(arrayListWithPersons.add(den)).isEqualTo(true);
    }

    @Test
    void remove() {
        arrayListWithPersons.add(alex);
        arrayListWithPersons.add(bob);
        arrayListWithPersons.remove(alex);
        assertThat(arrayListWithPersons.contains(alex)).isEqualTo(false);
        assertThat(arrayListWithPersons.contains(bob)).isEqualTo(true);
    }

    @Test
    void size() {
        arrayListWithPersons.add(alex);
        assertThat(arrayListWithPersons.size()).isEqualTo(1);
        arrayListWithPersons.add(bob);
        assertThat(arrayListWithPersons.size()).isEqualTo(2);
    }

    @Test
    void isEmpty() {
        assertThat(arrayListWithPersons.isEmpty()).isEqualTo(true);
        arrayListWithPersons.add(alex);
        assertThat(arrayListWithPersons.isEmpty()).isEqualTo(false);
    }

    @Test
    void contains() {
        arrayListWithPersons.add(alex);
        assertThat(arrayListWithPersons.contains(alex)).isEqualTo(true);
        assertThat(arrayListWithPersons.contains(bob)).isEqualTo(false);
    }

    @Test
    void subList() {
        arrayListWithPersons.add(alex);
        arrayListWithPersons.add(bob);
        arrayListWithPersons.add(den);
        arrayListWithPersons.add(jack);
        ArrayList<Person> personArrayList = (ArrayList<Person>) arrayListWithPersons.subList(0, 2);
        assertThat(personArrayList.get(0)).isEqualTo(alex);
        assertThat(personArrayList.get(1)).isEqualTo(bob);
        assertThat(personArrayList.size()).isEqualTo(2);
        assertThat(personArrayList.subList(0,0)).isEqualTo(null);
    }

    @Test
    void testRemove() {
        arrayListWithPersons.add(alex);
        arrayListWithPersons.add(bob);
        arrayListWithPersons.add(den);
        arrayListWithPersons.remove(1);
        assertThat(arrayListWithPersons.contains(bob)).isEqualTo(false);
        assertThat(arrayListWithPersons.get(0)).isEqualTo(alex);
        assertThat(arrayListWithPersons.get(1)).isEqualTo(den);
        assertThat(arrayListWithPersons.size()).isEqualTo(2);
        assertThatExceptionOfType(IndexOutOfBoundsException.class).isThrownBy(() -> {
            arrayListWithPersons.add(-1,mike);
        });
    }

    @Test
    void testAdd() {
        arrayListWithPersons.add(0, alex);
        arrayListWithPersons.add(0, bob);
        arrayListWithPersons.add(1, den);
        arrayListWithPersons.add(100,jack);
        assertThat(arrayListWithPersons.get(0)).isEqualTo(bob);
        assertThat(arrayListWithPersons.get(1)).isEqualTo(den);
        assertThat(arrayListWithPersons.get(2)).isEqualTo(alex);
        assertThat(arrayListWithPersons.get(100)).isEqualTo(jack);
        assertThatExceptionOfType(IndexOutOfBoundsException.class).isThrownBy(() -> {
            arrayListWithPersons.add(-1,mike);
        });
    }
}