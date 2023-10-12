package Task3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> passedCourses = new ArrayList<>();

        passedCourses.add("Matematik");

        ArrayList<String> currentCourses = new ArrayList<>();
        currentCourses.add("Fysik");

        Student student1 = new Student("Sinan", passedCourses, currentCourses);

        System.out.println(student1.addCourse("English"));

        ArrayList<String> canTeach = new ArrayList<>();
        canTeach.add("Dansk");

        ArrayList<String> teacherCurrentCourses = new ArrayList<>();
        teacherCurrentCourses.add("History");

        Teacher teacher1 = new Teacher("Signe", canTeach, teacherCurrentCourses);

        System.out.println(teacher1.addCourse("Dansk"));

        ArrayList<Person> person = new ArrayList<>();
        person.add(new Teacher("Jesper", new ArrayList<>(), new ArrayList<>()));
        person.add(new Student("Victor", new ArrayList<>(), new ArrayList<>()));
    }
}
