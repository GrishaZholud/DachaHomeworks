package zholud.homeworks.Interfaces;

public interface IdealCompany {
    /**
     * Метод принимает сотрудника на работу
     * @param name сотрудник, которого принмают на работу
     */
    void recruitWorker(Worker name);

    /**
     * Метод увольняет последнего сотрудника в команде
     */
    void dismissLastWorker();

    /**
     *Метод увольняет сотрудника
     * @param person сотрудник, которого увольняют
     */
    void dismissWorker(Worker person);

}