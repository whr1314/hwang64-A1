public class Specialist extends HealthProfessional {
    // Instance variable specific to Specialist
    private String specialization; // Specialization field of the Specialist

    // Default constructor
    public Specialist() {
        super(); // Calls the default constructor of the base class
        this.specialization = ""; // Initializes specialization as an empty string
    }

    // Constructor to initialize all instance variables, including those in the base class
    public Specialist(int id, String name, String department, String specialization) {
        super(id, name, department); // Calls the parameterized constructor of the base class
        this.specialization = specialization; // Initializes specialization with provided value
    }

    // Method to print details of the Specialist
    @Override
    public void printDetails() {
        super.printDetails(); // Calls the printDetails method of the base class
        System.out.println("Type: Specialist");
        System.out.println("Specialization: " + specialization);
    }
}
