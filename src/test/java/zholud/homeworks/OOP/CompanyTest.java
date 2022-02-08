package zholud.homeworks.OOP;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


class CompanyTest {
    private Person alex = new Person("Alex", 20, 2000);
    private Person bob = new Person("Bob", 25, 3000);
    private Company company = new Company("Apple");

    @Test
    void recruitPerson() {
        company.recruitPerson(alex);
        assertThat(alex).isEqualTo(company.employeeByName(alex));
        assertThat(company.getPersons().size()).isEqualTo(1);
    }

    @Test
    void dismissFirstPerson() {
        company.recruitPerson(alex);
        company.recruitPerson(bob);
        company.dismissFirstPerson();
        assertThat(company.employeeByName(alex)).isNotEqualTo(alex);
        assertThat(company.employeeByName(bob)).isEqualTo(bob);
        assertThat(company.getPersons().size()).isEqualTo(1);
    }

    @Test
    void dismissLastPerson() {
        company.recruitPerson(alex);
        company.recruitPerson(bob);
        company.dismissLastPerson();
        assertThat(company.employeeByName(bob)).isNotEqualTo(bob);
        assertThat(company.employeeByName(alex)).isEqualTo(alex);
        assertThat(company.getPersons().size()).isEqualTo(1);
    }

    @Test
    void dismissPerson() {
        company.recruitPerson(alex);
        company.recruitPerson(bob);
        company.dismissPerson(alex);
        assertThat(company.employeeByName(alex)).isNotEqualTo(alex);
        assertThat(company.employeeByName(bob)).isEqualTo(bob);
        assertThat(company.getPersons().size()).isEqualTo(1);
    }
}