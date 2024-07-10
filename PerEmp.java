
class Person{
    String name;
    int age;

    void display(){
        System.out.println("Name =" + name + "\nAge = " + age);
    }
    
}
class Employee extends Person{
    String name;
    int age;
    int salary;

    @Override
    void display(){
        System.out.println("Name =" + name + "\nAge = " + age + "\nSalary =" + salary);
    }
}
public class PerEmp{
    public static void main(String args[]){
  
        Person obj1 = new Person();
        obj1.name = "Peter";
        obj1.age = 25;

        obj1.display();

        Employee obj2 = new Employee();
        obj2.name = "Parker";
        obj2.age = 24;
        obj2.salary = 10000;

        obj2.display();
    }
}


