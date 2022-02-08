package zholud.homeworks.Abstracts;

public interface Worker {
    /**
     * Метод проверяет, что зарплата больше, чем возраст
     *
     * @return false, если зарплата меньше, чем возраст
     * @return true, если зарплата больше, чем возраст
     */
    boolean checkSalaryGreaterAge();

    /**
     * Метод проверяет, равна ли зарплата 0
     *
     * @return false, если зарплата равна 0
     * @return true, если зарплата не равна 0
     */
    boolean salarySpecified();


    /**
     * Метод возвращает возраст сотрудника
     *
     * @return возраст сотрудника
     */
    int getAge();

    /**
     * Метод возвращает имя сотрудника
     *
     * @return имя сотрудника
     */
    String getName();

    /**
     * Метод возвращает зарплату сотрудника
     *
     * @return зарплата сотрудника
     */
    int getSalary();

    /**
     * Метод проверяет методы checkSalaryGreaterAge и existSalary, если проверка не проходит, то выкидывается salaryValidateException
     */
    default void salaryValidate() {
        if (!checkSalaryGreaterAge()) {
            throw new SalaryValidateException("Зарплата меньше, чем возраст");
        }
        if (!salarySpecified()) {
            throw new SalaryValidateException("Зарплата не указана");
        }
    }
}