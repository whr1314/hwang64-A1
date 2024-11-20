public class GeneralPractitioner extends HealthProfessional {
    // Instance variable specific to General Practitioner
    private String clinicHours; // Clinic working hours for the General Practitioner

    // Default constructor
    public GeneralPractitioner() {
        super(); // Calls the default constructor of the base class
        this.clinicHours = ""; // Initializes clinicHours as an empty string
    }

    // Constructor to initialize all instance variables, including those in the base class
    public GeneralPractitioner(int id, String name, String department, String clinicHours) {
        super(id, name, department); // Calls the parameterized constructor of the base class
        this.clinicHours = clinicHours; // Initializes clinicHours with provided value
    }

    // Method to print details of the General Practitioner
    @Override
    public void printDetails() {
        super.printDetails(); // Calls the printDetails method of the base class
        System.out.println("Type: General Practitioner");
        System.out.println("Clinic Hours: " + clinicHours);
    }
}
