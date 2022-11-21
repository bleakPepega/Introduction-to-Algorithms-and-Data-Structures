package z_manager;


import java.util.Arrays;

final class Manager extends Employer {
    private final double averageSum;

    public final double getAverageSum() {
        return this.averageSum;
    }

    public int getEmployer() {
        return super.getEmployer() + (int)this.averageSum;
    }

    public Manager( String firstName,  String lastName, int workedDays) {
        super(firstName, lastName, workedDays);
        this.averageSum = 2222.0;
    }
}
// Employer.java

class Employer {
    private final int income;
    private final String firstName;
    private final String lastName;
    private final int workedDays;

    public final int getIncome() {
        return this.income;
    }

    public int getEmployer() {
        return this.workedDays > 15 ? this.income * 12 : this.income;
    }

    public final String getFirstName() {
        return this.firstName;
    }

    public final String getLastName() {
        return this.lastName;
    }

    public final int getWorkedDays() {
        return this.workedDays;
    }

    public Employer( String firstName,  String lastName, int workedDays) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.workedDays = workedDays;
        this.income = 1233;
    }
}
// FurnitureKt.java

public final class Main {
    public static final void main() {
        Employer employer = (Employer)(new Manager("qq", "qqqq", 8));
        Employer[] employers = (new Employer[]{new Employer("qw", "wq", 22), (Employer)(new Manager("qw", "w", 22))});
        Arrays.stream(employers).forEach(it -> System.out.println(it.getEmployer()));


    }

    // $FF: synthetic method
    public static void main(String[] var0) {
        main();
    }
}
