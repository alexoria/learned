/*
Constructions
 */

public class Constructions {
    public static void main(String[] args) {
        JavaProgramer newMebmerAlexoria = new JavaProgramer("Alexoria ", 22); // Printing "Alexoria 22"
        JavaProgramer newMebmerMike = new JavaProgramer(); // Printing "Nothing"
        JavaProgramer newMemberSarah = new JavaProgramer("Sarah"); // Printing "Sarah"
        JavaProgramer newMemberAndrew = new JavaProgramer(32); // Printing "32"

    }
}

class JavaProgramer{
    public String name;
    public int age;

    public JavaProgramer(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println(name+age);
    }
    public JavaProgramer() {
        System.out.println("Nothing");
    }
    public JavaProgramer(String name) {
        this.name = name;
        System.out.println(name);
    }
    public JavaProgramer(int age) {
        this.age = age;
        System.out.println(age);
    }
}
