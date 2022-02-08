package zholud.homeworks.OOP;

public class SalaryValidateException extends IllegalArgumentException{
    public SalaryValidateException() {
    }

    public SalaryValidateException(String message) {
        super(message);
    }
}