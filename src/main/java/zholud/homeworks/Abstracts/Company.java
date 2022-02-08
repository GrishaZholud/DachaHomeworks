package zholud.homeworks.Abstracts;

import java.util.ArrayList;

public class Company implements IdealCompany {
    private String name;
    private ArrayList<Worker> workers = new ArrayList<>();

    public Company(String name) {
        this.name = name;
    }

    //region getter/setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Worker> getWorkers() {
        return workers;
    }

    public void setWorkers(ArrayList<Worker> workers) {
        this.workers = workers;
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
        workers.add(name);
    }

    @Override
    public void dismissLastWorker() {
        workers.remove(workers.size() - 1);
    }


    @Override
    public void dismissWorker(Worker person) {
        for (int i = 0; i < workers.size(); i++) {
            if (workers.get(i).equals(person)) {
                workers.remove(person);
                break;
            }
            System.out.println("Такого работника нет в компании");
        }
    }


}