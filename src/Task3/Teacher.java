package Task3;

import java.util.ArrayList;

public class Teacher extends Person {
    public ArrayList<String> canTeach;
    public ArrayList<String> teacherCurrentCourses;


    public Teacher(String name, ArrayList<String> canTeach, ArrayList<String> currentCourses) {
        super(name);
        this.canTeach = canTeach;
        teacherCurrentCourses = currentCourses;
    }

    public boolean addCourse(String course) {
        if(canTeach.contains(course) && !teacherCurrentCourses.contains(course)) {
            System.out.println("You now teach " + course);
            return true;
        }
            return false;


    }

}
