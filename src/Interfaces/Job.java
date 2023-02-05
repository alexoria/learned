package Interfaces;

public class Job implements Info {
    private String job;
    public void setJob(String job){
        this.job = job;
    }
    public void doesHeHaveJob(){
        if (this.job == "yes") {
            System.out.println("He has job");
        } else {
            System.out.println("He hasn't job");
        }
    }

    @Override
    public void showInfo() {
        doesHeHaveJob();
    }
}
