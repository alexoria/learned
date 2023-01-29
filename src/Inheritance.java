/*
Inheritance +encapsulation
 */

import java.util.Scanner;

public class Inheritance {
    private String male;
    private String name;
    private int age;

    private int head = 0; // 1 = yes (exist), 0 = none
    private int arms = 0; // 1 = yes (exist), 0 = none
    private int legs = 0; // 1 = yes (exist), 0 = none
    private int body = 0; // 1 = yes (exist), 0 = none


    // ******************************** SETTER'S
    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMale(String male) {
        this.male = male;
    }

    public void setHead(String head) {
        if (head == "yes") {
            this.head = 1;
        } else if (head == "no") {
            this.head = 0;
        }
    }

    public void setArms(String arms) {
        if (arms == "yes") {
            this.arms = 1;
        } else if (arms == "no") {
            this.arms = 0;
        }
    }

    public void setLegs(String legs) {
        if (legs == "yes") {
            this.legs = 1;
        } else if (legs == "no") {
            this.legs = 0;
        }
    }

    public void setBody(String body) {
        if (body == "yes") {
            this.body = 1;
        } else if (body == "no") {
            this.body = 0;
        }
    }

    // ******************************* GETTER'S
    public int getAge() {
        if (this.age < 0) {
            System.out.println("AGE CAN'T BE LESS THAN 0!");
        } else {
            System.out.println("Age is: " + this.age);
        }
        return this.age;
    }

    public String getName() {
        System.out.println("Name is: " + this.name);
        return this.name;
    }

    public String getMale() {
        if (this.male == "male") {
            System.out.println("Male is: male");
        } else if (this.male == "female") {
            System.out.println("Male is: female");
        }
        return this.male;
    }

    public int getHead() {
        if (this.head == 0) {
            System.out.println("Does he have head: no");
        } else if (this.head == 1) {
            System.out.println("Does he have head: yes");
        }
        return this.head;
    }

    public int getArms() {
        if (this.arms == 0) {
            System.out.println("Does he have arms: no");
        } else if (this.arms == 1) {
            System.out.println("Does he have arms: yes");
        }
        return this.arms;
    }

    public int getLegs() {
        if (this.legs == 0) {
            System.out.println("Does he have legs: no");
        } else if (this.legs == 1) {
            System.out.println("Does he have legs: yes");
        }
        return this.legs;
    }

    public int getBody() {
        if (this.body == 0) {
            System.out.println("Does he have body: no");
        } else if (this.body == 1) {
            System.out.println("Does he have body: yes");
        }
        return this.body;
    }
    // ****************************** END SETTER'S AND GETTER'S
}

class Alexoria extends Inheritance {
    public static void main(String[] args) {
        Inheritance alexoria = new Inheritance();
        alexoria.setName("Alexoria");
        alexoria.setAge(22);
        alexoria.setHead("yes");
        alexoria.getName();
        alexoria.getAge();
        alexoria.getHead();
        alexoria.getArms();

        /*
        Output will be:

        Name is: Alexoria
        Age is: 22
        Does he have head: yes
        Does he have arms: no

         */
    }
}