public class HealthProfessional {
    // Instance variables
    private int id;            // ID of the health professional
    private String name;       // Name of the health professional
    private String department; // Department of the health professional

    // Default constructor
    public HealthProfessional() {
        id = 0; // Initialize to 0, indicating default ID
        name = ""; // Initialize as an empty string
        department = ""; // Initialize as an empty string
    }

    // Constructor to initialize all instance variables
    public HealthProfessional(int id, String name, String department) {
        this.setId(id); // Initialize the ID using the setter method
        this.setName(name);
        this.setDepartment(department);
    }

    // Setter methods
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    // Getter methods
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    // Method to print instance variables
    public void printDetails() {
        System.out.println("Health Professional Details:");
        System.out.println("ID: " + getId());
        System.out.println("Name: " + getName());
        System.out.println("Department: " + getDepartment());
    }
}
