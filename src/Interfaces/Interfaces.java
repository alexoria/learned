package Interfaces;

public class Interfaces {
    public static void main(String[] args) {
        People alexoria = new People();
        Job alexoriaJob = new Job();
        alexoriaJob.setJob("no");
        alexoria.setName("alexoria");
        alexoria.setAge(22);
        alexoria.showInfo();
        alexoriaJob.showInfo();
    }
}
