public class employee {
    private String name;
    private int age;
    private double salary;
    public employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    String getEmployeeDetails(){
        return "EmployeeDetails: Name:"+name + ", Age" + age +", Salary:" + salary;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public double getSalary() {
        return salary;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public static void main(String[] args) {
        employee emp = new employee("Rahul ", 24, 45000);
        System.out.println(emp.getEmployeeDetails());
    }

}
