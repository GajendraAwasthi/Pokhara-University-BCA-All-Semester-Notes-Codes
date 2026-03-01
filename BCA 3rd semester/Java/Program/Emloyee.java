

class Employee {
    String name ;
    String designation;
    double salary;
    Employee(){
          name="Bibhu Shrestha";
          designation=" Jugeda";
          salary =50000;
      }
      Employee(String name, String designation , double salary){
          this.name=name;
          this.designation=designation;
          this.salary=salary;
      }
      void displayInfo(){
          System.out.println(" Name:  " + name);
          System.out.println("Designation: " + designation);
          System.out.println(" salary : " +salary);
      }
      public static void main ( String...args){
           Employee emp1 = new Employee();
           Employee emp2 = new Employee( " Asmita"," Manager",20000);
           emp1.displayInfo();
           emp2.displayInfo();
      }
}
