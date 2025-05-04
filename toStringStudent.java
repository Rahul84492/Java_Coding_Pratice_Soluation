class Student{
    String Name;
    int age;


    Student(String Name, int age) {
        this.Name = Name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student [Name=" + Name + ", age=" + age +"]";
    }
    public static void main(String[] args) {
        Student s = new Student("Rahul",24);
        System.out.println(s);
    }
}