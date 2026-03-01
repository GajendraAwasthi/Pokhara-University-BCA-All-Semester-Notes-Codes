public class StudentGPA {
    public static void main(String[] args) {
        String[] names = {"Ram", "Rahim", "Shayam", "Sahim"};
        double[] gpa = {3.8, 3.4, 3.9, 3.6};
        System.out.println("Student Details:");
        System.out.println("Names:");
        for (String name : names) {
            System.out.println(name);
        }
        System.out.println("\n GPAs:");
        for (double grade : gpa) {
            System.out.println(grade);
        }
    }
}
