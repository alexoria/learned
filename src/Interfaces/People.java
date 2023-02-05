package Interfaces;

public class People implements Info {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    @Override
    public void showInfo() {
        System.out.println("name is : "+getName()+", age is: "+getAge());
    }
}
