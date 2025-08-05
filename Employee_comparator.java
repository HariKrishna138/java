import java.util.*;
class Employee {
    int id;
    String name;
    int salary;

    public Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
   public String toString() {
        return "Employee " + id + " " + name + " " + salary;
   }
}

public class demo4 {
    public static void main(String[] args) {
        List<Employee> empList = new ArrayList<>();
        empList.add(new Employee(111,"ramu",26000));
        empList.add(new Employee(128,"raju",50000));
        empList.add(new Employee(102,"ramesh",35000));
        empList.add(new Employee(108,"ram",45000));
        empList.add(new Employee(114,"raghu",18000));
        Comparator<Employee> com =(o1,o2) -> (o1.salary>o2.salary)?1:-1;
        Collections.sort(empList, com);
        for (Employee emp : empList) {
            System.out.println(emp);
        }
    }
}
