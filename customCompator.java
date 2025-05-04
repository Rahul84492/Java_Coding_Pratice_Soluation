

import java.util.*;


class CustomComparator implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        return Integer.compare(s1.age, s2.age);
    }
}


class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}


 class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Rahul", 24));
        students.add(new Student("Amit", 20));
        students.add(new Student("Sneha", 22));

        
        Collections.sort(students, new CustomComparator());

        
        for (Student s : students) {
            System.out.println(s.name + " " + s.age);
        }
    }
}
