
//Assignment 1:
// Create an Employee salary and bonous calculator using OOP approach
// data: name, salary and bonus of the employee
// method: add the salary and bonus and print the gross salary
 public class Employee {
    private String name;
    private double salary;
    private double bonus;

    public Employee(String name, double salary, double bonus) {
        this.name = name;
        this.salary = salary;
        this.bonus = bonus;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus; 									  //setter and getter methods for the data members of the class

    }

    public double calculateGrossSalary(){                          //method to calculate gross salary by adding salary and bonus

        return (this.salary + this.bonus);

    }

    public static void main(String[] args){                       //main method to test the program

        Employee emp1 = new Employee("Chuks", 12000, 2000);         //creating an object of the class and passing values to it's constructor

        System.out.println("Gross Salary of "+emp1.getName()+" is: "+emp1.calculateGrossSalary());     //printing the gross salary of the employee

    }
}

