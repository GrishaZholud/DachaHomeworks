package zholud.homeworks.OOP;


public class Person {
    private String name;
    private int age;
    private int salary;
    private static String companyName;

    public Person(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    //region getter/setter


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    // endregion


    public void salaryValidate() {
        if (!checkSalaryGreaterAge()) {
            throw new SalaryValidateException("Зарплата меньше, чем возраст");
        }
        if (!existSalary()) {
            throw new SalaryValidateException("Зарплата не указана");
        }
    }

    public static String getCompanyName() {
        return companyName;
    }

    public static void setCompanyName(String companyName) {
        Person.companyName = companyName;
    }

    private boolean checkSalaryGreaterAge() {
        return salary >= age;
    }

    private boolean existSalary() {
        return salary > 0;
    }
}