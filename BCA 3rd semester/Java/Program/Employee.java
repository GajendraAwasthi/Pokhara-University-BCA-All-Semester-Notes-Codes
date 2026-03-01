class Employee {

    String name;
    String designation;
    double salary;

    Employee() {
        name = "Bibhu";
        designation = "CEO";
        salary = 1000000.0;
    }

    Employee(String name, String designation, double salary) {
        this.name = name;
        this.designation = designation;
        this.salary = salary;
    }

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Designation: " + designation);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {

        Employee emp1 = new Employee();
        Employee emp2 = new Employee("Bibhu", "CEO", 100000);

        emp1.displayInfo();
        emp2.displayInfo();
    }
}
