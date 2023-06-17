public class Student {
    private String name;
    private int id;
    private double feesPaid;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
        this.feesPaid = 0;
    }

    public void payFees(double amount) {
        feesPaid += amount;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getFeesPaid() {
        return feesPaid;
    }
}
