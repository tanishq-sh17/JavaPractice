package JavaCodes.Practice;

public record EmployeeRecord(String name, double salary) {

    public EmployeeRecord {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Employee name must not be null or empty");
        }
        if (salary <= 0) {
            throw new IllegalArgumentException("Salary must be greater than zero");
        }
    }
}
