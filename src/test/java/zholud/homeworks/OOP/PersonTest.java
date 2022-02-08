package zholud.homeworks.OOP;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class PersonTest {

    @Test
    void salaryValidate() {
        Person alex = new Person("Alex", 20, 25);

        assertThatNoException().isThrownBy(() -> {
            alex.salaryValidate();
        });

        alex.setSalary(10);

        Throwable throwable = catchThrowable(alex::salaryValidate);
        assertThat(throwable).isInstanceOf(SalaryValidateException.class)
                .hasMessage("Зарплата меньше, чем возраст");

        assertThatExceptionOfType(SalaryValidateException.class).isThrownBy(() -> {
            alex.salaryValidate();
        });

        alex.setSalary(0);

        assertThatExceptionOfType(SalaryValidateException.class).isThrownBy(() -> {
            alex.salaryValidate();
        });
    }
}