package zholud.homeworks.Interfaces;


import java.util.Arrays;

public class Company implements IdealCompany {
    private Worker[] workers;
    private String name;

    public Company(String name) {
        this.name = name;
        this.workers = new Worker[0];
    }

    //region getter/setter

    public Worker[] getWorkers() {
        return workers;
    }

    public void setWorkers(Worker[] workers) {
        this.workers = workers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//endregion

    @Override
    public void recruitWorker(Worker name) {
        for (Worker worker : workers) {
            if (worker.equals(name)) {
                System.out.println("Такой работник уже есть в компании");
                return;
            }
        }
        workers = Arrays.copyOf(workers, workers.length + 1);
        workers[workers.length - 1] = name;
        name.setCompanyName(this.name);
    }


    @Override
    public void dismissLastWorker() {
        if (workers.length == 0) {
            return;
        }
        workers = Arrays.copyOf(workers, workers.length - 1);
    }

    @Override
    public void dismissWorker(Worker person) {
        for (int indexOldArray = 0; indexOldArray < workers.length; indexOldArray++) {
            if (workers[indexOldArray].equals(person)) {
                for (int indexNewArray = indexOldArray; indexNewArray < workers.length - 1; indexNewArray++) {
                    workers[indexNewArray] = workers[indexNewArray + 1];
                    workers[indexNewArray + 1] = null;
                }
                workers = Arrays.copyOf(workers, workers.length - 1);
                return;
            }
        }
        System.out.println("Такого работника нет в компании");
    }
}