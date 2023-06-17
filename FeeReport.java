public class FeeReport {
    public static void main(String[] args) {
        // Create student objects
        Student student1 = new Student("Soumyadip Paul", 1);
        Student student2 = new Student("Suman Kr. Panda", 2);

        // Pay fees for students
        student1.payFees(1000);
        student2.payFees(2000);

        // Print fee report
        System.out.println("Fee Report");
        System.out.println("-----------");
        System.out.println("Student Name: " + student1.getName());
        System.out.println("Student ID: " + student1.getId());
        System.out.println("Fees Paid: $" + student1.getFeesPaid());
        System.out.println("-----------");
        System.out.println("Student Name: " + student2.getName());
        System.out.println("Student ID: " + student2.getId());
        System.out.println("Fees Paid: $" + student2.getFeesPaid());
    }
}
