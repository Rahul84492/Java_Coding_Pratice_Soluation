import java.util.Comparator;
import java.util.PriorityQueue;

public class studentPriorityQueue {
    public static void main(String[] args) {
        
        PriorityQueue<Student> queue = new PriorityQueue<>(new Comparator<Student>() {
            public int compare(Student s1, Student s2) {
                return Character.compare(s1.getGrade(), s2.getGrade()); // clear comparison
            }
        });

        queue.offer(new Student("Rahul", 'A'));
        queue.offer(new Student("Vikash", 'B'));
        queue.offer(new Student("Abhishek", 'D'));
        queue.offer(new Student("Pushkar", 'C'));
        queue.offer(new Student("Nitin", 'B'));
        queue.offer(new Student("Dada", 'A'));

        
        System.out.println("Students in Priority Order:");
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }

    private static class Student {
        final String name;
        final char grade;

        public Student(String name, char grade) {
            this.name = name;
            this.grade = grade;
        }

        public String getName() {
            return name;
        }

        public char getGrade() {
            return grade;
        }

        @Override
        public String toString() {
            return "Student [name= " + name + ", grade= " + grade + "]";
        }
    }
}
