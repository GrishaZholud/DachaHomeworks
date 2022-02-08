package zholud.homeworks.Abstracts;

public abstract class AbstractWorker implements Worker {
    private String name;
    private int age;
    private int salary;
    private String companyName;

    //region getter/setter
    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
    //endregion

    @Override
    public boolean checkSalaryGreaterAge() {
        return salary >= age;
    }

    @Override
    public boolean salarySpecified() {
        return salary > 0;
    }


}